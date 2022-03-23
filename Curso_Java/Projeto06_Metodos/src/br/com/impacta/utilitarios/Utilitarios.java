package br.com.impacta.utilitarios;

public class Utilitarios {
	public static double somar(double x, double y) {
		return x + y;
	}
	// Met�do que receba como parametro um texto e retorne esse texto sem espa�o.
	public static String removerEspacos (String texto) {
		return texto.replace (
				" " // antigo 
				, 
				"" // novo
				);
	}
	// Escrever um met�do que receba como parametro um nome e um sobrenome e retorne email formato: nome.sobrenome@impacta.com.br
	public static String gerarEmail (String nome, String sobrenome) {
		
		return nome +"."+ sobrenome + "@impacta.com.br";
	}
	
public static String gerarEmail2 (String nome, String sobrenome) {
		
		String email = nome + " . " + sobrenome + "@impacta.com.br";
		return removerEspacos(email.toLowerCase()); // Met�do que remove e metodo que converte para minusculas
	}
	
}
