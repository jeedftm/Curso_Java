package br.com.impacta.aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class AppGravacaoArquivo03 {

	public static void main(String[] args) {
		try {
			// Classe FileWriter // Caso use a barra / ir� funcionar tamb�m
			FileWriter writer = new FileWriter(
					"C:\\Users\\jedson\\Documents\\Curso_Java\\Curso_Java\\Curso_Java\\Arquivos\\nomes.txt", true);

			while (true) {
				String texto = JOptionPane.showInputDialog("Escreva um nome: ");
				writer.write(texto + "\r\n"); // "\r\n" Serve para pular linha dentro do arquivo, "\n" n�o funciona no // widows 7 para tr�s.
				
				int opcao = JOptionPane.showConfirmDialog(null, 
						"Deseja Continuar: ? ", 
						"Confirma��o", 
						JOptionPane.YES_NO_OPTION);	
				
				if (opcao == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "Nomes cadastrados ");
					break;
				}

			}

			writer.close();
			JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());

		}

	}

}
