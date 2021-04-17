package aula008_arrays_vetores;

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		String[] nomes;
		
		N = sc.nextInt();
		nomes = new String[N];
		
		for(int i = 0; i < N; i++) {
			nomes[i] = sc.next();
		} 
		
		System.out.println("Nomes lidos:");
		// Sintaxe normal usando variável
//		for(int i = 0; i < N; i++) {
//			System.out.println(nomes[i]);
//		}
//		
		
		// Sintaxe For it usando "apelido"
		for (String apelido : nomes) {
			System.out.println(apelido);
		}
		
		sc.close();
	}

}
