package jogopalavrasembaralhadas;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		MecanicaDoJogo mecanicaDoJogo = new FabricaMecanicaDoJogo().getMecanicaDoJogo();
		Scanner leitura = new Scanner(System.in);
		String palavra;
		do {
			System.out.println("Que palavra eh esta: " + mecanicaDoJogo.gePalavraEmbaralhada() + " ?");
			palavra = leitura.next();
			if(mecanicaDoJogo.computaPalpite(palavra)) {
				System.out.println("Correto");
			}
			else {
				System.out.println("Errado");
			}

		}while(mecanicaDoJogo.jogoTerminou());
		mecanicaDoJogo.msgFimDeJogo();
	}
}