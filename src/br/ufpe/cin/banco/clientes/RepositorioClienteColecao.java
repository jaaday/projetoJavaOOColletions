package br.ufpe.cin.banco.clientes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.ufpe.cin.banco.exception.ClienteInexistenteException;

public class RepositorioClienteColecao implements IRepositorioClientes {

	private List<Cliente> lista = new ArrayList<>();
	
	@Override
	public void atualizar(Cliente c) throws ClienteInexistenteException {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean existe(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void inserir(Cliente c) {
		lista.add(c);
	}

	@Override
	public Cliente procurar(String cpf) throws ClienteInexistenteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(String cpf) throws ClienteInexistenteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> listar() {
		Collections.sort(lista);
		return lista;  
		/*nessa implementação como já insiro diretamente em uma coleção 
		eu não preciso fazer com que cada elemento de um vetor seja passado para a lista.*/
	}

}
