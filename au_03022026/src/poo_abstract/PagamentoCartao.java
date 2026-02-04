package poo_abstract;

public class PagamentoCartao extends Pagamento{

	public PagamentoCartao(double valorCompra) {
		super(valorCompra);
	}

	@Override
	public boolean processar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String gerarComprovante() {
		// TODO Auto-generated method stub
		return null;
	}

}
