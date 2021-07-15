package jogopalavrasembaralhadas.test;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jogopalavrasembaralhadas.BancoDePalavras;

public class BancoDePalavrasTest {
	private BancoDePalavras bancoDePalavras;

	@BeforeEach
	void instanciaBandoDePalavras() {
		bancoDePalavras = new BancoDePalavras();
	}

	@Test
	void testLeituraDePalavras() {
		bancoDePalavras.imprimePalavras();
	}
	
	@Test
	void testLeituraDePalavraAleatoria() {
		assertNotNull(bancoDePalavras.getPalavraAleatoria());
	}
}
