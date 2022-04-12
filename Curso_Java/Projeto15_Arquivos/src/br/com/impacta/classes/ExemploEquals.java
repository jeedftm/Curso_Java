package br.com.impacta.classes;

public class ExemploEquals {

	public static void main(String[] args) {
		Pessoaa a = new Pessoaa("Rodrigo", 23);
		Pessoaa b = new Pessoaa("Claudio", 20);
		
		System.out.println(a.nome + " É Igual a " + b.nome + " ?" + (a.equals(b)));
		a.nome = b.nome; // Nomes iguais, mas objetos diferentes
		System.out.println(a.nome + " É Igual a " + b.nome + " ?" + (a.equals(b)));
		a = b; // Objetos iguais
		System.out.println(a.nome + " É Igual a " + b.nome + " ?" + (a.equals(b)));
		

	}

}
