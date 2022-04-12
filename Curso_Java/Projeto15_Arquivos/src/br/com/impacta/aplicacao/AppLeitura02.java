package br.com.impacta.aplicacao;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class AppLeitura02 {

	public static void main(String[] args) {
		try {
			// Classe FileReader // Caso use a barra / ir� funcionar tamb�m
			// Classe que l� os arquivos
			FileReader reader = new FileReader(
					"C:\\Users\\jedson\\Documents\\Curso_Java\\Curso_Java\\Curso_Java\\Arquivos\\nomes.txt");

			// Leitura do arquivo por array, m�todo mais r�pido

			StringBuilder sb = new StringBuilder();

			while (true) {
				int caractere = reader.read();
				// System.out.println(caractere);
				// EOF = END OF FILE, cada caracter representa um n�mero na tabela ASC
				if (caractere == -1)
					break;

				char ch = (char) caractere;
				sb.append(ch);
				// reader.close();
			}
			System.out.println(sb);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());

		}
	}
}
