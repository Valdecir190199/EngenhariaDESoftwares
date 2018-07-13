package TecnologiasEmergentesJava7;

import java.util.Scanner;

public class CapturandoMultiplasExcecoes {
	
	public static void main(String[]args){
		
	     Scanner entrada = new Scanner(System.in);
	        try {
	            int n1 = Integer.parseInt(entrada.nextLine());
	            int n2 = Integer.parseInt(entrada.nextLine());
	            int resultado = n1 / n2;
	            System.out.println(resultado);
	        } catch(NumberFormatException | ArithmeticException ex) {
	            System.out.println("Erro ao executar operação");
	            System.out.println();
	            ex.printStackTrace();
	        }
		
	}

}
