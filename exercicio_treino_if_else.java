package exercicio_if_else;

import java.util.Scanner;

public class exercicio_treino_if_else {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String nome1, nome2;
		int idade1,idade2;
		
		System.out.print("Digite o nome da primeira pessoa: ");
		nome1 = leitor.next();
		
		System.out.print("Digite o nome da segunda pessoa: ");
		nome2 = leitor.next();
		
		System.out.print("Digite a idade da primeira pessoa: ");
		idade1 = leitor.nextInt();
		
		System.out.print("Digite a idade da segunda pessoa: ");
		idade2 = leitor.nextInt();
		
		if ( idade1 > idade2 ) 
			System.out.print(nome1+ " é mais velho");
			
		else if ( idade2 > idade1 )
			System.out.print(nome2+ " é mais velho");
		
		else 
			System.out.print("Mesma idade");
		
		
			
		
		
		
		
			
		
			}
	
	}	
		

		
		
		
		
			
		
				
		

	


