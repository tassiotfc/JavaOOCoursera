package jogopalavrasembaralhadas.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jogopalavrasembaralhadas.Embaralhador;
import jogopalavrasembaralhadas.InvertePalavra;

class InvertePalavraTest {
	Embaralhador invertePalavra;
	
	@BeforeEach
	void testInstanciaEmbaralhador() {
		invertePalavra = new InvertePalavra();
	}
	
	@Test
	void testEmbaralhar() {
		assertEquals("ordep", invertePalavra.embaralhar("pedro"));
	}

}
