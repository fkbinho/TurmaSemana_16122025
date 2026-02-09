package model;

public class PagamentoDinheiro extends Pagamento{

	private double valorPago;
	private double troco;
	
	public PagamentoDinheiro(double valorCompra, double valorPago) {
		super(valorCompra);
		this.valorPago = valorPago;
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
		return comprovanteBase() +
			   "Forma de Pagamento: Dinheiro\n" +
			   "Valor Pago: R$ " + String.format("%.2f", valorPago) + "\n" +
			   "Troco: R$ " + String.format("%.2f", troco) + "\n";
		
	}

	
}
