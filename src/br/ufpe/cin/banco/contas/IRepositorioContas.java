package br.ufpe.cin.banco.contas;
import java.util.Map;

import br.ufpe.cin.banco.exception.ContaInexistenteException;

public interface IRepositorioContas {

	public void inserir(ContaAbstrata c);

	public boolean existe(String num);

	public void atualizar(ContaAbstrata c) throws ContaInexistenteException;

	public ContaAbstrata procurar(String num) throws ContaInexistenteException;

	public void remover(String num) throws ContaInexistenteException;
	
	public Map<String, ContaAbstrata> listar();

}