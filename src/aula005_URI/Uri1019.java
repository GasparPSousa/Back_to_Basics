package aula005_URI;

import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, horas, minutos, segundos, restoHoras;
		
		N = sc.nextInt();
		
		horas = N / 3600;
		restoHoras = N % 3600;
		
		minutos = restoHoras / 60;
		segundos = restoHoras % 60;
		
	
		System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
		
		sc.close();
	}

}
