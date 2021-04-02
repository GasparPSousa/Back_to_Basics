package aula005_URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi;
		
		pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTriangulo = (A * C) / 2.0;
		
		areaCirculo = pi * Math.pow(C, 2);
		
		areaTrapezio = ((A + B) * C) / 2.0;
		
		areaQuadrado = Math.pow(B, 2); 
		
		areaRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
		
		sc.close();
	}

}
