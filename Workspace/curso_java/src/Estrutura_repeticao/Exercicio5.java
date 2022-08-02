package Estrutura_repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, in = 0, out = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		number = sc.nextInt();
		
		for (int i = 0; i < number; i++) {
			System.out.println("Digite um número");
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.println("in " + in);
		System.out.println("out " + out);
		sc.close();
	}

}
