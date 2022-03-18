package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

/*
 * Um caixa eletronico possuia as cédulas:
 * 50,00
 * 20,00
 * 10,00
 * 5,00
 * 
 * Escrever um código para solicitar ao usuário o valor do saque. 
 * Com base no valor, vamos apresentar a quantidade de cédulas dispensadas.
 * Considerando que as célucas de maior valor são liberdas primeiro.
 */
public class Ex01_CaixaEletronico {
	public static void main(String[] args) {

		// Solicitar o valor do saque.
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual valor do saque: ? "));

		// Obter o valor com osendo inteiro.
		int valorSaque = (int) valor; // Type Cast
		// Analisar se o valor é multiplo de 5
		if (valorSaque % 5 != 0) {
			JOptionPane.showMessageDialog(null, "Valor Inválido: ");
			return; // Todo return vai sair do método caso satisfaça a condição atual, não precisaria do ELSE
		}
		// Toda variavel devemos atribuir um valor.
		int qtde50, qtde20, qtde10, qtde5;
		// Variavel Pular Linha
		char pulaLinha = '\n';
		qtde50 = qtde20 = qtde10 = qtde5 = 0;

		qtde50 = valorSaque / 50; // 2 notas de 50 = 2
		valorSaque %= 50; // Receber o resto da divisão e atribuir

		qtde20 = valorSaque / 20; // notas de 20 = 1
		valorSaque %= 20; // Receber o resto da divisão e atribuir

		qtde10 = valorSaque / 10; // notas de 10 = 0
		valorSaque %= 10; // Receber o resto da divisão e atribuir

		qtde5 = valorSaque / 5; // notas de 5 = 1
		valorSaque %= 5; // Receber o resto da divisão e atribuir

		JOptionPane.showMessageDialog(null,
				"O valor do seu saque será R$: " + valor + pulaLinha + "Você receberá: " + pulaLinha
						+ "Notas de R$ 50,00: " + qtde50 + pulaLinha + "Notas de R$ 20,00: " + qtde20 + pulaLinha
						+ "Notas de R$ 10,00: " + qtde10 + pulaLinha + "Notas de R$ 5,00: " + qtde5 + pulaLinha);

	}
}
