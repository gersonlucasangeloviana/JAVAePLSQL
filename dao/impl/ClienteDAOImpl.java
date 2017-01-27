package br.com.fiap.dao.impl;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;

public class ClienteDAOImpl extends DAOImpl<Cliente,Integer> implements ClienteDAO{

	public ClienteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Cliente> listar() {
		TypedQuery<Cliente> query = 
			em.createQuery("from Cliente",Cliente.class);
		return query.getResultList();
	}

	@Override
	public List<Cliente> listarPorEstado(String estado) {
		TypedQuery<Cliente> query = em.createQuery(
			"from Cliente c where c.endereco.cidade.uf = :D",Cliente.class);
		query.setParameter("D", estado);
		return query.getResultList();
	}

	@Override
	public List<Cliente> listarPorDiasReserva(int dias) {
		TypedQuery<Cliente> query = em.createQuery(
			"select r.cliente from Reserva r where "
			+ "r.numeroDias = :dias",Cliente.class);
		query.setParameter("dias", dias);
		return query.getResultList();
	}

	@Override
	public List<Object[]> listarNomeCPF() {
		Query query = em.createQuery(
			"select c.nome, c.cpf from Cliente c");
		query.setMaxResults(2); //Máximo de resultados 
		return query.getResultList();
	}

	@Override
	public List<Cliente> getClientePorNome(String nome, String cidade) {
		TypedQuery<Cliente> query = em.createQuery(
			"from Cliente c where upper(c.nome) like upper(:n) and "
			+ "c.endereco.cidade.nome like :c",Cliente.class);
		query.setParameter("n", "%"+nome+"%");
		query.setParameter("c", "%"+cidade+"%");
		return query.getResultList();
	}

	@Override
	public List<Cliente> getClientePorEstado(List<String> estados) {
		TypedQuery<Cliente> query = em.createQuery(
			"from Cliente c where c.endereco.cidade.uf in :e",Cliente.class);
		query.setParameter("e", estados);
		return query.getResultList();
	}

	@Override
	public void Proc(int i, int p) {
		// TODO Auto-generated method stub
		
	}


}



