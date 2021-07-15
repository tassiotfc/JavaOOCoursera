package jogopalavrasembaralhadas;

public class TrocaLetrasParPorImpar implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		StringBuilder stringBuilder = new StringBuilder(palavra);
		for(int i = 0; i <= palavra.length()/2; i = i + 2) {
			char cAux = stringBuilder.charAt(i);
			stringBuilder.setCharAt(i, stringBuilder.charAt(i + 1));
			stringBuilder.setCharAt(i + 1, cAux);
		}
		return stringBuilder.toString();
	}
}
