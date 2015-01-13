package br.edu.ifpe.garanhuns.pooed.prova4;

public class Produto {
	private String nome;
	private String descricao;
	private double preco;

	public Produto(String nome, String descricao, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	// Não precisava colocar os métodos gets e sets!	
	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}
}
