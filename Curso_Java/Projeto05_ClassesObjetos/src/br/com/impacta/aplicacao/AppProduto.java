package br.com.impacta.aplicacao;

import br.com.impacta.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		Produto prod = new Produto(); // CTRL =+ SHIFT + O para realizar as importa��es necess�rias.
		prod.codigo = 203040;
		prod.descricao = "Para apontar l�pis";
		prod.categoria = "Material Escolar";
		prod.preco = 2.30;

	}
}
