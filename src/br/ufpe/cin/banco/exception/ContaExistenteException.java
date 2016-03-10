package br.ufpe.cin.banco.exception;

public class ContaExistenteException extends BancoException {
	public ContaExistenteException() {
		super("Conta ja existe!");
	}
	private double saldo;
	//...
}
