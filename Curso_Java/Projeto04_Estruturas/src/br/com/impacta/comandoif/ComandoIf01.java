package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf01 {
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade: ? "));
		// if= Condição SE
		if (idade < 18) {
			System.out.println("Menor de idade, sua ídade atual: " + idade);
		}
		else { // CONDIÇÃO SE NÃO
			System.out.println("Maior de idade, sua idade atual: " + idade);
		}
	}
}
