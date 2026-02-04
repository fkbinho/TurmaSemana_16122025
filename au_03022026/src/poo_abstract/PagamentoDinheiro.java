package poo_abstract;

public class PagamentoDinheiro extends Pagamento{
	private double valorPago;
	private double troco;
	
	public PagamentoDinheiro(double valorCompra, double valorPago) {
		super(valorCompra);
		this.valorPago = valorPago;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public double getTroco() {
		return troco;
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}
	
	@Override
	public boolean processar() {
		if (valorPago < getValorCompra()) {
			return false;
		} 
		
		troco = valorPago - getValorCompra();
		return true;
	}
	
	@Override
	public String gerarComprovante() {
		return super.gerarComprovante() +
				"\n| Tipo: Dinheiro" +
				"\n| Valor Pago: R$ " + String.format("%.2f", valorPago) +
				"\n| Troco: R$ " + String.format("%.2f", troco);
	}
}
