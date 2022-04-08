package br.com.impacta.classes;

import java.util.ArrayList;
import java.util.List;



public class ExemploArrayList {

	public static void main(String[] args) {
		List<String> paises = new ArrayList<>();
		paises.add("Brasil"); 
		paises.add("Portugal");
		paises.add("Estados Unidos");
		paises.add("França");
		paises.add("Inglaterra");
		paises.add(2, "Italia");
		System.out.println("Paises na ordem original");
		paises.forEach(curso-> System.out.println(" - " + curso));
		System.out.println("==================================================");
		// Verifica se esta lista possui o string "Estados unidos"
		System.out.println(paises.contains("Estados unidos"));
		//Imprime o item da posição 2
		System.out.println(paises.get(2));
		// Imprime o tamanho dessa lista
		System.out.println(paises.size());
		// Imprime em que posição da lista está a França 
		System.out.println(paises.indexOf("França"));
		//Substitui todos os elementos pelo seu conteudo em maísculo
		paises.replaceAll(s -> s.toUpperCase( ));
		//Reordena toda a lista utilizando a ordem natural das Strings
		paises.sort ((x,y) -> x.compareTo(y));
		System.out.println("=====================================================");
		System.out.println("Países ordenados e em maisculo");
		paises.forEach (curso -> System.out.println(" - " + curso));
		
		

	}

}
