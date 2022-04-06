package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Calculo;

public class AppCalculo {

	public static void main(String[] args) {
		Calculo c1 = (x,y) -> x + 2 * y;
		double result = c1.calcular(2, 7);
		System.out.println(result);
		System.out.println();
	}

}
