package Estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um salário");
		double salary = sc.nextDouble();
		
		sc.close();
		
		double injury;
		if (salary <= 2000.00) injury = 0.0;
		else if (salary <= 3000.00) injury = (salary - 2000.0) * 0.08;
		else if (salary <= 4500.00) injury = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
		else injury = (salary - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		
		if (injury == 0) System.out.println("Isento");
		else System.out.printf("R$ %.2f%n", injury);
	}

}
