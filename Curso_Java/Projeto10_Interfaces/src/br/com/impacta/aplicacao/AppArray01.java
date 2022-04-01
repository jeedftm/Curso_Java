package br.com.impacta.aplicacao;

public class AppArray01 {

	public static void main(String[] args) {
		//Definindo um Array de Inteiros = Parte 1
		int [] numeros = new int [5];
		//Atribuir valores individualmente
		numeros[0] = (int) (Math.random()*20);
		numeros[1] = (int) (Math.random()*10);;
		numeros[2] = (int) (Math.random()*-12);;
		numeros[3] = (int) (Math.random()*0);;
		numeros[4] = (int) (Math.random()*8);;
		
		
		for (int i = 0;  i < numeros.length;  i++) {
			System.out.println(numeros[i]);
		}
		
		for ( int i = numeros.length-1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}

	}

}
