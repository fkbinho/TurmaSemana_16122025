package entidades;
								// super classe
public class ContaPoupanca extends Conta {
	public double taxaRendimento;

	public ContaPoupanca(String titular) {
		super(titular);
	}
	
	public ContaPoupanca(String titular, double saldo) {
		super(titular, saldo);
	}
	
	@Override
	public String toString() {
		System.out.println("=== Conta Poupança ===");
		return super.toString();
	}
		
				

}
