package aula006_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, notaFinal;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		notaFinal = (nota1 + nota2);
		
		System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		
		if (notaFinal < 60) {
			System.out.println("REPROVADO");
		}
		
		
//		if (notaFinal >= 60.00) {
//			System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
//		} else {
//			System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
//			System.out.println("REPROVADO");
//		}
		
		sc.close();

	}

}
