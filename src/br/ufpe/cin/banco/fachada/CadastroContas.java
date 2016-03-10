package br.ufpe.cin.banco.fachada;
import br.ufpe.cin.banco.contas.ContaAbstrata;
import br.ufpe.cin.banco.contas.IRepositorioContas;
import br.ufpe.cin.banco.exception.ContaExistenteException;
import br.ufpe.cin.banco.exception.ContaInexistenteException;
import br.ufpe.cin.banco.exception.SaldoInsuficienteException;

public class CadastroContas {

	private IRepositorioContas contas;

	public CadastroContas(IRepositorioContas r) {
		this.contas = r;
	}

	public void atualizar(ContaAbstrata c) throws ContaInexistenteException {
		contas.atualizar(c);
	}

	public void cadastrar(ContaAbstrata c) throws ContaExistenteException {
		if (!contas.existe(c.getNumero())) {
			contas.inserir(c);
		}
	}

	public void creditar(String n, double v) throws ContaInexistenteException {
		ContaAbstrata c = contas.procurar(n);
		c.creditar(v);
	}

	public void debitar(String n, double v) throws ContaInexistenteException, SaldoInsuficienteException {
		ContaAbstrata c = contas.procurar(n);
		c.debitar(v);
	}

	public void remover(String n) throws ContaInexistenteException {
		contas.remover(n);
	}

	public ContaAbstrata procurar(String n) throws ContaInexistenteException {
		return contas.procurar(n);
	}

	public void transferir(String origem, String destino, double val)
			throws ContaInexistenteException, SaldoInsuficienteException {
		ContaAbstrata o = contas.procurar(origem);
		ContaAbstrata d = contas.procurar(destino);
		o.transferir(d, val);
	}
}