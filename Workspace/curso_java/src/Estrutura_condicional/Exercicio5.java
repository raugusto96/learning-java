package Estrutura_condicional;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		int codeItem, quantityItem;
		double totalPrice;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números");
		codeItem = sc.nextInt();
		quantityItem = sc.nextInt();
		
		sc.close();
		
//		If cases 
//		if (codeItem == 1) totalPrice = quantityItem * 4.00;
//		else if (codeItem == 2) totalPrice = quantityItem * 4.50;
//		else if (codeItem == 3) totalPrice = quantityItem * 5.00;
//		else if (codeItem == 4) totalPrice = quantityItem * 2.00;
//		else totalPrice = quantityItem * 1.50;
//		System.out.printf("Valor total: R$ %.2f%n", totalPrice);
		
//		Switch cases
		switch (codeItem) {
		case 1: {
			totalPrice = quantityItem * 4.00;
			System.out.printf("Valor total: R$ %.2f%n", totalPrice);
			break;
		}
		case 2: {
			totalPrice = quantityItem * 4.50;
			System.out.printf("Valor total: R$ %.2f%n", totalPrice);
			break;
		}
		case 3: {
			totalPrice = quantityItem * 5.00;
			System.out.printf("Valor total: R$ %.2f%n", totalPrice);
			break;
		}
		case 4: {
			totalPrice = quantityItem * 2.00;
			System.out.printf("Valor total: R$ %.2f%n", totalPrice);
			break;
		}
		case 5: {
			totalPrice = quantityItem * 1.50;
			System.out.printf("Valor total: R$ %.2f%n", totalPrice);
			break;
		}
		default:
			System.out.println("Código inválido");
			break;
		}
	}

}
