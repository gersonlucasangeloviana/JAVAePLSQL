package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.exceptions.DBCommitException;
import br.com.fiap.exceptions.IdNotFoundException;

/**
 * Inteface que define as funcionalidades 
 * gen�ricas do DAO (CRUD)
 * 
 * @author Thiago 
 *
 * @param <T> - Classe da Entidade
 * @param <K> - Classe do Tipo da chave prim�ria
 */
public interface DAO<T,K> {

	void insert(T entity) throws DBCommitException;
	void update(T entity) throws DBCommitException;
	void proc(T entity, K p) throws DBCommitException;
	void delete(K id) throws DBCommitException, 
								IdNotFoundException;
	T findById(K id);
	
	List<T> list();
	
	long count();
	
}





