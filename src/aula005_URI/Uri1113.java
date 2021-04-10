package aula005_URI;

import java.util.Scanner;

public class Uri1113 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
			if (y > x) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
			
		}

		sc.close();
	}

}
