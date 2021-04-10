package aula005_URI;

import java.util.Scanner;

public class Uri1114 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha, senhaCorreta;
		
		senhaCorreta = 2002;
		
		senha = sc.nextInt();
		
		while (senha != senhaCorreta) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		} 
		
		System.out.println("Acesso Permitido");
		

		sc.close();
	}

}
