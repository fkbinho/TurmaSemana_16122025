package repository;

import java.util.ArrayList;
import java.util.List;

import model.Pagamento;

public class VendaRepository {
	private final List<Pagamento> historico = new ArrayList<>();

	public void salvar(Pagamento pagamento) {
		historico.add(pagamento);
	}
}
