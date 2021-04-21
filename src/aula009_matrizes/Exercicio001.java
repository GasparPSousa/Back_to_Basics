package aula009_matrizes;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		int[][] matrix;
		
		N = sc.nextInt();
		
		matrix = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(i == j) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
		System.out.println();
		
		int cont = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(matrix[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.printf("QUANTIDADE DE NEGATIVOS = %d%n", cont);
		
		sc.close();

	}

}
