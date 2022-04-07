package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Operacao01;

public class AppOperacao01 {
	
	public static int contarPalavras  (String s) {
	
		String texto = s.trim(); // Trim remove os espeços da esquerda para a d;ireita
		String[] itens = texto.split(" ");
		int contador = 0;
		for (String elemento : itens) {
			if (elemento.length() > 0) {
				contador++;
			}
			
		}
		return contador;
	}

	public static void main(String[] args) {
		Operacao01 op1 = s -> s.length();
		int retorno = op1.executar("Curso  Japa");
		System.out.println("A quantidade de caracteres de op1(método) é: " + retorno);
		// Parametro: um texto.
		// Retorno: numero de palavras.

		Operacao01 op2 = s -> {
			String texto = s.trim(); // Trim remove os espeços da esquerda para a d;ireita
			String[] itens = texto.split(" ");
			int contador = 0;
			for (String elemento : itens) {
				if (elemento.length() > 0) {
					contador++;
				}
				
			}
			return contador;
		};
		String texto = "O Curso de java termina dia 14";
		int resultado = op2.executar(texto);
		System.out.println("Quantidades de palavaras da frase: " + resultado);
		System.out.println("Quantidades de palavaras da frase: \"" + resultado + "\"");
	

		Operacao01 op3 = s -> contarPalavras(s);
		int resultado3 = op3.executar("Esse exemplo é muito comum");
		System.out.println(resultado3);
	}

}
