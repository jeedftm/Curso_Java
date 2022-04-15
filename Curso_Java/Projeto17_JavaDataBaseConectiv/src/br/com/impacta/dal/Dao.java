package br.com.impacta.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;

public abstract class Dao<T, K> {
	String conexao = "jdbc:mysql://localhost:3306/db_cadastro?autoSSL=false"; // Ponto de interroação é um
	// parametro no front

	// Protected = Acessivel para a classe e a subclasse.
	protected Connection cn;
	protected PreparedStatement stmt;
	protected ResultSet rs;

	// Metodo para abrir a conexão

	protected void abrirConexao() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		cn = DriverManager.getConnection(conexao, "root", "Imp@ct@");
	}

	// Metodo para fechar a conexao

	protected void fecharConexao() throws Exception {

		if (cn != null && !cn.isClosed()) {

			cn.close();
		}

	}

	public abstract void incluir(T item) throws Exception;

	public abstract void buscar(K  id) throws Exception;  // Chave

	public abstract Collection<T> listar() throws Exception;

}
