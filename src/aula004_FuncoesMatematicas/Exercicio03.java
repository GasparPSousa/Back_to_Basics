package aula004_FuncoesMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		int idade1, idade2;
		double media;
		
		nome1 = sc.next();
		idade1 = sc.nextInt();
		nome2 = sc.next();
		idade2 = sc.nextInt();
		
		media = (double) (idade1 + idade2) / 2 ;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos%n", nome1, nome2, media);
		
		
		

	}

}
