package br.com.impacta.aritmeticos;

public class OperadoresAritmeticos02 {
	public static void main(String[] args) {
		int a = 10, b = 3, c = 5;

		double d1 = 10,  d2 = 3;
		double div1 = d1 / d2;

		// Divis�o real com base em n�meros inteiros

		double div2 = d1 / b;

		// para temos um divisao real, basta que apenas um dos operadores seja real

		// typecast do a (int) para double.
		double div3 = (double) a / b / c;

		double x = a;
		double div4 = x / b;

		System.out.println("Divis�o: " + div1);
		System.out.println("Divis�o: " + div2);
		System.out.println("Divis�o: " + div3 + div4);
	}
}
