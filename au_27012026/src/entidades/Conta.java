package entidades;

public class Conta {
	
	// Atributos
	private String titular;
	private String agencia;
	private String conta;
	protected double saldo;
		
	//Construtor	
	public Conta (String titular) {
		this.titular = titular;
	}
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		this.agencia = "0001";
		this.conta = "00541";
	}
	
	// Métodos
	public void depositar(double valor) {
		saldo += valor; // saldo = saldo + valor
	}
	
	public void sacar(double valor) {
		saldo -= valor; // saldo = saldo - valor
	}
	
	public void transferir(double valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
	}
	
	// Getters e Setters
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}
	
	public double getSaldo() {
		return saldo;
	}

	@Override // sobreescrever
	public String toString() {
		return "Titular: " + titular + 
				"\nAgencia: " + agencia + 
				"\nConta: " + conta + 
				"\nSaldo: " + saldo;
	}
	
}
