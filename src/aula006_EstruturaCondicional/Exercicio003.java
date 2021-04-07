package aula006_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, menor;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a < b) {
			menor = a;
		} else 
			menor = b;
		
		if (c < menor) {
			menor = c;
		}
		
		System.out.println("MENOR = " + menor);
		
		
//		if (a < b && a < c) {
//			System.out.println("MENOR = " + a);
//		}
//		else if (b < c){
//			System.out.println("MENOR = " + b);
//		}
//		else {
//			System.out.println("MENOR = " + c);
//		}
		
		sc.close();
		

	}

}
