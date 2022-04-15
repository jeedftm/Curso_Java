package br.com.impacta.aplicacao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;





public class AppCadastroFuncionarios {

	public static void main(String[] args) {
		try {
			String conexao = "jdbc:mysql://localhost:3306/db_cadastro?autoSSL=false"; // Ponto de interroa��o � um
																						// parametro no front
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn =  DriverManager.getConnection(conexao, "root", "Imp@ct@");
			//Incluindo um novo funcion�rio
			String sql = "INSERT INTO tbfuncionarios(DOCUMENTO, NOME, IDADE,SEXO,CARGO, SALARIO)"
					+ "VALUES (?,?,?,?,?,?)"; // Para adicionar informa��o na tabela o + concactena
			
			String documento = JOptionPane.showInputDialog("Informe o documento");
			String nome = JOptionPane.showInputDialog("Informe o nome: ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
			String sexo = JOptionPane.showInputDialog("Informe o sexo (M ou F): ");
			String cargo = JOptionPane.showInputDialog("Informe o cargo: ");
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o s�lario: "));
			
			PreparedStatement stmt = cn.prepareStatement(sql); // Prepara os pontos de interroga��o
			stmt.setString(1,documento); // Passagem de parametros para os pontos de interroga��o.
			stmt.setString(2,nome); 
			stmt.setInt(3,idade); 
			stmt.setString(4,sexo); 
			stmt.setString(5,cargo); 
			stmt.setDouble(6,salario); 
			
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Funcin�rio Cadastrado");
			

			//JOptionPane.showMessageDialog(null, "Conex�o OK");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
