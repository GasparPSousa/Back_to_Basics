package aula005_URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    double N;
		int cem, cinquenta, vinte, dez, cinco, dois;
		int restoCem, restoCinquenta, restoVinte, restoDez, restoCinco, restoDois;
		int um, cinquentaCents, vintecincoCents, dezCents, cincoCents, umCents;
		int restoUm, restocinquentaCents, restovintecincoCents, restodezCents;
		
		N = sc.nextDouble();
		
		cem = (int) (100 * N) / 10000;
		restoCem = (int) (100 * N + 0.5) % 10000;
		
		cinquenta = restoCem / 5000;
		restoCinquenta = restoCem % 5000;
		
		vinte = restoCinquenta / 2000;
		restoVinte = restoCinquenta % 2000;
		
		dez = restoVinte / 1000;
		restoDez = restoVinte % 1000;
		
		cinco = restoDez / 500;
		restoCinco = restoDez % 500;
		
		dois = restoCinco / 200;
		restoDois = restoCinco % 200;
		
		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00%n",cem);
		System.out.printf("%d nota(s) de R$ 50.00%n",cinquenta);
		System.out.printf("%d nota(s) de R$ 20.00%n",vinte);
		System.out.printf("%d nota(s) de R$ 10.00%n",dez);
		System.out.printf("%d nota(s) de R$ 5.00%n",cinco);
		System.out.printf("%d nota(s) de R$ 2.00%n",dois);
		
		
		//System.out.printf("%.0f nota(s)%n%.0f notas(s)%n%.0f notas(s)%n%.0f nota(s)%n%.0f nota(s)%n%.0f notas(s)%n", cem, cinquenta, vinte, dez, cinco, dois);
		
		
		um = restoDois / 100;
		restoUm = restoDois % 100;
		
		cinquentaCents = restoUm / 50;
		restocinquentaCents = restoUm % 50;
		
		vintecincoCents = restocinquentaCents / 25;
		restovintecincoCents = restocinquentaCents % 25;
		
		dezCents = restovintecincoCents / 10;
		restodezCents = restovintecincoCents % 10;
		
		cincoCents = restodezCents / 5;
		umCents = restodezCents % 5;
		
		
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ 1.00%n", um);
		System.out.printf("%d moeda(s) de R$ 0.50%n", cinquentaCents);
		System.out.printf("%d moeda(s) de R$ 0.25%n", vintecincoCents);
		System.out.printf("%d moeda(s) de R$ 0.10%n", dezCents);
		System.out.printf("%d moeda(s) de R$ 0.05%n", cincoCents);
		System.out.printf("%d moeda(s) de R$ 0.01%n", umCents);
		
		
		sc.close();
		
		
		
		

	}

}
