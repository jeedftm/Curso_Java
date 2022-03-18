package br.com.impacta.inteiros;

public class VariaveisByte {
	public static void main(String[] args) {
		// Informar tipo, nome da var,
		// = atribuição
		byte idade = 80;
		byte idade2 = 48;

		// Somando as duas idades, e armazenando em uma terceira variavel
		byte soma = (byte) (idade + idade2);
		System.out.println(idade);
		System.out.println(idade2);
		System.out.println("A Soma das idades é: " + soma);
	}
}
