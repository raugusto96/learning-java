package Estrutura_sequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números");
		x = sc.nextInt();
		y = sc.nextInt();
		
		sc.close();
		int z = x + y;
		System.out.println("A soma de " + x + " + " + y + " = " + z);
	}

}
