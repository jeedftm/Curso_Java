package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIF02 {
	public static void main(String[] args) {
		/*
		 * Um funcion�rio ter� um valor de 10% de desconto, Se o s�lario bruto for
		 * superior a de 5000 reais. O desconto ser� calculado sobre a diferen�a entre o
		 * valor do sal�rio e o valor base de 5000.
		 */

		double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual valor do seu sal�rio: ? "));
		double desconto = 0;

		if (salario > 5000) {
			desconto = (salario * 0.10);
			System.out.println("O valor do s�lario atual ser�: " + (salario - desconto));
		} else {
			System.out.println("Seu sal�rio n�o ter� desconto: ");
		}
	}
}
