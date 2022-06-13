package Estrutura_condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int initialHour, finalHour, gameTime;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números");
		initialHour = sc.nextInt();
		finalHour = sc.nextInt();
		
		sc.close();
		
		if (initialHour < finalHour) gameTime = finalHour - initialHour;
		else gameTime = 24 - initialHour + finalHour;
		
		System.out.println("O jogo durou " + gameTime + " horas");
	}

}
