package br.com.impacta.aplicacao;

import java.util.HashMap;
import java.util.Map;

public class AppMap02 {

	public static void main(String[] args) {
		Map<Integer, String> nomes = new HashMap<>(); // Integer é Key de Chave e String é o valor
		// TreeMap para ordenar 
		nomes.put(123, "Lucas");
		nomes.put(784, "Igor");
		nomes.put(487, "Paula");
		nomes.put(889, "Ana");
		
		nomes.forEach((k,v) -> System.out.println(k + " ->> " + v));

	}

}
