package Programacao_orientada_objetos.introducao;

import java.util.Locale;
import java.util.Scanner;

import Programacao_orientada_objetos.introducao.entities.Rectangle;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height");
		System.out.print("Width: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Height: ");
		rectangle.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", rectangle.area());
		System.out.printf("Perimeter = %.2f%n", rectangle.perimeter());
		System.out.printf("Diagonal = %.2f%n", rectangle.diagonal());
	}

}
