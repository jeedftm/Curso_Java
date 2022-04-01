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
		
		// Executando o método calcularMediaArray ();
		double [] lista = {2.5,4.5,6.5,10.1};
		double media = Utilitarios.calcularMediaArray(lista);
		
		System.out.println("Média dos números: " + media);
	}
}
