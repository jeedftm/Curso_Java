package br.com.impacta.aplicacao;

import java.util.Set;
import java.util.TreeSet;

public class AppSet02 {

	public static void main(String[] args) {
		Set <String> nomes = new TreeSet<>();
		nomes.add("8 Zambrano");
		nomes.add("1 Daniel");
		nomes.add("2 Julio");
		nomes.add("3 Parsa");
		nomes.add("4 Jao");
		nomes.add("5 Noia");
		nomes.add("6 Tatiano");
		nomes.add("7 Tatiano");
		
		
		nomes.forEach(s -> System.out.println(s));

	}

}
