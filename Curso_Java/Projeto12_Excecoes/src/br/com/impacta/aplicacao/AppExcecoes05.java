package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes05 {

	public static void main(String[] args) {

		try { // Esperado, � dentro do try

			String nome = JOptionPane.showInputDialog("Nome: ");
			JOptionPane.showMessageDialog(null, "Seu nome:  " + nome.toUpperCase());

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
			JOptionPane.showMessageDialog(null, "Idade informada: " + idade);

		} catch (Exception e) {

			String classe = e.getClass().getSimpleName();
			
			if (e instanceof NullPointerException) {
				e.initCause(new NullPointerException("Referencuas nulas n�o acessam o m�todo"));
			}
			
			e.printStackTrace();

			JOptionPane.showMessageDialog(null, "Erro Geral: " + "\nClasse: " + classe + e.getMessage());
		}

	}
}
