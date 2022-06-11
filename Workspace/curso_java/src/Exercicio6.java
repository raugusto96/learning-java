import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		double numA, numB, numC, triangle, square, circle, rectangle, trapeze, PI = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números");
		numA = sc.nextDouble();
		numB = sc.nextDouble();
		numC = sc.nextDouble();
		sc.close();
		
		triangle = numA * numC / 2;
		circle = PI * Math.pow(numC, 2);
		trapeze = (numA + numB) * numC / 2;
		square = Math.pow(numB, 2);
		rectangle = numA * numB;
		System.out.printf("Triangulo: %.3f%n", triangle);
		System.out.printf("Circulo: %.3f%n", circle);
		System.out.printf("Trapezio: %.3f%n", trapeze);
		System.out.printf("Quadrado: %.3f%n", square);
		System.out.printf("Retangulo: %.3f%n", rectangle);
	}

}
