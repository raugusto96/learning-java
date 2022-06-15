package Estrutura_repeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número entre 1 à 1000");
		
		number = sc.nextInt();
		
		for (int i = 0; i <= number; i++) {
			if (i % 2 != 0) {				
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
