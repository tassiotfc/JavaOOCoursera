package diferentestiposdeproduto;

public class ProdutoComTamanho extends Produto{
	private int tamanho;
	
	public ProdutoComTamanho(String nome, int codigo, float preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}
		
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + super.getCodigo();
		result = prime * result + tamanho;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if (super.getCodigo() != other.getCodigo())
			return false;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}

}
