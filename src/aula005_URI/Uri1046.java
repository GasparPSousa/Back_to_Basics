package aula005_URI;

import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, tempo;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial > horaFinal || horaInicial == horaFinal) {
			tempo = (24 - horaInicial) + horaFinal;
			System.out.printf("O JOGO DUROU %d HORA(S)%n", tempo);
		} else {
			tempo = horaFinal - horaInicial;
			System.out.printf("O JOGO DUROU %d HORA(S)%n", tempo);;
		}
		
		sc.close();

	}

}
