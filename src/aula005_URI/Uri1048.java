package aula005_URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1048 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double salario, percentualDeReajuste, novoSalario, reajusteGanho, emPercentual;
		
		salario = sc.nextDouble();
		
		percentualDeReajuste = 1;
		
		
		
		if (salario <= 400.00) {
			percentualDeReajuste = 0.15;
		}
		else if (salario <= 800.00) {
			percentualDeReajuste = 0.12;
		}
		else if (salario <= 1200.00) {
			percentualDeReajuste = 0.10;
		}
		else if (salario <= 2000.00) {
			percentualDeReajuste = 0.07;
		}
		else if (salario > 2000.00) {
			percentualDeReajuste = 0.04;
		}
		
		reajusteGanho = salario * percentualDeReajuste;
		novoSalario = salario + reajusteGanho;
		emPercentual = percentualDeReajuste * 100;

		
		System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %.0f %%%n",novoSalario, reajusteGanho, emPercentual);

		sc.close();

	}

}
