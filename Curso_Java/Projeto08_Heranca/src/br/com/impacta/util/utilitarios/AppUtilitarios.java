package br.com.impacta.util.utilitarios;

import br.com.impacta.utilitarios.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {
		double soma = Utilitarios.somar(12, 15.6);
		System.out.println(soma);
		
		
		
		String novaFrase = Utilitarios.removerEspacos("Desliga a furadeira: ");
		System.out.println(novaFrase);
		
		String nomeSobrenome = Utilitarios.gerarEmail2("Jedson", "Rodrigues");
		System.out.println(nomeSobrenome);
	}
}
