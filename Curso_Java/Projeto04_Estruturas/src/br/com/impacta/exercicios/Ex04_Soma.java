package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex04_Soma {
	public static void main(String[] args) {
		/*
		 *  Perguntar ao user quantos números ele deseja.
		 *  Esta quantidade deverá ser armazenada em uma váriavel.
		 */
		
			int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números deseja? "));
			// Perguntar para o usuário quantos irmãos ele possui
			// Armazenas esse valor em uma var chamada irmaos
			int irmaos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos irmãos você tem: ? "));
			// perguntar em qual cidade ele mora e armazenar em 
			// uma variavael 
			String usuario = JOptionPane.showInputDialog("Qual seu nome: ?"); // Referencia
			// perguntar qual é o salário, incluindo os centavos.
			// armazenar em uma variavel chama salario
			// declarar uma variavel do tipo String chamada Status.
			// se o salario informado for maior que R$ 6.000,00
			// esta variavel devera armazenar: "Você está acima da média. "
			// caso contrario, a varaivel deve armazenar: 
			// você está dentro da média
		}
	}
}
