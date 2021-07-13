package diferentestiposdeproduto;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	private HashMap<Produto, Integer> compras = new HashMap<>();

	public boolean adicionaProduto(Produto p, int qtd) {
		if (compras.containsKey(p)) {
			int qtdNoCarrinho = compras.get(p);
			compras.put(p, qtdNoCarrinho + qtd);
			return true;
		}
		compras.put(p, qtd);
		return true;
	}

	public boolean removeProduto(Produto p, int qtd) {
		if (compras.containsKey(p)) {
			int qtdNoCarrinho = compras.get(p);
			if (qtd > 0) {
				if (qtd < qtdNoCarrinho) {
					compras.put(p, qtdNoCarrinho - qtd);
				} else if (qtd == qtdNoCarrinho) {
					compras.remove(p);
				} else {
					return false;
				}
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public float calculaValorTotalCompras() {
		float valorTotal = 0;
		for (Map.Entry<Produto, Integer> p : compras.entrySet()) {
			valorTotal += p.getKey().getPreco() * p.getValue();
		}
		return valorTotal;
	}

	public int getQtdProdutosNoCarrinho() {
		int qtdTotal = 0;
		for (Map.Entry<Produto, Integer> p : compras.entrySet()) {
			qtdTotal += p.getValue();
		}
		return qtdTotal;
	}

	public int qtdProdutosDiferentesNoCarrinho() {
		return compras.size();
	}
}