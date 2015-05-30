package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public Connection conexao = null;

	public Connection abrirConexao() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost/sebastiao", "root", "");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return conexao;
	}

	public void fecharConexao() {
		try {
			conexao.close();
			System.out.println("Desconectou");
		} catch (SQLException erro) {
		}
	}
}
