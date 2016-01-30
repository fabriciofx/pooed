package br.edu.ifpe.garanhuns.pooed.bidirecional2;

public final class Corpo {
	private final String nome;
	private final Cerebro cerebro;

	// O Corpo possui um nome e um (objeto) Cerebro.
	// Mas perceba que não é passado um *Cerebro* para o corpo,
	// e sim o *nome* do Cerebro.
	// Problemas: perda de semântica e encapsulamento.
	public Corpo(final String nome, final String nomeCerebro) {
		this.nome = nome;
		this.cerebro = new Cerebro(nomeCerebro, this);
	}

	public String nome() {
		return nome;
	}

	public Cerebro cerebro() {
		return cerebro;
	}

	@Override
	public String toString() {
		return String.format("Corpo [nome=%s, cerebro=%s]", nome,
				cerebro != null ? cerebro.nome() : "(null)");
	}
}
