package SistemaPizzaria;

import java.util.HashMap;
import java.util.Map;

public class RelatorioIngredientesPizza {
	public static void imprimeQtdIngredientes(HashMap<String, Integer> qtdIngredientes) {
		System.out.println("---------Quantidade utilizada de cada ingrediente---------");
		for(Map.Entry<String, Integer> entry: qtdIngredientes.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}