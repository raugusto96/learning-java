import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int firstProductCode, firstProductQuantity, secondProductCode, secondProductQuantity;
		double firstProductUnitPrice, secondProductUnitPrice, totalPrice;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o c�digo, a quantidade e o pre�o unit�rio do primeiro produto");
		firstProductCode = sc.nextInt();
		firstProductQuantity = sc.nextInt();
		firstProductUnitPrice = sc.nextDouble();
		System.out.println("Digite o c�digo, a quantidade, e o pre�o unit�rio do segundo produto");
		secondProductCode = sc.nextInt();
		secondProductQuantity = sc.nextInt();
		secondProductUnitPrice = sc.nextDouble();
		sc.close();
		totalPrice = firstProductQuantity * firstProductUnitPrice + secondProductQuantity * secondProductUnitPrice;
		
		System.out.printf("O valor a pagar �: %.2f%n", totalPrice);
	}

}
