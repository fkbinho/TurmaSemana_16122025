package model;

public class PagamentoCartao extends Pagamento {

	private double taxaPercentual;
	
	public PagamentoCartao(double valorCompra, double taxaPercentual) {
		super(valorCompra);
		this.taxaPercentual = taxaPercentual;
	}

	@Override
	public boolean processar() {
		return true;
	}
	
	public double totalComTaxa() {
		return getValorCompra() * (1 + taxaPercentual / 100);
	}

	@Override
	public String gerarComprovante() {
		return comprovanteBase() +
			   "Forma de Pagamento: Cartão\n" +
			   "Taxa Percentual: " + String.format("%.2f", taxaPercentual) + "%\n" +
			   "Total com Taxa: R$ " + String.format("%.2f", totalComTaxa()) + "\n";
	}

}
