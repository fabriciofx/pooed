package br.edu.ifpe.garanhuns.pooed.prova4;

public class Item {
	private Produto produto;
	private int quantidade;
	private double preco;

	public Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = produto.getPreco();
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return preco * quantidade;
	}
}
