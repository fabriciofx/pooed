package br.edu.ifpe.garanhuns.pooed.loja;

public class Item {
	private Produto produto;
	private int quantidade;
	private double preco;

	public Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = produto.getPreco();
	}

	public double getValor() {
		return quantidade * preco;
	}

	// Os métodos get e set abaixo não precisam ser escritos na
	// prova!!
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
