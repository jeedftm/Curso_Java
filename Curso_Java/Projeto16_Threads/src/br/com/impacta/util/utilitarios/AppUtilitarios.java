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
		
		// Executando o método calcularMediaNumeros ()
		
		double m1 = Utilitarios.calcularMediaNumeros();
		double m2 = Utilitarios.calcularMediaNumeros(2,3);
		double m3 = Utilitarios.calcularMediaNumeros(9,8,4,6,1,7,6,0);
		double m4 = Utilitarios.calcularMediaNumeros(lista);
		
		System.out.println("M1: " + m1);
		System.out.println("M2: " + m2);
		System.out.println("M3: " + m3);
		System.out.println("M4: " + m4);
	}
}
