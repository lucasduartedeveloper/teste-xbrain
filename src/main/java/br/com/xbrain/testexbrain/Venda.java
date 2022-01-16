import java.util.Objects;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.math.BigDecimal;
import java.sql.Time;

@Data
@Entity
class Venda {

  private @Id @GeneratedValue Long id;

  private Time dataHora;

  private BigDecimal valor;

}