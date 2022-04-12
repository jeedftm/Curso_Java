package br.com.impacta.aplicacao;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class AppMap01 {

	public static void main(String[] args) {
		Map<Integer, String> nomes = new HashMap<>(); // Integer é Key de Chave e String é o valor
		nomes.put(123, "Lucas");
		nomes.put(784, "Igor");
		nomes.put(487, "Paula");
		nomes.put(889, "Ana");
		
		for (Map.Entry<Integer, String> item: nomes.entrySet()) {
			//System.out.println(item);
			System.out.println(item.getKey() + " -- "  + item.getValue());
		} 
		
		int chave = Integer.parseInt(JOptionPane.showInputDialog("Insira a chave: "));
		if(nomes.containsKey(chave)) {
			JOptionPane.showInternalMessageDialog(null, "Valor encontrado " + nomes.get(chave));
		}else {
			JOptionPane.showMessageDialog(null, "Nenhum valor encontrado");
		}

	}// Para buscar alunos de faculdade.

}
