
public class SaldoInsuficienteException extends BancoException {
	public SaldoInsuficienteException() {
		super("Saldo insuficiente!");
	}
	private double saldo;
	//...
}
