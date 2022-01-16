import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/vendas")
class VendaController {

	@Autowired
	private VendaRepository repository;

	@GetMapping
	List<Venda> all() {
		return repository.findAll();
	}
}