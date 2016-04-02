package com.github.fabriciofx.pooed.recprova4;

public class Cliente {
	private String nome;
	private String telefone;

	public Cliente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String nome() {
		return nome;
	}

	public String telefone() {
		return telefone;
	}
}
