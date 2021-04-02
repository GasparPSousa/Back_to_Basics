package aula005_URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X;
		double Y;
		
		X = sc.nextInt();
		Y = sc.nextDouble();
		
		double consumoMedio = X / Y;
		
		System.out.printf("%.3f km/l%n", consumoMedio);
		
		sc.close();

	}

}
