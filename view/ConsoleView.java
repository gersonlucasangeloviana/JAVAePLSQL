package br.com.fiap.view;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;

import br.com.fiap.dao.impl.ClienteDAOImpl;

import br.com.fiap.entity.Cliente;

import br.com.fiap.singleton.EMFactorySingleton;

public class ConsoleView {

	public static void main(String[] args) {
				
		EntityManager em = EMFactorySingleton.getInstance().createEntityManager();
		
		//Listagem de Clientes
		ClienteDAO clienteDao = new ClienteDAOImpl(em);
//		List<Cliente> clientes = clienteDao.list();
//		System.out.println("BUSCA DE CLIENTES");
//		for (Cliente cliente : clientes) {
//			System.out.println("ID: " + cliente.getId() + "  Salario:" + cliente.getSalario());
//		}
		
		int i = 6;
		int p = 10;
		clienteDao.Proc(i, p);
//		
//		
//		List<Object[]> lista = clienteDao.listarNomeCPF();
//		System.out.println("LISTAR NOME E CPF DO CLIENTE");
//		for (Object[] objects : lista) {
//			System.out.println("NOME: " + objects[0]);
//			System.out.println("CPF: " + objects[1]);
//		}
//		
//		//Contar a quantidade de Clientes
//		long qtd = clienteDao.count();
//		System.out.println("CLIENTES CADASTRADOS: " + qtd);
//	
		
		System.exit(0);
	}

}





