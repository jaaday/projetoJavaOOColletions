
public class ContaExistenteException extends BancoException {
	public ContaExistenteException() {
		super("Conta ja existe!");
	}
	private double saldo;
	//...
}
