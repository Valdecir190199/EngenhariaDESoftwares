package TecnologiasEmergentesJava7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LendoArquivoEImprimindo {

	public static void main (String[] args){
		
		
		
		try (Scanner scanner = new Scanner(new File("test")))
		{	
		
		   while (scanner.hasNext()) {
			   
		       System.out.println(scanner.nextLine()); //Lendo Arquivo e Imprimindo
		       
		   }
		   
		} catch (FileNotFoundException e) {
			
		   e.printStackTrace();
		   
		} 
		}

		
	}
	
		

