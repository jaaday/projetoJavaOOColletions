package br.ufpe.cin.banco.exception;

public class ClienteInvalidoException extends BancoException {
	public ClienteInvalidoException() {
		super("Cliente invalido!");
	}
	private double saldo;
	//...
}
