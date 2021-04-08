package aula005_URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double preco, total;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		preco = 0;
		
		switch (codigo) {
		case 1:
			preco = 4.00;
			break;
		case 2:
			preco = 4.50;
			break;
		case 3:
			preco = 5.00;
			break;
		case 4:
			preco = 2.00;
			break;
		case 5:
			preco = 1.50;
			break;
		}

		total = quantidade * preco;
		
		System.out.printf("Total: R$ %.2f%n",total);
		
		sc.close();
		
	}

}
