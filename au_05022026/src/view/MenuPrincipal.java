package view;

import util.Input;

public class MenuPrincipal {

	public MenuPrincipal() {
		
	}
	
	public void iniciar() {
		int op = -1;
		while(op != 0) {
			System.out.println("\n=== CAIXA ===");
	        System.out.println("1 - Finalizar compra");
	        System.out.println("2 - Ver histórico");
	        System.out.println("0 - Sair");
	        op = Input.lerInt("Escolha uma opção:");
	        
	        executar(op);
		}
		
        System.out.println("Encerrado o caixa...");
	}

	private void executar(int op) {
		if(op == 1) {
			finalizar();
		} else if(op == 2) {
			
		} else if(op == 0) {
			
		} else {
			System.out.println("Opção inválida.");
		}
	}

	private void finalizar() {
		double valorCompra = Input.lerDouble("Digite o valor da compra:");
		
		System.out.println("Pagamento: 1- Dinheiro, 2- Cartão, 3 - Pix");
		int tipo = Input.lerInt("Escolha a forma de pagamento:");
		
		double extra;
		if(tipo == 1) {
			extra = Input.lerDouble("Digite o valor pago: R$ ");
		} else if(tipo == 2) {
			extra = Input.lerDouble("Taxa do Cartão (%): ");
		} else if(tipo == 3) {
			extra = Input.lerDouble("Desconto do Pix (%): ");
		} else {
			System.out.println("Forma de pagamento inválida.");
			return;
		}
		
		
		
		
		
		
		
		
	}
	
}
