package br.com.fiap.conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

		public Connection getConexao() {
				
			String url = "jdbc:oracle:thin:/:@oracle.fiap.com.br:1521:ORCL"; 
			String usuario = "OPS$RM74748";
			String senha = "301090";
			try{	
			Class.forName("oracle.jdbc.driver.OracleDriver");
					
				return DriverManager.getConnection(url,usuario, senha);
			} catch (ClassNotFoundException | SQLException e){
				e.printStackTrace();
				return null;
			}
			}
				


}
