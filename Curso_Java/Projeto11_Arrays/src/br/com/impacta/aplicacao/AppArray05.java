package br.com.impacta.aplicacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppArray05 {

	public static void main(String[] args) {
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma quantidade de nomes: "));
		if (quantidade <= 0) {
			JOptionPane.showMessageDialog
			(null, "A quantidade deve ser maior que zero! ", "Erro", JOptionPane.ERROR_MESSAGE);
			// Saindo do método é return;
			return;
			
		}
		
		String[] nomes = new String[quantidade];

		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Informe o nome " + (i + 1));
		}
		//Ordenamos os nomes por ordem alfabetica.
		Arrays.sort(nomes);
		
		for (String nome_posicao_array : nomes) {
			System.out.println(nome_posicao_array);
		}

	}

}
