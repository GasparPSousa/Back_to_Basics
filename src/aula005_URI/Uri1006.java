package aula005_URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, pA, pB, pC, media;
		
		pA = 2;
		pB = 3;
		pC = 5;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		media = (A * pA + B * pB + C * pC) / (pA + pB + pC);
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		sc.close();
	}

}
