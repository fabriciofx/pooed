package br.edu.ifpe.garanhuns.pooed.loja;

public class Pedido {
	private Cliente cliente;
	private Item[] itens;
	private int quantidadeItens;

	public Pedido(Cliente cliente) {
		this.cliente = cliente;
		this.itens = new Item[10];
		this.quantidadeItens = 0;
	}

	public void adiciona(Item item) {
		if (quantidadeItens < itens.length) {
			itens[quantidadeItens] = item;
			quantidadeItens++;
		}
	}

	public double calculaTotal() {
		double total = 0.0;

		for (int i = 0; i < quantidadeItens; i++) {
			total = total + itens[i].getValor();
		}

		return total;
	}

	// Os métodos get e set abaixo não precisam ser escritos na
	// prova!!
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Item[] getItens() {
		return itens;
	}
}
