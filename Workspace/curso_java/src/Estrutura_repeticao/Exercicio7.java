package Estrutura_repeticao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		number = sc.nextInt();
		double result;
		
		for (int i = 0; i < number; i++) {
			System.out.println("Digite dois números");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Divisão impossível");
			} else {
				result = x / y;
				System.out.println(result);
			}
		}
		sc.close();
		
	}

}
