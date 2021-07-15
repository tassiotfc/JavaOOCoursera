package jogopalavrasembaralhadas;

public class TresErros implements MecanicaDoJogo {
	private String palavraOriginal;
	private int pontos;
	private int qtdErros;
	
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
		if(palavra.equals(palavraOriginal)) {
			this.pontos++;
			return true;
		}
		qtdErros++;
		return false;
	}
	
	@Override
	public boolean jogoTerminou() {
		return this.qtdErros == 3 ? false : true;
	}
	
	@Override
	public void msgFimDeJogo() {
		String r = "----------RESULTADO FINAL------------ \n";
		if(this.pontos > 10) {
			r += "Boa! Você errou 3x somente apos 10 tentativas. \n";
		}
		else {
			r += "Você atingiu o número máximo de 3 erros." + "\n";
		}
		r += "Sua pontuação eh: " + this.pontos + "\n";
		System.out.println(r);
	}
}
