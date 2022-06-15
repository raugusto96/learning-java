package Estrutura_repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int code, quantityAlcool = 0, quantityGasoline = 0, quantityDiesel = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um código de 1 à 4");
		code = sc.nextInt();
		
		while (code != 4) {
			switch (code) {
			case 1: {
				quantityAlcool += 1;
				System.out.println("Obrigado, voltando ao menu");
				System.out.println("Digite um código de 1 à 4");
				code = sc.nextInt();
				break;
			}
			case 2: {
				quantityGasoline += 1;
				System.out.println("Obrigado, voltando ao menu");
				System.out.println("Digite um código de 1 à 4");
				code = sc.nextInt();
				break;
			}
			case 3: {
				quantityDiesel += 1;
				System.out.println("Obrigado, voltando ao menu");
				System.out.println("Digite um código de 1 à 4");
				code = sc.nextInt();
				break;
			}
			default:
				System.out.println("Código inválido, digite um código de 1 à 4");
				code = sc.nextInt();
			}
		}
		System.out.println("Muito obrigado");
		System.out.println("Alcool: " + quantityAlcool);
		System.out.println("Gasolina: " + quantityGasoline);
		System.out.println("Diesel: " + quantityDiesel);
		sc.close();
	}

}
