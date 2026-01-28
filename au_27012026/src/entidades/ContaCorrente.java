package entidades;

public class ContaCorrente extends Conta {

	public ContaCorrente(String titular, double saldo) {
		super(titular, saldo);
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor + 3.0; 
	}

}
