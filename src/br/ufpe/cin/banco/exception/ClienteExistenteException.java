package br.ufpe.cin.banco.exception;

public class ClienteExistenteException extends BancoException {
	public ClienteExistenteException() {
		super("Cliente ja existe!");
	}
	private double saldo;
	//...
}
