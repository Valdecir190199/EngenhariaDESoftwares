package TecnologiasEmergentesJava7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LendoArquivoComWhile {
	
	
	public static void main(String[]args){
		
		
		   try (BufferedReader br = new BufferedReader(new FileReader("while")))
	        {
	            String line ="x";
	            while ((line = br.readLine()) != null) {
	                System.out.println("Sucesso");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}

}
