package br.com.impacta.relacionais_logicos;

public class OperadoresRelacionais01 {
	public static void main(String[] args) {
		int a = 10, b = 20;
		boolean b1 = (a > 0);
		boolean b2 = (b >= a);
		System.out.println("valor de b: " + b);
		boolean b3 = (b++ == 20); 	// incremento depois será realizado por ultimo.
		System.out.println("valor de b: " + b);
		System.out.println("B3: " + b3);
		
		boolean b4 = (--a == 10);
		System.out.println("B4: " + b4);
		System.out.println("B4: " + b4);
		
	}
}
