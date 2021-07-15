package jogopalavrasembaralhadas;

public interface MecanicaDoJogo {
	public String gePalavraEmbaralhada();
	public boolean computaPalpite(String palavra);
	public boolean jogoTerminou();
	public void msgFimDeJogo();
}
