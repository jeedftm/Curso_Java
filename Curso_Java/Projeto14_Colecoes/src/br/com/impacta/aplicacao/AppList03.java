package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.List;

import br.com.impacta.classes.Produto;

public class AppList03 {

	public static void main(String[] args) {
		List <Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Inform�tica", "Lapop", 4000));
		produtos.add(new Produto("Limpeza", "Sabonete", 4));
		produtos.add(new Produto("Alimenta��o", "Macarr�o", 5));
		produtos.add(new Produto("Inform�tica", "WebCam", 389));
		produtos.add(new Produto("Transporte", "Moto", 4000));
		produtos.add(new Produto("Inform�tica", "Mouse", 35));
		
		// Apresentando os dados, usando o met�do forEach()
		System.out.println("Lista Original: ");
		produtos.forEach(produto -> System.out.println(produto));
		
		// Ordena��o pela categoria
		produtos.sort((a,b) -> a.getCategoria().compareTo(b.getCategoria()));
		System.out.println();
		System.out.println("Listas ordenadas pela categoria");
		produtos.forEach(produto -> System.out.println(produto));
		
		

	}

	private static void produtos.void forEach(Object object) {
		// TODO Auto-generated method stub
		
	}

}
