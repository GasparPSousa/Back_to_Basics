package aula005_URI;

import java.util.Scanner;

public class Uri1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, anos, meses, dias, restoAnos;
		
		N = sc.nextInt();
		
		anos = N / 365;
		restoAnos = N % 365;
		
		meses = restoAnos / 30;
		dias = restoAnos % 30;
		
		System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", anos, meses, dias);
		
		sc.close();

	}

}
