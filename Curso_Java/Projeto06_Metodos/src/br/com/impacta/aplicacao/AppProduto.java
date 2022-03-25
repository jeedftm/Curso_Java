package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {

		while (true) {
			String cat = JOptionPane.showInputDialog("Categoria: ");
			String des = JOptionPane.showInputDialog("Descrição: ");
			Double pre = Double.parseDouble(JOptionPane.showInputDialog("Preço: "));
			Produto prod = new Produto(cat, des, pre);
			System.out.println(prod.mostrar());
			JOptionPane.showMessageDialog(null, prod.mostrar());
			
		int option =	
				JOptionPane.showConfirmDialog
				(null,"Deseja continuar?  "," Confirmação", JOptionPane.YES_NO_OPTION);
		
				if (option == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "Você saiu do programa! ");
					break;
				}
		}
		
	}
}
