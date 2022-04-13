package br.com.impacta.aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;

import br.com.impacta.enumeracoes.Sexo;

public class AppGravacaoArquivo04 {

	public static void main(String[] args) {
		try {
			// Classe FileWriter // Caso use a barra / ir� funcionar tamb�m
			FileWriter writer = new FileWriter(
					"C:\\Users\\21no0705\\Documents\\Curso_Java\\Arquivos\\funcionarios.csv", true);
			//OBtendo os dados de um funcion�rio.
			String nome = JOptionPane.showInputDialog("nome do funcion�rio: ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do funcion�rio: "));
			Sexo sexo = (Sexo) JOptionPane.showInputDialog(
					null, 
					"Qual sexo do funcion�rio? ", 
					"Sexo", 
					JOptionPane.QUESTION_MESSAGE, 
					null, 
					Sexo.values(), 
					null);
			
			String documento = JOptionPane.showInputDialog("CPF do funcion�rio: "); 
			String cargo = JOptionPane.showInputDialog("Cargo do funcion�rio: "); 
			
			double salario = Double.parseDouble(JOptionPane.showInputDialog("S�lario do funcion�rio: "));
			
			// Gerando uma linha com os dados separados pelo caracter ";"
			
			StringBuilder sb = new StringBuilder();
			sb.append(nome).append(";")
			.append(nome).append(";")
			.append(sexo).append(";")
			.append(documento).append(";")
			.append(cargo).append(";")
			.append(salario).append(";");
			
			//Escrevendo a linha no arquivo novo.
			
			writer.write(sb.toString());
			writer.close();
			JOptionPane.showMessageDialog(null, "Dados gerados com sucesso! ");


		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());

		}

	}

}
