package TecnologiasEmergentesJava7;

import java.util.Scanner;

public class SwitchComInt {

	public static void main(String[]args){
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Digite um numero >=0 ou <=2");
		int numero = e.nextInt();
		
		switch(numero){
		
		case 0:
			System.out.println("1");
			break;
			
		case 1:
			System.out.println("2");
			break;
			
			
		case 2:
		System.out.println("3");
		break;
		
		default:
			System.out.println("Numero Errado");
		
		}
		
		
		
		
		
		
		
	}

}
