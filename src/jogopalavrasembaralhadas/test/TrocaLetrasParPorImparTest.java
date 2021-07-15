package jogopalavrasembaralhadas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jogopalavrasembaralhadas.Embaralhador;
import jogopalavrasembaralhadas.TrocaLetrasParPorImpar;

public class TrocaLetrasParPorImparTest {
	Embaralhador trocaLetras;
	@BeforeEach
	void instanciaTrocaLetrasParPorImpar() {
		trocaLetras = new TrocaLetrasParPorImpar();
	}
	
	@Test
	void testEmbaralhar() {
		assertEquals("eprd", trocaLetras.embaralhar("pedr"));
	}
}
