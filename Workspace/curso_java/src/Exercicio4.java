

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int employeeNumber, hours;
		double salaryPerHour, salary;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número do empregado");
		employeeNumber = sc.nextInt();
		System.out.println("Digite o salário por hora do empregado");
		salaryPerHour = sc.nextFloat();
		System.out.println("Digite as horas trabalhadas");
		hours = sc.nextInt();
		
		sc.close();
		
		salary = salaryPerHour * hours;
		System.out.println("O número do empregado é: " + employeeNumber);
		System.out.printf("O salário do empregado é: U$ %.2f%n", salary);
	}

}
