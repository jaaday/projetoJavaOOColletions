package br.ufpe.cin.banco.clientes;
import java.util.List;

import br.ufpe.cin.banco.exception.ClienteInexistenteException;

public interface IRepositorioClientes {

	public abstract void atualizar(Cliente c) throws ClienteInexistenteException;

	public abstract boolean existe(String cpf);

	public abstract void inserir(Cliente c);

	public abstract Cliente procurar(String cpf) throws ClienteInexistenteException;

	public abstract void remover(String cpf) throws ClienteInexistenteException;
	
	public List<Cliente> listar();

}