package br.com.impacta.exercicios;

public class Ex03_SenhaAlfanumerica {
	public static void main(String[] args) {
		/*
		 *  Este programa deve gerar uma senha com 6 digitos
		 *  onde cada digito � um numero
		 *  entre 0 e 9. A senha final � uma String
		 */
		char pulaLinha = '\n';
		String senha =  " ";
		for (int i = 1; i <= 6; i++) {
			senha += (int) (Math.random() * 10);
			System.out.println(senha); 
			
		}
		System.out.println(pulaLinha + senha);
	}
}
