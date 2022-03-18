package br.com.impacta.leitura;

import javax.swing.JOptionPane;

public class LeituraDados {
	public static void main(String[] args) {

		// Variavel para pular linha
		char pulaLinha = '\n';
		// obter Nome

		String usuario = JOptionPane.showInputDialog("Qual seu nome: ?"); // Referencia

		// obter a idade do user

		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade ? "));

		// obter altura

		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a sua altura ? "));

		// gerando uma resposta unificada

		JOptionPane.showMessageDialog(null, "Seu nome: " + usuario + pulaLinha // null interface gráfica
				+ " Sua idade: " + idade + pulaLinha + " Sua Altura: " + altura); // Primeiro parametro

	}
}
