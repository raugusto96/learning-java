package Estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int number;
		double media = 0.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		
		number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("Digite tr�s n�meros");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			media = (x * 2 + y * 3 + z * 5) / 10;
			System.out.printf("A m�dia �: %.1f%n", media);
		}
		sc.close();
	}

}
