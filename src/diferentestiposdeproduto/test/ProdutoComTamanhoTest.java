package diferentestiposdeproduto.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import diferentestiposdeproduto.Produto;
import diferentestiposdeproduto.ProdutoComTamanho;

/*
 * 		ATENCAO AVALIADOR 
 * Testes realizados com JUnit 5
 */
public class ProdutoComTamanhoTest {
	Produto p1, p2;
	@BeforeEach
	void instanciaProdutoComTamanho() {
		p1 = new ProdutoComTamanho("Notebook Acer", 1, 1500.f, 1);
		p2 = new ProdutoComTamanho("Notebook Acer", 1, 1500.f, 1);
	}
	
	@Test
	void testProdutosIguais() {
		assertEquals(true, p1.equals(p2));
	}
	
	@Test
	void testProdutosDiferentes() {
		Produto p3 = new ProdutoComTamanho("Notebook Acer", 3, 1500.f, 1);
		assertEquals(false, p1.equals(p3));
	}
}
