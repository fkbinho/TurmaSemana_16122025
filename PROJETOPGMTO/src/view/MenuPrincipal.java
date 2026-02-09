package view;

import controller.PagamentoController;
import repository.VendaRepository;
import service.PagamentoService;
import util.Input;

public class MenuPrincipal {
	private final PagamentoController controller;
    private final PagamentoView view;

    public MenuPrincipal() {
        VendaRepository repository = new VendaRepository();
        PagamentoService service = new PagamentoService(repository);
        this.controller = new PagamentoController(service);
        this.view = new PagamentoView();
    }
    
    public void iniciar() {
    	int op = -1;
    	while(op != 0) {
    		System.out.println("\n=== CAIXA ===");
            System.out.println("1 - Finalizar compra");
            System.out.println("2 - Ver histórico");
            System.out.println("0 - Sair");
            op = Input.lerInt("Escolha:");

            executar(op);
    	}
    	
    	view.msg("Encerrando caixa...");
    }
    
    private void executar(int op) {
        if (op == 1) finalizar();
        else if (op == 2) view.mostrarHistorico(controller.historico());
        else if (op == 0) { /* sair */ }
        else view.msg("Opção inválida.");
    }
    
    private void finalizar() {
        double valorCompra = Input.lerDouble("Valor da compra: R$ ");

        System.out.println("Pagamento: 1-Dinheiro | 2-Cartão | 3-PIX");
        int tipo = Input.lerInt("Tipo: ");

        double extra;
        if (tipo == 1) {
            extra = Input.lerDouble("Valor pago: R$ ");
        } else if (tipo == 2) {
            extra = Input.lerDouble("Taxa do cartão (%): ");
        } else if (tipo == 3) {
            extra = Input.lerDouble("Desconto PIX (%): ");
        } else {
            view.msg("Tipo inválido.");
            return;
        }

        boolean ok = controller.finalizar(tipo, valorCompra, extra);
        if (ok) view.msg("Pagamento aprovado! Venda registrada.");
        else view.msg("Pagamento recusado (dinheiro insuficiente).");
    }
}
