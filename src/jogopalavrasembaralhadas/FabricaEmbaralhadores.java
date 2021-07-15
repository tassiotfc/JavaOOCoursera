package jogopalavrasembaralhadas;

import java.util.Random;

public class FabricaEmbaralhadores {
	public Embaralhador getEmbaralhador() {
		Random random = new Random();
		int r = random.nextInt(2) + 1;
		if(r == 1)
			return new InvertePalavra();
		else 
			return new TrocaLetrasParPorImpar();
	}
}
