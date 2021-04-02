package aula004_FuncoesMatematicas;

import java.util.Scanner;

public class Uri1018 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		valor = sc.nextInt();
		
		int divisorCem = valor / 100;
		int restoCem = valor % 100;
		
		int divisorCinquenta = restoCem / 50;
		int restoCinquenta = restoCem % 50;
		
		int divisorVinte = restoCinquenta / 20;
		int restoVinte = restoCinquenta % 20;
		
		int divisorDez = restoVinte / 10;
		int restoDez = restoVinte % 10;
		
		int divisorCinco = restoDez / 5;
		int restoCinco = restoDez % 5;
		
		int divisorDois = restoCinco / 2;
		int restoDois = restoCinco % 2;
		
		int divisorUm = restoDois / 1;
	
		
		System.out.printf("%d notas(s) de R$ 100,00%n%d notas(s) de R$ 50,00%n%d notas(s) "
				+ "de R$ 20,00%n%d notas(s) de R$ 10,00%n%d notas(s) de R$ 5,00%n%d notas(s) de R$ 2,00%n%d notas(s) de R$ 1,00%n"
				, divisorCem, divisorCinquenta, divisorVinte, divisorDez, divisorCinco, divisorDois, divisorUm);
	

		sc.close();
	}

}
