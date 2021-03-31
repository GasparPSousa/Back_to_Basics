package aula001_SaidaDeDados;

import java.util.Locale;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 32;
		double x = 10.35784;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
				
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x); // printf para indicar formatação
										// %.2f indica duas casas decimais e %n ou \n indica pular linha 
		System.out.printf("%.4f\n", x);
		Locale.setDefault(Locale.US);  // Para configurar o ponto decimal com ponto(.) e não com virgula(,) 
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f\n", x);
		
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x );

		
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha
		
	}

}
