package aula002_ProcessamentoDeDados;

public class Exemplo005_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		int b;
		
		a = 5.0;
		//b = a; // Assim o compilador já da erro, pois ele percebe que você está perdendo informação
		b = (int) a; // Com essa Casting, vc avisa ao compilador que não se importa com as perdas de informações.
		
		System.out.println(b);
	}

}
