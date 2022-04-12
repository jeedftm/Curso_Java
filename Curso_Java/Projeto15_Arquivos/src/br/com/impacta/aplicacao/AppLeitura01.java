package br.com.impacta.aplicacao;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class AppLeitura01 {

	public static void main(String[] args) {
		try {
			// Classe FileReader // Caso use a barra / irá funcionar também
			// Classe que lê os arquivos
			FileReader reader = new FileReader(
					"C:\\Users\\jedson\\Documents\\Curso_Java\\Curso_Java\\Curso_Java\\Arquivos\\nomes.txt");
			
			// Leitura do arquivo um caractere por vez.
			
			String arquivo = "";
			
			while (true) {
				int caractere = reader.read();
				System.out.println(caractere);
				// EOF = END OF FILE, cada caracter representa um número na tabela ASC
				if (caractere == - 1) 
					break;
					
					char ch = (char)caractere;
					arquivo += ch;
					reader.close();
				}
				System.out.println(arquivo);
			

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());

		}
	}
}
