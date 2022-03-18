package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

/*
 * Um caixa eletronico possuia as c�dulas:
 * 50,00
 * 20,00
 * 10,00
 * 5,00
 * 
 * Escrever um c�digo para solicitar ao usu�rio o valor do saque. 
 * Com base no valor, vamos apresentar a quantidade de c�dulas dispensadas.
 * Considerando que as c�lucas de maior valor s�o liberdas primeiro.
 */
public class Ex01_CaixaEletronico {
	public static void main(String[] args) {

		// Solicitar o valor do saque.
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual valor do saque: ? "));

		// Obter o valor com osendo inteiro.
		int valorSaque = (int) valor; // Type Cast
		// Analisar se o valor � multiplo de 5
		if (valorSaque % 5 != 0) {
			JOptionPane.showMessageDialog(null, "Valor Inv�lido: ");
			return; // Todo return vai sair do m�todo caso satisfa�a a condi��o atual, n�o precisaria do ELSE
		}
		// Toda variavel devemos atribuir um valor.
		int qtde50, qtde20, qtde10, qtde5;
		// Variavel Pular Linha
		char pulaLinha = '\n';
		qtde50 = qtde20 = qtde10 = qtde5 = 0;

		qtde50 = valorSaque / 50; // 2 notas de 50 = 2
		valorSaque %= 50; // Receber o resto da divis�o e atribuir

		qtde20 = valorSaque / 20; // notas de 20 = 1
		valorSaque %= 20; // Receber o resto da divis�o e atribuir

		qtde10 = valorSaque / 10; // notas de 10 = 0
		valorSaque %= 10; // Receber o resto da divis�o e atribuir

		qtde5 = valorSaque / 5; // notas de 5 = 1
		valorSaque %= 5; // Receber o resto da divis�o e atribuir

		JOptionPane.showMessageDialog(null,
				"O valor do seu saque ser� R$: " + valor + pulaLinha + "Voc� receber�: " + pulaLinha
						+ "Notas de R$ 50,00: " + qtde50 + pulaLinha + "Notas de R$ 20,00: " + qtde20 + pulaLinha
						+ "Notas de R$ 10,00: " + qtde10 + pulaLinha + "Notas de R$ 5,00: " + qtde5 + pulaLinha);

	}
}
