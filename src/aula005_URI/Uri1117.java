package aula005_URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1117 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		int contador;
		
		nota1 = 0;
		nota2 = 0;
		
		contador = 0;
		
		while (contador < 2) {
			
			nota1 = sc.nextDouble();
			
			while (nota1 < 0.0 || nota1 > 10.0) {
				System.out.println("nota invalida");
				nota1 = sc.nextDouble();
			} 
			
			contador = contador + 1;
			
			nota2 = sc.nextDouble();
			
			while (nota2 < 0.0 || nota2 > 10.0) {
				System.out.println("nota invalida");
				nota2 = sc.nextDouble();
			} 
			
			contador = contador + 1;
			
		}
		
		media = (nota1 + nota2) / 2;
		System.out.printf("media = %.2f%n", media);
				
		sc.close();
	}

}
