package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile04 {
	public static void main(String[] args) {
		/*
		 * Nesse programa, o usuário fornece uma certa quantidae de números. A entrada
		 * de dados termina quando o usuário digitar o número 0
		 * 
		 * Cada número informado é mostrado na tela
		 * 
		 * Se o usuário digitar um número negativo, este é ignorado
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
			if (numero < 0) {
				continue;
				// Continuar para a próxima instrução
				// (Volta para o inicio)
			}
			System.out.println(numero);
			soma += numero;
			quantidade++;
		}
		System.out.println("A soma dos números informados: " + quantidade);
		System.out.println("Quantidade de números informados: " + soma);

		// Return sai do método
		// Break interrompe a estrutura de repetição
		// Continue, volta o a repetição do inicio.
	}
}
