package br.com.impacta.utilitarios;

public class Utilitarios {
	
	String curso = "Java";
	
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

	// M�todo que recebe um Array de n�mero reais e retorna a m�dia dos elementos

public static double calcularMediaArray (double... numerosReais) { // 3 pontos, recebe nada como v�rios n�meros
	double soma = 0;
	for (int i = 0; i < numerosReais.length; i++) {
		soma += numerosReais [i];
	}
	return (soma / numerosReais.length);
}
	
}
