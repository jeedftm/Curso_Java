package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes02 {

	public static void main(String[] args) {
try { // Esperado, é dentro do try
			
			String nome = JOptionPane.showInputDialog("Nome: ");
			JOptionPane.showMessageDialog(null, "Seu nome:  " + nome.toUpperCase());
			
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
			JOptionPane.showMessageDialog(null, "Idade informada: " + idade);
			
		} catch (NumberFormatException | NullPointerException e) { // Representa o objeto do erro
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
