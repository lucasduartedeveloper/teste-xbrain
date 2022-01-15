import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Vendedor {

  private @Id @GeneratedValue Long id;
  private DateTime dataHora;
  private Decimal valor;

  Vendedor() {}

  Vendedor(Decimal valor) {

  }

  public Long getId() {
    return this.id;
  }

  @Override
  public boolean equals(Object o) {
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.role);
  }

  @Override
  public String toString() {
    return "Venda{}";
  }
}