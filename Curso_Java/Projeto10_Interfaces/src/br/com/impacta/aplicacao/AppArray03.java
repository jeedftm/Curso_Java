package br.com.impacta.aplicacao;

public class AppArray03 {

	public static void main(String[] args) {
		//Quando declaramos e atriuimos um valor
		// New int [] se torna opcional
		int[] numeros = { 17, 13, 18, 25, 39, 17 };

		for (int elemento : numeros) {
			System.out.println("elemento : " + elemento);
		}
		//Vamos fazer o array numero, refereciar outro objeto
		
		numeros = new int [ ] {2,5,7,1,0};
		
		for (int elemento : numeros) {
			System.out.println("elemento : " + elemento);
		}
	}
}