package br.com.xbrain.testexbrain;

import java.util.List;
import java.util.Date;

import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/vendedores")
class VendedorController {

	public static Logger logger = Logger.getLogger("global");

	@Autowired
	private VendedorRepository repository;

	@GetMapping
	public ResponseEntity<?> listarVendedores() {
		List<Vendedor> vendedores =  repository.findAll();
 		return new ResponseEntity<>(vendedores, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<?> criarVendedores(@RequestBody Vendedor request) {
		// Grava os dados do vendedor no banco de dados
        		Vendedor vendedor = repository.save(request);
        		return new ResponseEntity<>(vendedor, HttpStatus.OK);
	}

	@GetMapping("/vendas")
	public ResponseEntity<?> somarVendas(
		@RequestParam("dataInicial")
		@DateTimeFormat(pattern="dd/MM/yyyy") 
		LocalDateTime dataInicial,  
		@RequestParam("dataFinal")
		@DateTimeFormat(pattern="dd/MM/yyyy")
		LocalDateTime dataFinal) {

		dataInicial = dataInicial.minusDays(1);
		List<Vendedor> vendedores = repository.somarVendas(dataInicial, dataFinal);
		return new ResponseEntity<>(vendedores,  HttpStatus.OK);
	}

}	