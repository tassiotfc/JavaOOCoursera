package sistemapizzaria;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Pizza {

	public static HashMap<String, Integer> qtdIngredientesGastosTodasAsPizzas = new HashMap<>();
	private List<String> ingredientes = new ArrayList<>();

	public void adicionaIngrediente(String ingrediente) {
		this.ingredientes.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}

	public static void contabilizaIngrediente(String ingrediente) {
		if(qtdIngredientesGastosTodasAsPizzas.containsKey(ingrediente)) {
			int value = qtdIngredientesGastosTodasAsPizzas.get(ingrediente);
			qtdIngredientesGastosTodasAsPizzas.put(ingrediente, value + 1);
		}
		else {			
			qtdIngredientesGastosTodasAsPizzas.put(ingrediente, 1);
		}
	}

	public float getPreco() {
		int qtdIngredientesDaPizza = ingredientes.size();
		if (qtdIngredientesDaPizza >= 0 && qtdIngredientesDaPizza <= 2)
			return 15f;
		else if (qtdIngredientesDaPizza >= 3 && qtdIngredientesDaPizza <= 5)
			return 20f;
		else if (qtdIngredientesDaPizza > 5)
			return 23f;

		throw new IllegalArgumentException("Oops..., a quantidade de ingredientes deve ser maior ou igual a zero");
	}
	
	public List<String> getIngredientes() {
		return this.ingredientes;
	}
	
	public int getQtdIngredientes() {
		return this.ingredientes.size();
	}
	
	public static void zeraIngredientes() {
		qtdIngredientesGastosTodasAsPizzas.clear();
	}
}
