package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile03 {
	public static void main(String[] args) {
		/*
		 * Nesse programa, o usuário fornece uma certa quantidae de números. A entrada
		 * de dados termina quando o usuário digitar o número 0
		 * 
		 * No final, o programa deve mostrar a asoma e a quantidade de números
		 * informados.
		 */

		int quantidade = 0;
		int soma = 0;

		while (true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));

			if (numero == 0) {
				break;
				// break interrompe a estrutura de repetição caso atenda a condição
			}
			soma += numero;
			quantidade ++;
		}
		System.out.println("A soma dos números informados: " + quantidade);
		System.out.println("Quantidade de números informados: " + soma);
	}
}
