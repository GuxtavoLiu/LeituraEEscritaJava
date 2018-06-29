package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExemploTryWith {

	public static void main(String[] args) {

		try (Scanner e = new Scanner(new File("arquivo.txt"));
				PrintWriter writer = new PrintWriter(new File("testeEscrita.txt"))) { // cria o objeto writer que vai
																						// ser usado dentro de
																						// testeEscrita

			while (e.hasNext()) { // enquanto o scanner detectar uma outra linha dentro do arquivo arquivo.txt
									// executa {

				writer.println(e.nextLine()); // escrever dentro do testeEscrita

			}
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro");
		}

	}

}
