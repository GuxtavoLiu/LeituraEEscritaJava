package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		ArrayList<Double> numeros = new ArrayList();

		try (Scanner e = new Scanner(new File("double.txt"))) { // le um arquivo

			while (e.hasNext()) { // Enquanto double.txt tiver uma linha a mais executar

				double linha = e.nextDouble(); // caputura a linha que esta sendo trabalhada no momento na variavel
												// linha
				numeros.add(linha); // adiciona a variavel double linha no arraylist 'numeros'

			}
			for (int i = 0; i < numeros.size(); i++) { // enquanto i for menor que o tamanho do arraylist numeros
														// executar {
				System.out.println(numeros.get(i));// imprime o index de numeros segundo i

			}
		} catch (FileNotFoundException e) { // caso nao encontre o arquivo
			System.out.println("Ocorreu um erro");
		}

	}

}
