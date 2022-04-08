package br.com.impacta.classes;

import java.util.Comparator;

public class OrdenacaoDescricao implements Comparator<Produto> {

	@Override
	public int compare(Produto prod1, Produto prod2) {
		// TODO Auto-generated method stub
		return prod1.getDescricao().compareTo(prod2.getDescricao());
	}

}
