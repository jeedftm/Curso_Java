package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIF02 {
	public static void main(String[] args) {
		/*
		 * Um funcionário terá um valor de 10% de desconto, Se o sálario bruto for
		 * superior a de 5000 reais. O desconto será calculado sobre a diferença entre o
		 * valor do salário e o valor base de 5000.
		 */

		double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual valor do seu salário: ? "));
		double desconto = 0;

		if (salario > 5000) {
			desconto = (salario * 0.10);
			System.out.println("O valor do sálario atual será: " + (salario - desconto));
		} else {
			System.out.println("Seu salário não terá desconto: ");
		}
	}
}
