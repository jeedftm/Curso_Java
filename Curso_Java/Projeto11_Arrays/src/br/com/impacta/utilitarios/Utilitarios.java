package br.com.impacta.utilitarios;

public class Utilitarios {
	
	String curso = "Java";
	
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

	// Método que recebe um Array de número reais e retorna a média dos elementos

public static double calcularMediaArray (double... numerosReais) { // 3 pontos, recebe nada como vários números
	double soma = 0;
	for (int i = 0; i < numerosReais.length; i++) {
		soma += numerosReais [i];
	}
	return (soma / numerosReais.length);
}
	
}
