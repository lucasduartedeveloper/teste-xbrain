package br.com.xbrain.testexbrain;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/vendas")
class VendaController {

	public static Logger logger = Logger.getLogger("global");

	@Autowired
	private VendaRepository repository;

	@GetMapping
	public ResponseEntity<?> listarVendas() {
		List<Venda> vendas =  repository.findAll();
 		return new ResponseEntity<>(vendas, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<?> criarVendas(@RequestBody Venda request) {
		// Grava os dados da venda no banco de dados
        		Venda venda = repository.save(request);
        		return new ResponseEntity<>(venda, HttpStatus.OK);
	}
}	