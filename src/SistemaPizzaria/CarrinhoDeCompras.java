package SistemaPizzaria;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Pizza> pizzas = new ArrayList<Pizza>();

	public void adicionaPizza(Pizza pizza) {
		if (pizza.getIngredientes() == null) {
			System.out.println("Oops..., pizza sem ingrediente!");
		} else {
			pizzas.add(pizza);
		}
	}

	public float getValorTodasAsPizzas() {
		try {
			float valorTotalPizzas = 0;
			for (Pizza pizza : pizzas) {
				valorTotalPizzas += pizza.getPreco();
			}
			return valorTotalPizzas;
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Oops..., tem alguma pizza com valor invalido");
		}
	}
}
