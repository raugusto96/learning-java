package Estrutura_repeticao;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int password;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha");
		password = sc.nextInt();
			
		
		while (password != 2002) {
			System.out.println("Senha inválida");
			password = sc.nextInt();
		}
		
		sc.close();
		System.out.println("Acesso permitido");
	}
}
