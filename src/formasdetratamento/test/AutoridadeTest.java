package formasdetratamento.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import formasdetratamento.Autoridade;
import formasdetratamento.ComTitulo;
import formasdetratamento.InformalImpl;
import formasdetratamento.RespeitosoImpl;

class AutoridadeTest {
	Autoridade autoridade;
	@BeforeEach
	void instanciaAutoridade() {
		autoridade = new Autoridade("Pedro", "Augusto");
	}
	
	@Test
	void testTratamentoInformal() {
		InformalImpl informal = new InformalImpl();
		assertEquals("Pedro", autoridade.getTratamento(informal));
	}

	@Test
	void testTratamentoRespeitoso() {
		RespeitosoImpl respeitoso = new RespeitosoImpl("Sr.");
		assertEquals("Sr. Augusto", autoridade.getTratamento(respeitoso));
	}
	
	@Test
	void testTratamentoComTitulo() {
		ComTitulo comTitulo = new ComTitulo("Magnifico");
		assertEquals("Magnifico Pedro Augusto", autoridade.getTratamento(comTitulo));
	}
}
