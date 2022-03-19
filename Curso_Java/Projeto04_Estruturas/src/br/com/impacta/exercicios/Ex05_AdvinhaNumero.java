package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex05_AdvinhaNumero {
	public static void main(String[] args) {
		int numero = (int) (Math.random() * 100) + 1;
		System.out.println(numero);
		int min = 1, max = 100;
		int tentativas = 0;
		char pulaLinha = '\n';
		while (true) {
			int valor = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe número entre :  " + pulaLinha + min + " e " + max));
			if (valor > max || valor < min) {
				JOptionPane.showMessageDialog(null, "Informe um valor válido" );
				continue; // Retorna para o começo e continua a execução, caso atenda a condição.
			}
			tentativas++;
			if (valor < numero) {
				min = valor + 1;
			} else if (valor == numero) {
				break;
			} else {
				max = valor - 1;
			}
		}
		String resposta = "Você acertou em  " + tentativas + " tentativas ";
		System.out.println(resposta);
	}
}
