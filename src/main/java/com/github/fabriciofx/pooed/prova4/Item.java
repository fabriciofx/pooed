package com.github.fabriciofx.pooed.prova4;

public class Item {
	private Produto produto;
	private int quantidade;
	private double preco;

	public Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = produto.getPreco();
	}

	// Não precisava colocar os métodos gets e sets!	
	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	// Já este método, era necessário!
	public double getValor() {
		return preco * quantidade;
	}
}
