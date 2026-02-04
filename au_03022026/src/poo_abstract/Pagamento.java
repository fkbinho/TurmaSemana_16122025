package poo_abstract;

import java.util.UUID;

public abstract class Pagamento implements Processavel {

	private double valorCompra;
	private String idTransacao;
	
	public Pagamento(double valorCompra) {
		this.valorCompra = valorCompra;
		this.idTransacao = UUID.randomUUID().toString().substring(0, 8);
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public String getIdTransacao() {
		return idTransacao;
	}

	public void setIdTransacao(String idTransacao) {
		this.idTransacao = idTransacao;
	}
	
	@Override
	public abstract boolean processar();
	
	@Override
	public String gerarComprovante() {
		return "Transação: " + idTransacao + 
				" | Valor da Compra: R$ " + String.format("%.2f", valorCompra);
	}
	
	@Override
	public String toString() {
		return gerarComprovante();
	}

	
	
	
	
	
}
