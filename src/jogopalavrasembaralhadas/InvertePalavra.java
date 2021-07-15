package jogopalavrasembaralhadas;

public class InvertePalavra implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		StringBuilder stringBuilder = new StringBuilder(palavra);
		return stringBuilder.reverse().toString();
	}

}
