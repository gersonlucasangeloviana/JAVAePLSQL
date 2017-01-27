package br.com.fiap.main;

import java.sql.SQLException;

import br.com.fiap.dao.conect.DAO;



public class Teste {
	public static void main(String[] args) {
		DAO dao = new DAO();
		
//		try {
//			dao.Proc(6, 10);
//			System.out.println("Salario Atualizado");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			System.out.println(dao.Func(10, 5));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
