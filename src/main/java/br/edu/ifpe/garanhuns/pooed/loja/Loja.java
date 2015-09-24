package br.edu.ifpe.garanhuns.pooed.loja;

public class Loja {
	private Pedido[] pedidos;
	private int quantidadeItens;

	public Loja() {
		this.pedidos = new Pedido[20];
		this.quantidadeItens = 0;
	}

	public void adiciona(Pedido pedido) {
		if (quantidadeItens < pedidos.length) {
			pedidos[quantidadeItens] = pedido;
			quantidadeItens++;
		}
	}

	public double calculaTotalPedidos() {
		double total = 0.0;

		for (int i = 0; i < quantidadeItens; i++) {
			total = total + pedidos[i].calculaTotal();
		}

		return total;
	}
}
