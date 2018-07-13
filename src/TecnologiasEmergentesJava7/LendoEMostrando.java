package TecnologiasEmergentesJava7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LendoEMostrando {
	
	
	public static void main (String[]args){
		
		Scanner scanner = null;
		
		try {
		   scanner = new Scanner(new File("test"));
		   
		   while (scanner.hasNext()) {
			   
		       System.out.println(scanner.nextLine());
		   }
		   
		} catch (FileNotFoundException e) {
			
		   e.printStackTrace();
		   
		} finally {
			
			
		   if (scanner != null) {
			   
		       scanner.close();
		       
		   }
		}

	}

}
