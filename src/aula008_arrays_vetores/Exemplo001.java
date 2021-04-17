package aula008_arrays_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo001 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double[] vetor;
		
		N = sc.nextInt();
		vetor = new double[N];
		
		for(int i = 0; i < N; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < N; i++) {
			System.out.printf("%.2f%n", vetor[i]);
		}
		
		sc.close();
		

	}

}
