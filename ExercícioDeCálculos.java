//Programa para realizar cálculos aritméticos básicos

import java.util.Scanner;

public class ExercícioDeCálculos {
	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	
	int numero1;
	int numero2;
	
	 
	System.out.println("Digite um número inteiro x: ");
	numero1 = leitor.nextInt();
	
	System.out.println("Digite um outro número inteiro y: ");
	numero2 = leitor.nextInt();
	
	System.out.println("x + y = "+ (numero1+numero2) );
	System.out.println("x - y = "+ (numero1-numero2) );
	System.out.println("x * y = "+ (numero1*numero2) );
	System.out.println("x / y = "+ (numero1/numero2) );
	System.out.println("x / y = "+ (numero1/ (double) numero2) );
	System.out.println("x % y = "+ (numero1%numero2) );
	
		
	}
}
