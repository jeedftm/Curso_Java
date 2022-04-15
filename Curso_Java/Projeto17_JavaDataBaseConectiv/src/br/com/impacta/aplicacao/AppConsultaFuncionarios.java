package br.com.impacta.aplicacao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AppConsultaFuncionarios {

	public static void main(String[] args) {
		try {
			String conexao = "jdbc:mysql://localhost:3306/db_cadastro?autoSSL=false"; // Ponto de interroação é um
			// parametro no front
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn =  DriverManager.getConnection(conexao, "root", "Imp@ct@");
			
			String sql = "SELECT * FROM TBFUNCIONARIOS";
			
			PreparedStatement stmt = cn.prepareStatement(sql); // Preparação para a nossa string, mandar a string para o metódo
			
			ResultSet rs = stmt.executeQuery(); 	// Variavel que recebe o retorno do banco como resposta da consulta || rs.next() vai para a próxima linha.
			
			// Listando os registros.
			
			while (rs.next()) { // O metódo já é true, por este motivo não precisa fazer a comparação. 
				System.out.println("Documento: "+ rs.getString("Documento")); // Pega a coluna de banco para exibição
				System.out.println("Nome: "+ rs.getString("Nome")); // Pega a coluna de banco para exibição
				System.out.println("Idade: "+ rs.getInt("Idade")); // Pega a coluna de banco para exibição
				System.out.println("Sexo: "+ rs.getString("Sexo")); // Pega a coluna de banco para exibição
				System.out.println("Cargo: "+ rs.getString("Cargo")); // Pega a coluna de banco para exibição
				System.out.println("Salario: "+ rs.getDouble("Salario")); // Pega a coluna de banco para exibição
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
