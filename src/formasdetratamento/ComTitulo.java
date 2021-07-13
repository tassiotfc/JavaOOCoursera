package formasdetratamento;

public class ComTitulo implements FormatadorNome {

	private String titulo;
		
	public ComTitulo(String titulo) {
		super();
		this.titulo = titulo;
	}

	@Override
	public String formatarNome(String nome, String sobreNome) {
		// TODO Auto-generated method stub
		return this.titulo + " " + nome + " " + sobreNome;
	}
}
