package br.com.impacta.aplicacao;

import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AppLeitura03 {

	public static void main(String[] args) {
		try {
			
			JFileChooser chooser = new JFileChooser();
			if(chooser.showOpenDialog(null) == JFileChooser.CANCEL_OPTION) {
				return;
			}
			
			
			// Classe FileReader // Caso use a barra / ir� funcionar tamb�m
			// Classe que l� os arquivos
			FileReader reader = new FileReader(chooser.getSelectedFile());
					
			// Leitura do arquivo por array, m�todo mais r�pido

			StringBuilder sb = new StringBuilder(); // Sempre que tiver que mexer com String, usaremos esse met�do

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
