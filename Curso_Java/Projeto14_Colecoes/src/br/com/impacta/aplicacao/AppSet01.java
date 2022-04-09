package br.com.impacta.aplicacao;

import java.util.HashSet;
import java.util.Set;

public class AppSet01 {

	public static void main(String[] args) {
		Set <String> nomes = new HashSet<>();
		nomes.add("Daniel");
		nomes.add("Julio");
		nomes.add("Parsa");
		nomes.add("Jao");
		nomes.add("Noia");
		nomes.add("Tatiano");
		nomes.add("Tatiano");
		
		nomes.forEach(s -> System.out.println(s)); // Analisa os Hash, e vê oque é mais rápido e monta na ordem

	}

}
