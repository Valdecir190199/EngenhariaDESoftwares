package TecnologiasEmergentesJava7;

import java.util.Scanner;

public class SwitchComString {
	
	
	public static void main (String[]args){
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Digite a primeira e a segunda letra de algum  Sistema Operacional");
		String sigla = e.nextLine();
		
		switch (sigla) {
		
		case "wi":
		
			System.out.println("Windows");
		break;
		
		case "li":
			System.out.println("Linux");
			break;
				
				
		case "io":
			System.out.println("Iphone");
			break ;
			
		case "an":
			System.out.println("Android");
			break;
			
			
			default:
				System.out.println("Digitou errado perdeu");
		 
		}
		
		
	}
	

}
