package br.com.fiap.conexao;

import java.sql.Connection;

public class TesteConexao {
	public static void main(String args[]) throws Exception{
		Connection c = null;
		try{
			c = new ConexaoFactory().getConexao();
			System.out.println("Conexão aberta!");
		} catch(Exception e){
			System.out.println("Erro de Conexão");
		} finally{
			try{ 
				c.close();
			} catch (Exception e){
				System.out.println(e);
			}
		}
	}
}
