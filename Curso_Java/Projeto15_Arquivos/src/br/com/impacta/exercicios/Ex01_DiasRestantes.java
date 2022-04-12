package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex01_DiasRestantes {
	public static void main(String[] args) {

		int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia: "));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês: "));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));

		if (mes < 1 || mes > 12) {
			JOptionPane.showMessageDialog(null, "Mês inválido");
			return;
		}
							// 0,   1,   2   3,   4,   5,   6,   7   ,8   ,9,  10, 11			
		int[] meses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// int [] meses = {31,ano % 4 == 0? 29 : 28,31,30,31,30,31,31,30,31,30,31};
		// Dividimos o ano por 4, e pegamos o resto da divisão, se for 0 o ano é
		// bissexto
		if (ano % 4 == 0) {
			meses[1] = 29;
		}
										// 30 é maior que 31				
		if (dia < 1 || dia > meses [mes-1]) {
			JOptionPane.showMessageDialog(null, "Dia inválido");
			return;
		}
		//Calculo de numero de dias restantes
		int diasRestantes = meses [mes - 1] - dia;
		//diasRestantes+=
		
		for (int i = mes; i < meses.length; i++) {
			diasRestantes+= meses [i];
		}
		
		String resposta = "Faltam " + diasRestantes + " dias para terminar o ano";
		JOptionPane.showMessageDialog(null, resposta);
	}
}
