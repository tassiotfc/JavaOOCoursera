package jogopalavrasembaralhadas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {
	private File file;

	public BancoDePalavras() {
		file = new File("palavras.txt");
		try (FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw);) {
			List<String> palavras = new ArrayList<>(
					Arrays.asList("casa", "carro", "avião", "futebol", "espelho", 
							"jogo", "paralelepipado", "esporte", "palio", "corolla",
							"pneu", "pente", "pistola", "arrodear", "olhar", 
							"avisar", "pedir", "inserir", "computação", "software"));
			for (String str : palavras) {
				bw.write(str);
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getPalavraAleatoria() {
		Random random = new Random();
		try (BufferedReader br = new BufferedReader(new FileReader(file));) {
			List<String> palavras = new ArrayList<>();
			String s = null;
			while ((s = br.readLine()) != null) {
				palavras.add(s);
			}
			int i = random.nextInt(palavras.size());
			return palavras.get(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void imprimePalavras() {
		try (BufferedReader br = new BufferedReader(new FileReader(file));) {
			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
