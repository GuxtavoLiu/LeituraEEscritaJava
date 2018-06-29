package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		try (Scanner e = new Scanner(new File("Ex.txt"))) { // le um arquivo

			double resultado = 0;

			ArrayList numeros = new ArrayList();

			while (e.hasNext()) {
				numeros.add(e.nextLine());
			}
			System.out.println("Escolha o que deseja fazer");
			System.out.println("+");
			System.out.println("*");
			String opcao = scanner.nextLine();

			switch (opcao) {
			case "+":

				for (int i = 0; i < numeros.size(); i++) {
					resultado = resultado + Double.parseDouble(numeros.get(i).toString());

				}
				resultado = resultado / numeros.size();
				System.out.println(resultado);
				break;
			case "*":
				double produto = 1;
				double mediaGeometrica = 0;
				for (int i = 0; i < numeros.size(); i++) {
					produto = produto * Double.parseDouble(numeros.get(i).toString());
				}

				mediaGeometrica = Math.pow(produto, 1.0 / numeros.size());
				System.out.println(mediaGeometrica);

				System.out.println("O que deseja fazer?");
				System.out.println("\"A\" para imprimir na tela;");
				System.out.println("\"B\" para gravar no arquivo \"resultado.txt\";");
				System.out.println("\"C\" para ambas opções acima.");
				String opcaoAcao = scanner.nextLine();

				if (opcaoAcao.equals("A")) {
					System.out.println(mediaGeometrica);

				}

				else if (opcaoAcao.equals("B")) {

					try (PrintWriter writer = new PrintWriter(new File("Resultado.txt"))) {
						writer.print(mediaGeometrica);
					} catch (FileNotFoundException excecao) {
						System.out.println("Ocorreu um erro");
					}
				}

				else if (opcaoAcao.equals("C")) {
					try (PrintWriter writer = new PrintWriter(new File("Resultado.txt"))) {
						writer.print(mediaGeometrica);
					} catch (FileNotFoundException excecao) {
						System.out.println("Ocorreu um erro");
					}
					System.out.println(mediaGeometrica);
				} else {
					System.out.println("Deu ruim");
				}
				break;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro");
		}

	}

}
