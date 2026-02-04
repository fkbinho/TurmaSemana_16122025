package poo_abstract;

public class Principal {

	public static void main(String[] args) {
		List<Pagamento> pagamentos = new ArrayList<>();
		
		Pagamento pgmtoDinheiro = new PagamentoDinheiro(100.0, 150.0);
		
		if (pgmtoDinheiro.processar()) {
			System.out.println(pgmtoDinheiro);
		} else {
			System.out.println("Pagamento em dinheiro recusado!");
		}
		
		Pagamento pgmtoCartao = new PagamentoCartao(200.0);
		Pagamento pgmtoPix = new PagamentoPix(250.0);
		
	
	}

}
