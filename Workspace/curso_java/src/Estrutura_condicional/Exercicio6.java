package Estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		double number;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		number = sc.nextDouble();
		sc.close();
		
		if (number >= 0 && number <= 25) System.out.println("Intervalo [0, 25]");
		else if (number >= 25 && number <= 50) System.out.println("Interválo [25, 50]");
		else if (number >= 50 && number <= 75) System.out.println("Interválo [50, 75]");
		else if (number >= 75 && number <= 100) System.out.println("Interválo [75, 100]");
		else System.out.println("Fora do intervalo");
	}

}
