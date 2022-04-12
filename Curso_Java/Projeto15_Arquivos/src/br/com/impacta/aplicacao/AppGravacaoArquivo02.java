package br.com.impacta.aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class AppGravacaoArquivo02 {

	public static void main(String[] args) {
		try {
			//Classe FileWriter // Caso use a barra / irá funcionar também
			FileWriter writer = new FileWriter("C:\\Users\\jedson\\Documents\\Curso_Java\\Curso_Java\\Curso_Java\\Arquivos\\nomes.txt", true); 
			
			String texto = JOptionPane.showInputDialog("Escreva um nome: ");
			writer.write(texto + "\r\n"); // "\r\n" Serve para pular linha dentro do arquivo, "\n" não funciona no widows 7 para trás. 
			
			writer.close();
			
			JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			
			
		}

	}

}
