package br.ufpe.cin.banco.fachada;

import br.ufpe.cin.banco.clientes.Cliente;
import br.ufpe.cin.banco.clientes.IRepositorioClientes;
import br.ufpe.cin.banco.exception.ClienteExistenteException;
import br.ufpe.cin.banco.exception.ClienteInexistenteException;
import br.ufpe.cin.banco.exception.ClienteInvalidoException;

public class CadastroClientes {
	private IRepositorioClientes clientes;

	public CadastroClientes(IRepositorioClientes rep) {
		this.clientes = rep;
	}

	public void atualizar(Cliente c) throws ClienteInexistenteException {
		clientes.atualizar(c);
	}

	public void cadastrar(Cliente c) throws ClienteExistenteException, ClienteInvalidoException {
		String cpf = c.getCpf();
		if (!clientes.existe(cpf)) {
			clientes.inserir(c);
		}
	}

	public void descadastrar(String cpf) throws ClienteInexistenteException {
		clientes.remover(cpf);
	}

	public Cliente procurar(String cpf) throws ClienteInexistenteException {
		return clientes.procurar(cpf);
	}
}