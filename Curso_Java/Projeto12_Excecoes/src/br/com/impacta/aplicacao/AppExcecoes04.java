package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes04 {

	public static void main(String[] args) {

		try { // Esperado, é dentro do try

			String nome = JOptionPane.showInputDialog("Nome: ");
			JOptionPane.showMessageDialog(null, "Seu nome:  " + nome.toUpperCase());

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
			JOptionPane.showMessageDialog(null, "Idade informada: " + idade);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro Geral: " + e.getMessage());
		}

	}
}
