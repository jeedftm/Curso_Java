package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {

		while (true) {
			String cat = JOptionPane.showInputDialog("Categoria: ");
			String des = JOptionPane.showInputDialog("Descri��o: ");
			Double pre = Double.parseDouble(JOptionPane.showInputDialog("Pre�o: "));
			Produto prod = new Produto(cat, des, pre);
			System.out.println(prod.mostrar());
			JOptionPane.showMessageDialog(null, prod.mostrar());
			
		int option =	
				JOptionPane.showConfirmDialog
				(null,"Deseja continuar?  "," Confirma��o", JOptionPane.YES_NO_OPTION);
		
				if (option == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "Voc� saiu do programa! ");
					break;
				}
		}
		
	}
}
