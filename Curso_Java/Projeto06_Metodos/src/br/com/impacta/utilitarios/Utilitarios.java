package br.com.impacta.utilitarios;

public class Utilitarios {
	public static double somar(double x, double y) {
		return x + y;
	}
	// Metódo que receba como parametro um texto e retorne esse texto sem espaço.
	public static String removerEspacos (String texto) {
		return texto.replace (
				" " // antigo 
				, 
				"" // novo
				);
	}
	// Escrever um metódo que receba como parametro um nome e um sobrenome e retorne email formato: nome.sobrenome@impacta.com.br
	public static String gerarEmail (String nome, String sobrenome) {
		
		return nome +"."+ sobrenome + "@impacta.com.br";
	}
	
public static String gerarEmail2 (String nome, String sobrenome) {
		
		String email = nome + " . " + sobrenome + "@impacta.com.br";
		return removerEspacos(email.toLowerCase()); // Metódo que remove e metodo que converte para minusculas
	}
	
}
