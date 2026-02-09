package controller;

import service.PagamentoService;

public class PagamentoController {
	private final PagamentoService service;
	
	public PagamentoController(PagamentoService service) {
		this.service = service;
	}
	
	public boolean finalizar(int tipo, double valorCompra, double extra) {
		return service.finalizarCompra(tipo, valorCompra, extra);
	}
}
