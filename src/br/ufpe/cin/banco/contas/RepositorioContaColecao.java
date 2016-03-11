package br.ufpe.cin.banco.contas;

import java.util.HashMap;
import java.util.Map;

import br.ufpe.cin.banco.exception.ContaInexistenteException;

public class RepositorioContaColecao implements IRepositorioContas {

	private Map<String, ContaAbstrata> mp = new HashMap<String, ContaAbstrata>();

	@Override
	public void inserir(ContaAbstrata c) {
		if(!existe(c.getNumero())){
			mp.put(c.getNumero(), c);
		}
	}
	/*Devido a esta utilizando hash o acesso é direto porque é unico
	logo saber se está contido ou não em uma coleção é feito direto sem percorrer a lista.*/

	@Override
	public boolean existe(String num) {
		return mp.containsKey(num);
	}

	@Override
	public void atualizar(ContaAbstrata c) throws ContaInexistenteException {
		if(!existe(c.getNumero())){
			mp.replace(c.getNumero(), c);
		} else {
			throw new ContaInexistenteException();
		}
	}

	@Override
	public ContaAbstrata procurar(String num) throws ContaInexistenteException {
		if(existe(num)){
			return mp.get(num);
		} else {
			throw new ContaInexistenteException();
		}
		
	}

	@Override
	public void remover(String num) throws ContaInexistenteException {
		if(!existe(num)){
			mp.remove(num);
		} else {
			throw new ContaInexistenteException();
		}
	}

	@Override
	public Map<String, ContaAbstrata> listar() {
		return mp;
	}

}
