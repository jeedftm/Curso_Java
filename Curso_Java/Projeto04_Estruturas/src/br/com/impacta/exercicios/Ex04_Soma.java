package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex04_Soma {
	public static void main(String[] args) {
		/*
		 *  Perguntar ao user quantos n�meros ele deseja.
		 *  Esta quantidade dever� ser armazenada em uma v�riavel.
		 */
		
			int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos n�meros deseja? "));
			// Perguntar para o usu�rio quantos irm�os ele possui
			// Armazenas esse valor em uma var chamada irmaos
			int irmaos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos irm�os voc� tem: ? "));
			// perguntar em qual cidade ele mora e armazenar em 
			// uma variavael 
			String cidade = JOptionPane.showInputDialog("Quantos irm�os voc� tem: ? ");
			// perguntar qual � o sal�rio, incluindo os centavos.
			// armazenar em uma variavel chama salario
			double salario = Double.parseDouble((JOptionPane.showInputDialog(null, "Qual seu s�lario: ? "))
			// declarar uma variavel do tipo String chamada Status.
			// se o salario informado for maior que R$ 6.000,00
			// esta variavel devera armazenar: "Voc� est� acima da m�dia. "
			// caso contrario, a varaivel deve armazenar: 
			// voc� est� dentro da m�dia
		}
	}
}

// FALTA IMPLEMENTAR O C�DIGO 
