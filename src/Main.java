import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codeP1, codeP2, qtP1, qtP2;
		double priceP1, priceP2, totalPrice;
		
		codeP1 = sc.nextInt();
		qtP1 = sc.nextInt();
		priceP1 = sc.nextDouble();
		
		codeP2 = sc.nextInt();
		qtP2 = sc.nextInt();
		priceP2 = sc.nextDouble();
		
		totalPrice = qtP1 * priceP1 + qtP2 * priceP2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPrice);
		
		sc.close();
	}
}
