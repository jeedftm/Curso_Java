package br.com.impacta.aplicacao;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;

public class AppCadastroFuncionarios {

	public static void main(String[] args) {
		try {
			String conexao = "jdbc:mysql://localhost:3306/db_cadastro?autoSSL=false"; // Ponto de interroação é um
																						// parametro no front
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = (Connection) DriverManager.getConnection(conexao, "root", "Imp@ct@");

			JOptionPane.showMessageDialog(null, "Conexão OK");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
