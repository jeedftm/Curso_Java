package br.com.impacta.aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.impacta.classes.Produto;

public class AppSet03 {

	public static void main(String[] args) {
		Set <Produto> produtos = new LinkedHashSet<>();
		produtos.add(new Produto("Inform�tica", "Lapop", 4000));
		produtos.add(new Produto("Limpeza", "Sabonete", 4));
		produtos.add(new Produto("Alimenta��o", "Macarr�o", 5));
		produtos.add(new Produto("Inform�tica", "WebCam", 389));
		produtos.add(new Produto("Transporte", "Moto", 4000));
		produtos.add(new Produto("Transporte", "Moto", 4000));
		produtos.add(new Produto("Inform�tica", "Mouse", 35));
		
		Produto p = new Produto("Inform�tica", "Mouse", 35);
		produtos.add(p);
		produtos.add(p);
		produtos.add(p);
		System.out.println("Lista Original: ");
		produtos.forEach(produto -> System.out.println(produto));

	}

}
