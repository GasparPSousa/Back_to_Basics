package aula005_URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi;
		double raio;
		
		double area;

		pi = 3.14159;
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n", area);
		
		
		sc.close();
		
		
	}

}
