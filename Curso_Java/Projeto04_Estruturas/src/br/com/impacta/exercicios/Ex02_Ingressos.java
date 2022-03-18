package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex02_Ingressos {
	public static void main(String[] args) {
		char pulaLinha = '\n';
		/*
		 * Em um clube, o valor do ingresso é cobrado de acordo com a idade do
		 * participante.
		 * 
		 * Se a idade for menor que 18: R$ 20,00 Entre 18 e 59 anos: R$ 30,00 Acima de
		 * 59 anos: R$ 15,00
		 * 
		 * Com base nestas informações, escrever o programa que solicita a idade do
		 * usuário. Em seguida apresente:
		 * 
		 * A idade O valor do ingresso:
		 */
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade: "));
		double ingresso;
		if (idade < 18) {
			ingresso = 20;
		} else if (idade >= 18 && idade <= 59) {
			ingresso = 30;
		} else {
			ingresso = 15;
		}
		String resposta = "Sua idade é: " + idade + pulaLinha + " e vai pagar: " + ingresso + pulaLinha
				+ " pelo ingresso";
		JOptionPane.showMessageDialog(null, resposta);
	}
}
