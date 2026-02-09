package view;

import java.util.List;

import model.Pagamento;

public class PagamentoView {

	public void mostrarHistorico(List<Pagamento> pagamentos) {
		if(pagamentos.isEmpty()) {
			System.out.println("Nenhum venda registrada.");
			return;
		}
		System.out.println("Histórico de Pagamentos:");
		for (Pagamento pagamento : pagamentos) {
			System.out.println(pagamento);
			System.out.println("------------");
		}
	}
	
	public void msg(String mensagem) {
		System.out.println(mensagem);
	}
}
