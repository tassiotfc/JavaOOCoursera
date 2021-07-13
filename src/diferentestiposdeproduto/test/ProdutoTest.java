package diferentestiposdeproduto.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import diferentestiposdeproduto.Produto;

/*
 * 		ATENCAO AVALIADOR 
 * Testes realizados com JUnit 5
 */
public class ProdutoTest {
	Produto p1, p2;
	@BeforeEach
	void instanciaProduto() {
		p1 = new Produto("Notebook Acer", 1, 1500.f);
		p2 = new Produto("Notebook Acer", 1, 1500.f);
	}
	
	@Test
	void testInicializacaoDoProduto() {
		assertEquals("Notebook Acer", p1.getNome());
		assertEquals(1, p1.getCodigo());
		assertEquals(1500, p1.getPreco());
	}
	
	@Test
	void testComparacaoDeProdutos() {
		assertEquals(true, p1.equals(p2));
	}
}
