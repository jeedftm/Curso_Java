package br.com.impacta.relacionais_logicos;

public class OperadoresLogicos02 {
	public static void main(String[] args) {
		int a = 10, b = 20;
		// a primeir aperacao é TRUE
		//o codigo vai continuar sem comprarar outras condicoes
		boolean b1 = (a >= 10) || (--b > 0);  // || OU
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("b1: " + b1);
	}
}
