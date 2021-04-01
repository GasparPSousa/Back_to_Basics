package aula004_FuncoesMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Definindo os tipos das variáveis
		double largura;
		double comprimento;
		
		double area;
		double precoDoMetroQuadrado;
		double precoDoTerreno;
		
		// Entrada de Dados
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		precoDoMetroQuadrado = sc.nextDouble();
		
		// Processamento de Dados
		area = largura * comprimento;
		precoDoTerreno = area * precoDoMetroQuadrado;
		
		// Saída de Dados
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", precoDoTerreno);
		
		
		sc.close();
		
	}

}
