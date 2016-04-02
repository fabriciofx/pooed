package com.github.fabriciofx.pooed.bidirecional;

public class Cerebro {
	private String nome;
	private Corpo corpo;

	public Cerebro(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Corpo getCorpo() {
		return corpo;
	}

	public void setCorpo(Corpo corpo) {
		// Se for passado um objeto com null, zera a referência
		// e interrompe a execução dos outros passos
		if (corpo == null) {
			this.corpo = null;
			return;
		}

		if (this.corpo != null) {
			this.corpo.setCerebro(null);
		}

		this.corpo = corpo;

		// Evita a chamada recursiva
		if (corpo.getCerebro() != this) {
			corpo.setCerebro(this);
		}
	}

	@Override
	public String toString() {
		String nomeDoCorpo = corpo != null ? corpo.getNome() : "(null)";

		return "Cerebro [nome=" + nome + ", corpo=" + nomeDoCorpo + "]";
	}
}
