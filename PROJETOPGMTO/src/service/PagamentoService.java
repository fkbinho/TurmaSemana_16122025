package service;

import java.util.List;

import model.Pagamento;
import model.PagamentoCartao;
import model.PagamentoDinheiro;
import model.PagamentoPix;
import repository.VendaRepository;

public class PagamentoService {
	private final VendaRepository repository;

    public PagamentoService(VendaRepository repository) {
        this.repository = repository;
    }

	public boolean finalizarCompra(int tipo, double valorCompra, double extra) {
		Pagamento pagamento = criarPagamento(tipo, valorCompra, extra);

        boolean ok = pagamento.processar();
        if (ok) repository.salvar(pagamento);

        return ok;
	}
	
	public List<Pagamento> listarHistorico() {
		return repository.listar();
	}
	
	private Pagamento criarPagamento(int tipo, double valorCompra, double extra) {
		switch (tipo) {
			case 1:
				return new PagamentoDinheiro(valorCompra, extra); // extra -> valor pago
			case 2:
				return new PagamentoCartao(valorCompra, (int) extra); // extra -> taxa %
			case 3:
				return new PagamentoPix(valorCompra, extra); // extra -> desconto
			default:
				throw new IllegalArgumentException("Tipo de pagamento inválido: " + tipo);
		}
    }

}
