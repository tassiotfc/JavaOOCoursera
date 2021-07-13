package diferentestiposdeproduto.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import diferentestiposdeproduto.CarrinhoDeCompras;
import diferentestiposdeproduto.ProdutoComTamanho;

/*
 * 		ATENCAO AVALIADOR 
 * Testes realizados com JUnit 5
 */
public class CarrinhoDeComprasTest {
	ProdutoComTamanho p1, p2;
	CarrinhoDeCompras cc;

	@BeforeEach
	void instanciaProdutoComTamanho() {
		p1 = new ProdutoComTamanho("Notebook Acer", 1, 1500.f, 1);
		p2 = new ProdutoComTamanho("Notebook Acer", 2, 2000.f, 1);
		cc = new CarrinhoDeCompras();
	}

	@Test
	void testAdicionaProduto() {
		assertEquals(true, cc.adicionaProduto(p1, 2));
		assertEquals(true, cc.adicionaProduto(p1, 2));
	}

	@Test
	void testQtdProdutosAddNoCarrinho() {
		cc.adicionaProduto(p1, 2);
		cc.adicionaProduto(p1, 2);
		assertEquals(4, cc.getQtdProdutosNoCarrinho());
	}

	@Test
	void testQtdProdutosDiferentesAddNoCarrinho() {
		cc.adicionaProduto(p1, 2);
		cc.adicionaProduto(p1, 2);
		assertEquals(1, cc.qtdProdutosDiferentesNoCarrinho());
	}

	@Test
	void testRemoveProduto() {
		cc.adicionaProduto(p1, 2);
		assertEquals(true, cc.removeProduto(p1, 1));
	}

	@Test
	void testRemoveProdutoCarrinhoVazio() {
		assertEquals(false, cc.removeProduto(p1, 2));
	}

	@Test
	void testRemoveProdutoQtdIndevida() {
		cc.adicionaProduto(p1, 2);
		assertAll(
				() -> assertEquals(false, cc.removeProduto(p1, -1)),
				() -> assertEquals(false, cc.removeProduto(p1, 3)),
				() -> assertEquals(false, cc.removeProduto(p1, 0)));
	}
	
	@Test
	void testCalculaValorTotal() {
		cc.adicionaProduto(p1, 4);
		cc.adicionaProduto(p2, 2);
		assertEquals(10000, cc.calculaValorTotalCompras());
	}
}
