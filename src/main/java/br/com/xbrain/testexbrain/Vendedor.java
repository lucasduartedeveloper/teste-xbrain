package br.com.xbrain.testexbrain;

import java.util.Objects;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Vendedor {

	private @Id @GeneratedValue Long id;
  
	private String nome;

}