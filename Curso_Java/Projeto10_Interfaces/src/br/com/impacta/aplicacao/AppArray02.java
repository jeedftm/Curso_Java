package br.com.impacta.aplicacao;

public class AppArray02 {

	public static void main(String[] args) {
		// Definir um Array de inteiros implicitamente.
		
		int [] numeros = {17,13,18,25,39,17};
		// Apresentar os dados do Array utilizando a
		// Estrutura for aprimorada 
		
		//Elemmento da coleção : Coleção
		for (int elemento : numeros) {
			System.out.println("elemento : " + elemento);
		}
	}

}
