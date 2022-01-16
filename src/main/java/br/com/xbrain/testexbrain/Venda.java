package br.com.xbrain.testexbrain;

import lombok.Data;

import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@Entity
class Venda {

	private @Id @GeneratedValue Long id; 

	private String descricao;

	@OneToOne(fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
	private Vendedor vendedor;

	private BigDecimal valor;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "Brazil/East")
	private Date dataHora = new Date(); 

}