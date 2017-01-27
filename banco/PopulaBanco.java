package br.com.fiap.banco;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.singleton.EMFactorySingleton;

public class PopulaBanco {

	public static void main(String[] args) throws Exception {
		EntityManager em = EMFactorySingleton.getInstance().createEntityManager();
		
		Calendar dtNasc = Calendar.getInstance();
		dtNasc.set(1983, 7, 19);
		
		Cliente cli = new Cliente("Gerson", "9874563214", dtNasc, 1500 );
		
		Cliente cli1 = new Cliente("Gerson", "9874563214", dtNasc, 1500 );
		
		Cliente cli2 = new Cliente("Gerson", "9874563214", dtNasc, 1500 );
		
		Cliente cli3 = new Cliente("Gerson", "9874563214", dtNasc, 1500 );
		
		Cliente cli4 = new Cliente("Gerson", "9874563214", dtNasc, 1500 );
		
		ClienteDAO clienteDAO = new ClienteDAOImpl(em);
		
		clienteDAO.insert(cli);
		clienteDAO.insert(cli1);
		clienteDAO.insert(cli2);
		clienteDAO.insert(cli3);
		clienteDAO.insert(cli);
		
	
		
		System.exit(0);
		
	}

}
