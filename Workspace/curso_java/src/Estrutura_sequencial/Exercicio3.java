package Estrutura_sequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		int num4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quatro números para o cálculo");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		sc.close();
		
		int difference = num1 * num2 - num3 * num4;
		System.out.println("A diferença é: " + difference);
	}

}
