package Estrutura_condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		sc.close();
		
		if (number1 % number2 == 0 || number2 % number1 == 0) System.out.println("São multiplos");
		else System.out.println("Não são multiplos");
	}

}
