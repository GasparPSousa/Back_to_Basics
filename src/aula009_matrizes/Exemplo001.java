package aula009_matrizes;

import java.util.Scanner;

public class Exemplo001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M, N;
		int[][] matriz;
		
		
		M = sc.nextInt();
		N = sc.nextInt();
		
		matriz = new int[M][N];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		sc.close();
				

	}

}
