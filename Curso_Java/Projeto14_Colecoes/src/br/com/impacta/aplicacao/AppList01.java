package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppList01 {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList <>();
		nomes.add("Maria");
		nomes.add("Lucas");
		nomes.add("Alex");
		System.out.println(nomes);
//		nomes.remove(1);
//		System.out.println(nomes);
		
		// Analise de todos os nomes da lista 
//		nomes.removeIf(p -> p.endsWith("s"));
//		System.out.println("Removendo: " + nomes);
		
//		nomes.removeIf(parametro_do_metodo -> parametro_do_metodo.endsWith("s"));
		//Apresentado os elementos usando a propria lista
		System.out.println(nomes);
		
		System.out.println();
		
		// usando a estrutura foreach
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		// Ordenando a coleção 
		Collections.sort(nomes);
		
		System.out.println();
		
		//Usando o metódo forEach
		nomes.forEach(s -> System.out.println(s));
	}
}
