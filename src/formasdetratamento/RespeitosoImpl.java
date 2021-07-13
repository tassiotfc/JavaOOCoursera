package formasdetratamento;

public class RespeitosoImpl implements FormatadorNome{
	
	private String pronomeTratamento;
		
	public RespeitosoImpl(String pronomeTratamento) {
		super();
		this.pronomeTratamento = pronomeTratamento;
	}


	@Override
	public String formatarNome(String nome, String sobreNome) {
		// TODO Auto-generated method stub
		return this.pronomeTratamento + " " + sobreNome;
	}
}
