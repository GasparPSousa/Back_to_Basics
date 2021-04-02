package aula005_URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salarioFixo, totalVendasEfetuadasNoMes, comissao, salarioTotal;
		
		comissao = 0.15;
		
		nome = sc.next();
		salarioFixo = sc.nextDouble();
		totalVendasEfetuadasNoMes = sc.nextDouble();
		
		salarioTotal  = salarioFixo + totalVendasEfetuadasNoMes * comissao;
		
		System.out.printf("TOTAL = R$ %.2f%n",salarioTotal);
		
		sc.close();
		
	}

}
