package br.com.xbrain.testexbrain;

import java.util.Objects;
import java.math.BigDecimal;

import lombok.Data;

import javax.persistence.ColumnResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Vendedor {

	private @Id @GeneratedValue Long id;
  
	private String nome;

	private BigDecimal vendasTotal = BigDecimal.valueOf(0);

	private BigDecimal vendasPeriodo = BigDecimal.valueOf(0);

}