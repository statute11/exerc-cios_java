//Programa para leitura e armazenamento de dados básicos de um usuário

import java.util.Scanner;

public class ExercicioLeituraDeDados {
	public static void main(String[] args) {
		
		String nome;
		String cidade;
		int idade;
		
		
		Scanner leitor = new Scanner(System.in);
				
		System.out.println("Digite seu nome: ");
		nome = leitor.next();
		
		System.out.println("Boas vindas, "+nome);
		
		System.out.println("Digite sua idade: ");
		idade = leitor.nextInt();
	
		System.out.println("Digite o nome de sua cidade: ");
		cidade = leitor.next();
		
		System.out.println("Nome digitado: "+nome);
		System.out.println("idade digitada: "+idade);
		System.out.println("Nome da cidade digitada: "+cidade);
			
	}
	
	
}
