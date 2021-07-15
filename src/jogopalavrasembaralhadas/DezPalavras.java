package jogopalavrasembaralhadas;

public class DezPalavras implements MecanicaDoJogo {
	private String palavraOriginal;
	private int pontos;
	private int qtdTentativas;
	
	@Override
	public String gePalavraEmbaralhada() {
		FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();
		BancoDePalavras bancoDePalavras = new BancoDePalavras();
		Embaralhador embaralhador = fabricaEmbaralhadores.getEmbaralhador();
		this.palavraOriginal  = bancoDePalavras.getPalavraAleatoria();
		return embaralhador.embaralhar(palavraOriginal);
	}

	@Override
	public boolean computaPalpite(String palavra) {
		this.qtdTentativas++;
		
		if(palavra.equals(palavraOriginal)) {
			this.pontos++;
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean jogoTerminou() {
		return this.qtdTentativas  == 10 ? false : true;
	}
	
	@Override
	public void msgFimDeJogo() {
		String r = "----------RESULTADO FINAL------------ \n";
		if(this.pontos == 10) {
			r += "Excelente! Você atingiu a pontuação máxima. \n";
		}
		r += "Sua pontuação eh: " + this.pontos + "\n";
		System.out.println(r);
	}

}
