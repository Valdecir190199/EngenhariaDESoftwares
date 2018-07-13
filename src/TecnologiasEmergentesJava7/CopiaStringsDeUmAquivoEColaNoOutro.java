package TecnologiasEmergentesJava7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopiaStringsDeUmAquivoEColaNoOutro {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(new File("copia"));
				PrintWriter writer = new PrintWriter(new File("cola"))) {
			while (scanner.hasNext()) {
				writer.print(scanner.nextLine());
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}

	}

}
