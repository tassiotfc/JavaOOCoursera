package sistemapizzaria.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sistemapizzaria.CarrinhoDeCompras;
import sistemapizzaria.Pizza;

public class CarrinhoDeComprasTest {
	Pizza[] pizzas;
	CarrinhoDeCompras carrinhoDeCompras;
	@BeforeEach
	void criaPizzas() {
		pizzas = new Pizza[3];
		pizzas[0] = new Pizza();
		pizzas[1] = new Pizza();
		pizzas[2] = new Pizza();

		carrinhoDeCompras = new CarrinhoDeCompras();
	}
	
	@Test
	void testSomaPrecosPizzas() {
		pizzas[0].adicionaIngrediente("Parmesão");
		pizzas[0].adicionaIngrediente("Carne de Sol");
		
		pizzas[1].adicionaIngrediente("Calabresa");
		pizzas[1].adicionaIngrediente("Mussarela");
		pizzas[1].adicionaIngrediente("Frango");
		pizzas[1].adicionaIngrediente("Catupiri");
		
		pizzas[2].adicionaIngrediente("Palmito");
		pizzas[2].adicionaIngrediente("Mussarela");
		pizzas[2].adicionaIngrediente("Catupiri");
		pizzas[2].adicionaIngrediente("Tomate");
		pizzas[2].adicionaIngrediente("Parmessão");
		pizzas[2].adicionaIngrediente("Azeitona");
		
		carrinhoDeCompras.adicionaPizza(pizzas[0]);
		carrinhoDeCompras.adicionaPizza(pizzas[1]);
		carrinhoDeCompras.adicionaPizza(pizzas[2]);
		assertEquals(58, carrinhoDeCompras.getValorTodasAsPizzas());
	}
	
	@Test
	void testImpedimentoDeAddPizzaVazia() {
		carrinhoDeCompras.adicionaPizza(pizzas[0]);
		assertEquals(0, carrinhoDeCompras.getPizzas().size());
	}
}