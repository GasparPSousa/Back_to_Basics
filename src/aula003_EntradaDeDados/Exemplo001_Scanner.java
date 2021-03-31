package aula003_EntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo001_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		String x;
//		x = sc.next(); // Para ler APENAS uma string
//		System.out.println("Você digitou: " + x);
//		
//		int y;
//		y = sc.nextInt(); // Para ler um inteiro
//		System.out.println("Você digitou: " + y);
//		
//		double z;
//		
//		z = sc.nextDouble(); // Para ler um double
//		System.out.println("Você digitou: " + z);
//		
//		char p;
//		p = sc.next().charAt(0);
//		System.out.println("Você digitou: " + p);
		
//		String a;
//		int b;
//		double c;
//		// Para ler varios dados na mesma linha separados por espaço
//		a = sc.next(); 
//		b = sc.nextInt();
//		c = sc.nextDouble();
//		
//		System.out.println("Dados digitados: ");
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
//		String s1, s2, s3;
//		// Para ler um texto com várias palavras ATÉ A QUEBRA DA LINHA
//		s1 = sc.nextLine();
//		s2 = sc.nextLine();
//		s3 = sc.nextLine();
//		
//		System.out.println("Dados digitados: ");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
		
		int x;
		String s1, s2, s3;
		// ATENÇÃO PARA A QUEBRA DE LINHA PENDENTE
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
