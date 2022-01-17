package br.com.xbrain.testexbrain;

import java.util.List;
import java.util.Date;

//import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

interface VendedorRepository extends JpaRepository<Vendedor, Long> {

	@Query(value = 
	"select "
		+ "b.id as id, "
		+ "b.nome as nome,"
		+ "sum(a.valor) as vendas_periodo,"
		+ "(select sum(c.valor) "
			+ "from venda c "
			+ "where c.vendedor_id = b.id "
			+ "group by c.vendedor_id "
			+ ") as vendas_total "
	+ "from venda a "
	+ "left join vendedor b on a.vendedor_id = b.id "
	+ "where a.data_hora >= :dataInicial and "
	+ "a.data_hora < :dataFinal "
	+ "group by a.vendedor_id ", 
	nativeQuery = true)
	List<Vendedor> somarVendas(@Param("dataInicial") Date dataInicio, @Param("dataFinal") Date dataFinal);
	
}