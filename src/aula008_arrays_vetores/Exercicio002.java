package aula008_arrays_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double[] array;
		double soma, media;
		
		N = sc.nextInt();
		array = new double[N];
		
		for(int i = 0; i < N; i++) {
			
			array[i] = sc.nextDouble();
		}
		
		soma = 0;
		media = 0;
		
		for(int i = 0; i < N; i++) {
			
			System.out.printf("%.1f ", array[i]);
			soma = soma + array[i];
			media = soma / (i+1);
			
		}
		
		System.out.println();
		
		System.out.printf("%.2f%n", soma);
		System.out.printf("%.2f%n", media);
		
		
		sc.close();
	}

}
