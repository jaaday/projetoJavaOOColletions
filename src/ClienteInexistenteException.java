
public class ClienteInexistenteException extends BancoException {
	public ClienteInexistenteException() {
		super("Cliente inexistente!");
	}
	private double saldo;
	//...
}
