package br.com.impacta.classes;

import java.util.TreeSet;

public class ExemploForEach {

	public static void main(String[] args) {
		TreeSet<String> cursos = new TreeSet<>();
		cursos.add("PHP");
		cursos.add("Linux");
		cursos.add("ASP");
		cursos.add("JAVA");
		cursos.add("DELPHI");
		System.out.println("Cursos em ordem alfab�tica: \n");
		cursos.forEach(c -> System.out.println(cursos));

	}

}
