package aula005_URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, pA, pB, media;
		
		pA = 3.5;
		pB = 7.5;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		media = (A * pA + B * pB) / (pA + pB);
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		sc.close();

	}

}
