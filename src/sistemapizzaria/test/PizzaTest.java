package sistemapizzaria.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sistemapizzaria.Pizza;

class PizzaTest {
	Pizza pizza;
	
	@BeforeEach
	void instanciaPizza() {
		pizza = new Pizza();
		Pizza.zeraIngredientes();
	}
	
	@Test
	void testValorPizza() {
		pizza.adicionaIngrediente("Calabresa");
		pizza.adicionaIngrediente("Mussarela");
		assertEquals(15, pizza.getPreco());
	}
	
	@Test
	void testRegistroIngrediente() {
		pizza.adicionaIngrediente("Calabresa");
		assertEquals(true, pizza.getIngredientes().contains("Calabresa"));
		assertEquals(1, pizza.getQtdIngredientes());
		assertEquals(true, pizza.qtdIngredientesGastosTodasAsPizzas.containsKey("Calabresa"));
		assertEquals(1, pizza.qtdIngredientesGastosTodasAsPizzas.size());
	}
}
