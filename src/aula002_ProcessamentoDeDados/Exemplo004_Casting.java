package aula002_ProcessamentoDeDados;

public class Exemplo004_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		double resultado;
		double resultado1;
		
		a = 5;
		b = 2;
		
		resultado = a / b;  // a e b são inteiros, logo o resultado será inteiro
		
		System.out.println(resultado);
		
		resultado1 = (double) a / b; // Casting é a conversão explícita de tipos de dados
		
		System.out.println(resultado1);
	}

}
