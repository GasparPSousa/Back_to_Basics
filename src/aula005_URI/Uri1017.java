package aula005_URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double consumoKmPorLitro = 12;
		
		int tempoGastoNaViajem = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		
		double quantidadeDeLitros = (velocidadeMedia * tempoGastoNaViajem) / consumoKmPorLitro;
		
		System.out.printf("%.3f%n", quantidadeDeLitros);
		
		
		sc.close();

	}

}
