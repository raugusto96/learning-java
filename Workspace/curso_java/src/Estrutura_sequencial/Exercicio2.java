import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double PI = 3.14159;
		double raio;
		double area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do c�rculo");
		raio = sc.nextDouble();
		sc.close();
		area = PI * Math.pow(raio, 2);
		System.out.println("A �rea do c�rculo �: " + area);
	}

}
