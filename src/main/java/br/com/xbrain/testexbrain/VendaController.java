import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/vendas")
class VendaController {

	@Autowired
	private VendaRepository repository;

	@GetMapping
	public ResponseEntity<?> listarVendas() {
		List<Venda> vendas=  repository.findAll();
 		return new ResponseEntity<>(vendas, HttpStatus.OK);
	}
}