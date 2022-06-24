package Programacao_orientada_objetos.introducao;

import java.util.Locale;
import java.util.Scanner;

import Programacao_orientada_objetos.introducao.entities.Holder;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int accountNumber;
		String name;
		char answer;
		double initialAmount = 0.00;
		
		System.out.print("Enter account number: ");
		accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		name = sc.nextLine();
		Holder holder;
		
		System.out.print("is there an initial deposit (y/n)? ");
		answer = sc.next().charAt(0);

		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialAmount = sc.nextDouble();
			holder = new Holder(accountNumber, name, initialAmount);
		} else {
			holder = new Holder(accountNumber, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(holder);
		
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		holder.deposit(amount);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(holder);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		holder.withdraw(amount);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(holder);
		
		sc.close();
	}

}
