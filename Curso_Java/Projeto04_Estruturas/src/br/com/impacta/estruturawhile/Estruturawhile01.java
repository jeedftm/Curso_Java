package br.com.impacta.estruturawhile;

public class Estruturawhile01 {
	public static void main(String[] args) {
		int numero = (int) (Math.random () * 20);
		System.out.println("Random: " +numero);	
		while (numero <10) {
			System.out.println(numero ++);	
		}
		System.out.println("-- Fim do programa -- ");
	}
}
