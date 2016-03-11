package br.ufpe.cin.banco.clientes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.ufpe.cin.banco.exception.ClienteInexistenteException;

public class RepositorioClienteColecao implements IRepositorioClientes {

	private List<Cliente> lista;

	public RepositorioClienteColecao() {
		lista = new ArrayList<Cliente>();
	}

	@Override
	public void atualizar(Cliente c) throws ClienteInexistenteException {
		int ind = lista.indexOf(c);
		if (ind != -1) {
			lista.set(ind, c);
		} else {
			throw new ClienteInexistenteException();
		}
	}

	@Override
	public boolean existe(String cpf) {
		return lista.contains(cpf);
	}

	@Override
	public void inserir(Cliente c) {
		lista.add(c);
	}

	@Override
	public Cliente procurar(String cpf) throws ClienteInexistenteException {
		return null;
	}
	/*O m�todo de procura utilizado pelo Map �, em uma vis�o inicial, melhor que o List
	visto que ao passar uma parametro de busca o HashMap o acessa diretamente via Key
	O problema do Map seria justamente se limitar a realizar buscas diretas apenas pela 
	chave, com outro parametro qualquer seria o mesmo caso de um outro array qualquer
	percorrendo seus elementos com um iterator*/

	@Override
	public void remover(String cpf) throws ClienteInexistenteException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> listar() {
		Collections.sort(lista);
		return lista;
		/*
		 * nessa implementa��o como j� insiro diretamente em uma cole��o eu n�o
		 * preciso fazer com que cada elemento de um vetor seja passado para a
		 * lista.
		 */
	}

}
