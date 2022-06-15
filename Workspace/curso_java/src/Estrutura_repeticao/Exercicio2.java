package Estrutura_repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite duas coordenadas");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");	
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}

}
