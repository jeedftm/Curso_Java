package br.com.impacta.aplicacao;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

import java.util.Arrays;

import br.com.impacta.classes.Curso;

public class AppArray08 {

	public static void main(String[] args) {
		// definindo um array de cursos.

		// solicitando a quantidade de cursos.

		int quantidade = parseInt(showInputDialog("Informe a quantidade de cursos: "));

		Curso[] cursos = new Curso[quantidade];

		for (int i = 0; i < cursos.length; i++) {
			int codigo = parseInt(showInputDialog("Informe o c�digo do curso: " + (i + 1)));
			String descricao = showInputDialog("Descri��o do curso: " + (i + 1));
			int cargaHoraria = parseInt(showInputDialog("Informe Carga Hor�ria: " + (i + 1)));
			double preco = parseDouble(showInputDialog("Pre�o do curso : " + (i + 1)));

			cursos[i] = new Curso(codigo, descricao, cargaHoraria, preco);
		}
		
		Arrays.sort(cursos);
		// Apresentado os dados para o usuario.
		for (Curso curso : cursos) {
			System.out.println(curso.mostrar());
			System.out.println();
			System.out.println("Pr�ximo Curso");
			System.out.println();
		}
	}

}
