
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object c = new Conta("111",100,new Cliente("11","nome",TipoCliente.VIP));
		Cliente cli = (Cliente) c;
	}

}
