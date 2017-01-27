package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDAO extends DAO<Cliente,Integer>{

	public List<Cliente> listar();
	
	public List<Cliente> listarPorEstado(String estado);
	
	public List<Cliente> listarPorDiasReserva(int dias);
	
	public List<Object[]> listarNomeCPF();
	
	public List<Cliente> getClientePorNome(String nome, String cidade);
	
	public List<Cliente> getClientePorEstado(List<String> estados);
	
	public void Proc(int i, int p);
	
}
