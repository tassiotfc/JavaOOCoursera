package sistemapizzaria;

public class PizzariaDemo {
	public static void main(String[] args) {
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Calabresa");
		pizza1.adicionaIngrediente("Mussarela");
		
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Calabresa");
		pizza2.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Frango");
		pizza2.adicionaIngrediente("Catupiri");
		
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("Palmito");
		pizza3.adicionaIngrediente("Mussarela");
		pizza3.adicionaIngrediente("Catupiri");
		pizza3.adicionaIngrediente("Tomate");
		pizza3.adicionaIngrediente("Parmessão");
		pizza3.adicionaIngrediente("Azeitona");
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adicionaPizza(pizza1);
		carrinhoDeCompras.adicionaPizza(pizza2);
		carrinhoDeCompras.adicionaPizza(pizza3);
		
		System.out.println("Valor Total de Pizzas no Carrinho: " + carrinhoDeCompras.getValorTodasAsPizzas());
		
		RelatorioIngredientesPizza.imprimeQtdIngredientes(Pizza.qtdIngredientesGastosTodasAsPizzas);
	}
}
