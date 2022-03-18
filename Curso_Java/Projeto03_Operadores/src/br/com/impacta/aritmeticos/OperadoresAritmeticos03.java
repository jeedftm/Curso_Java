/*
 * Nessa classe apresentaremos os coneitos 
 * de operadores de atribuição reduzida
 * 
 * Tipos abaixo: 
 * 
 * +=
 * -=
 * *=
 * %=
 * 
 */
package br.com.impacta.aritmeticos;

public class OperadoresAritmeticos03 {
	public static void main(String[] args) {
		int a = 10,
			 b = 3;

		a *= 2; // a = 20
		b /= 3; // b = 1

		a += b; // a = 21

		b -= (a + 1); // b = -21

		a %= 2; // a = 1
		
		System.out.println("a = : " + a);
		System.out.println("b = : " + b);

	}
}
