package aula008_arrays_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		String[] nomes;
		int[] idades;
		double[] alturas;
		
		
		N = sc.nextInt();
		nomes = new String[N];
		idades = new int[N];
		alturas = new double[N];
		
		for(int i = 0; i < N; i++) {
			
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			alturas[i] = sc.nextDouble();
			
		}
		
		double soma = 0;
		
		for(int i = 0; i < N; i++) {
			
			soma = soma + alturas[i];
			
		}
		
		double media = soma / N;
		System.out.printf("Altura média: %.2f%n", media);
		
		
		int contador = 0;
		
		for(int i = 0; i < N; i++) {
			
			if(idades[i] < 16) {
				
				contador++;
			}
		}
		
		double percentualDePessoasAbaixoDe16Anos = (double) (contador * 100) / N;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualDePessoasAbaixoDe16Anos);
		
		sc.close();
		
		
	}

}
