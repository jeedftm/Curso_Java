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
					JOptionPane.showInputDialog(null, "Informe n�mero entre :  " + pulaLinha + min + " e " + max));
			if (valor > max || valor < min) {
				JOptionPane.showMessageDialog(null, "Informe um valor v�lido" );
				continue; // Retorna para o come�o e continua a execu��o, caso atenda a condi��o.
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
		String resposta = "Voc� acertou em  " + tentativas + " tentativas ";
		System.out.println(resposta);
	}
}
