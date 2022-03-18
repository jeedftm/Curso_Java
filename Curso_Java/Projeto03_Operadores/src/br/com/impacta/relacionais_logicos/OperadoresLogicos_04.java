package br.com.impacta.relacionais_logicos;

public class OperadoresLogicos_04 {
	public static void main(String[] args) {
		int a = 10, b = 20;
								//F
		boolean b1 = (a > 10) &&  (--b > 0);  // || E
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("b1: " + b1);
	}
}

