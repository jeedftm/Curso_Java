package br.com.impactaincdec;

public class OperadoresIncrementais {
	public static void main(String[] args) {
		int numero = 10;
		System.out.println("numero: " + numero++);
		System.out.println("numero: " + numero++);
		System.out.println("numero: " + numero++);
		// Instrução (;)
		// Operação = operadores como --, +, ++

		int x = numero++;
		System.out.println();
		System.out.println("x: " + x);
		System.out.println("Numero: " + numero);

		x = ++numero;
		System.out.println("x: " + x);
	}
}
