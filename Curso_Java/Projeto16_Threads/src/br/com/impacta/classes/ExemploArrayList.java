package br.com.impacta.classes;

import java.util.ArrayList;
import java.util.List;



public class ExemploArrayList {

	public static void main(String[] args) {
		List<String> paises = new ArrayList<>();
		paises.add("Brasil"); 
		paises.add("Portugal");
		paises.add("Estados Unidos");
		paises.add("Fran�a");
		paises.add("Inglaterra");
		paises.add(2, "Italia");
		System.out.println("Paises na ordem original");
		paises.forEach(curso-> System.out.println(" - " + curso));
		System.out.println("==================================================");
		// Verifica se esta lista possui o string "Estados unidos"
		System.out.println(paises.contains("Estados unidos"));
		//Imprime o item da posi��o 2
		System.out.println(paises.get(2));
		// Imprime o tamanho dessa lista
		System.out.println(paises.size());
		// Imprime em que posi��o da lista est� a Fran�a 
		System.out.println(paises.indexOf("Fran�a"));
		//Substitui todos os elementos pelo seu conteudo em ma�sculo
		paises.replaceAll(s -> s.toUpperCase( ));
		//Reordena toda a lista utilizando a ordem natural das Strings
		paises.sort ((x,y) -> x.compareTo(y));
		System.out.println("=====================================================");
		System.out.println("Pa�ses ordenados e em maisculo");
		paises.forEach (curso -> System.out.println(" - " + curso));
		
		

	}

}
