package br.ufpe.cin.banco.exception;

public class ContaInexistenteException extends BancoException {
	public ContaInexistenteException() {
		super("Conta Inexistente!");
	}
	private double saldo;
	//...
}
