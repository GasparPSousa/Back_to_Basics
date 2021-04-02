package aula005_URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoDaPeca1, codigoDaPeca2, numeroDaPeca1, numeroDaPeca2;
		double valorUnitarioDaPeca1, valorUnitarioDaPeca2;
		
		codigoDaPeca1 = sc.nextInt();
		numeroDaPeca1 = sc.nextInt();
		valorUnitarioDaPeca1 = sc.nextDouble();
		
		codigoDaPeca2 = sc.nextInt();
		numeroDaPeca2 = sc.nextInt();
		valorUnitarioDaPeca2 = sc.nextDouble();
		
		double valorAPagar = numeroDaPeca1 * valorUnitarioDaPeca1 + numeroDaPeca2 *  valorUnitarioDaPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);
		
		sc.close();
		
		
	}

}
