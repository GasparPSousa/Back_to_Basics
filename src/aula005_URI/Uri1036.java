package aula005_URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1036 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, delta, R1, R2;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		
//		R1 = (-b + Math.sqrt(delta)) / (2 * a);
//		
//		R2 = (-b - Math.sqrt(delta)) / (2 * a);
//		
//		
//		if (a == 0 || delta < 0) {
//			System.out.println("Impossivel Calcular");
//		} else {
//			System.out.printf("R1 = %.5f%nR2 = %.5f%n", R1, R2);
//		}
		
		if (a == 0 || delta < 0) {
			
			System.out.println("Impossivel calcular");
			
		} else {
			
			R1 = (-b + Math.sqrt(delta)) / (2 * a);
			R2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.printf("R1 = %.5f%nR2 = %.5f%n", R1, R2);
			
		}
		
		sc.close();
		
	}

}
