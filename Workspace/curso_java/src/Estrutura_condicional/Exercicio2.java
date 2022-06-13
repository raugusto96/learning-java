package Estrutura_condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		number = sc.nextInt();
		sc.close();
		
		if (number % 2 == 0) System.out.println("Par");
		else System.out.println("Impar");
	}

}
