package aula007_EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, soma, contador;
		double media;
		
		soma = 0;
		contador = 0;
		
		idade = sc.nextInt();
		
		while (idade >=0) {
			soma += idade;
			contador += 1;
			
			idade = sc.nextInt();
		}
		
		if (contador > 0) {
			media = (double) soma / contador;
			System.out.printf("%.2f%n", media);
		} else {
			System.out.println("Impossivel calcular");
		}
		
		sc.close();
		
	}

}
