package model;

public class PagamentoPix extends Pagamento {
	private double descontoPercentual;
	
	public PagamentoPix(double valorCompra, double descontoPercentual) {
		super(valorCompra);
		this.descontoPercentual = descontoPercentual;
	}

	@Override
	public boolean processar() {
		return true;
	}

	public double totalComDesconto() {
		return getValorCompra() * (1 - descontoPercentual / 100);
	}
	
	@Override
	public String gerarComprovante() {
		return comprovanteBase() +
				"Forma de Pagamento: Pix\n" +
				"Desconto Percentual: " + String.format("%.2f", descontoPercentual) + "%\n" +
				"Total com Desconto: R$ " + String.format("%.2f", totalComDesconto()) + "\n";
	}

}
