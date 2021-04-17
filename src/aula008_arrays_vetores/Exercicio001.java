package aula008_arrays_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		int[] array;
		
		N = sc.nextInt();
		array = new int[N];
		
		for (int i = 0; i < N; i++) {
			
			array[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < N; i++) {
			
			if (array[i] < 0) {
				
				System.out.println(array[i]);
				
			}
		
		}
		
		
		sc.close();
		
		

	}

}
