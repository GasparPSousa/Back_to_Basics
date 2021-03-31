package aula002_ProcessamentoDeDados;

import java.util.Locale;

public class Exemplo003_ComandosDeAtribuicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		Locale.setDefault(Locale.US); 
		
		System.out.printf("O Trapézio com base menor b = %.1f, base maior B = %.1f e altura h = %.1f tem área = %.1f", b, B, h, area);
	}

}
