package jogopalavrasembaralhadas;

public class FabricaMecanicaDoJogo {
	public MecanicaDoJogo getMecanicaDoJogo() {
		return new DezPalavras();
	}
}
