package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		Produto prod = new Produto(); // CTRL =+ SHIFT + O para realizar as importa��es necess�rias.
		
		
		String cat = JOptionPane.showInputDialog("Categoria: ");
		int cod = Integer.parseInt(JOptionPane.showInputDialog("C�digo: "));
		String des = JOptionPane.showInputDialog("Descri��o: ");
		double pre = Double.parseDouble(JOptionPane.showInputDialog("Pre�o: "));
		
		
		prod.setCategoria(cat);
		prod.setCodigo(cod);
		prod.setDescricao(des);
		prod.setPreco(pre);
		
		System.out.println(prod.mostrar());
		JOptionPane.showMessageDialog(null, prod.mostrar());
		
		//prod.codigo = 203040;
		//prod.descricao = "Para apontar l�pis";
		//prod.categoria = "Material Escolar";
		//prod.preco = 2.30;

	}
}
