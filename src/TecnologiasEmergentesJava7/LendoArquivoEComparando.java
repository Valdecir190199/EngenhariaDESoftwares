package TecnologiasEmergentesJava7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivoEComparando {

	public static void main(String[] args) {

		Scanner en = new Scanner(System.in);

		try  (BufferedReader  br = new BufferedReader(new FileReader("testing")))
		
		
			 {

			System.out.println("Digite Ola");
			
			String line = en.nextLine();
			
			while ((line = br.readLine()) != null) {
				
				System.out.println("Igual");
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		finally {
			try (BufferedReader bra = new BufferedReader(new FileReader("testing")))

			{
				if (bra != null)
					
					bra.close();
				
					System.out.println("Sucesso");
				
				
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}

	}
}
