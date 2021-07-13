package formasdetratamento;

public class Autoridade {
	private String nome;
	private String sobrenome;
	private FormatadorNome formatadorNome;
	
	public Autoridade(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getTratamento(FormatadorNome formatadorNome) {
		this.formatadorNome = formatadorNome;
		return this.formatadorNome.formatarNome(nome, sobrenome);
	}
}
