package br.ufpe.cin.banco.contas;
import br.ufpe.cin.banco.exception.ContaInexistenteException;

public interface IRepositorioContas {

	void inserir(ContaAbstrata c);

	boolean existe(String num);

	void atualizar(ContaAbstrata c) throws ContaInexistenteException;

	ContaAbstrata procurar(String num) throws ContaInexistenteException;

	void remover(String num) throws ContaInexistenteException;

}