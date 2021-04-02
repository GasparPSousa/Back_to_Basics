package aula004_FuncoesMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, quantidadeHorasTrabalhadas;
		double valorPorHoraTrabalhada, salario;
		
		numero = sc.nextInt();
		quantidadeHorasTrabalhadas = sc.nextInt();
		valorPorHoraTrabalhada = sc.nextDouble();
		
		salario = quantidadeHorasTrabalhadas * valorPorHoraTrabalhada;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
