package Estrutura_condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		number = sc.nextInt();
		
		sc.close();
		
		if (number > 0) System.out.println("N�mero positivo");
		else System.out.println("N�mero negativo");
	}

}
