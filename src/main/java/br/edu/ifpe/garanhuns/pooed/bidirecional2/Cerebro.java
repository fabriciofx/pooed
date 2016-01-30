package br.edu.ifpe.garanhuns.pooed.bidirecional2;

public final class Cerebro {
	private final String nome;
	private final Corpo corpo;

	// O Cérebro possui nome e um (objeto) Corpo
	public Cerebro(final String nome, final Corpo corpo) {
		this.nome = nome;
		this.corpo = corpo;
	}

	public String nome() {
		return nome;
	}

	public Corpo corpo() {
		return corpo;
	}

	@Override
	public String toString() {
		return String.format("Cerebro [nome=%s, corpo=%s]", nome,
				corpo != null ? corpo.nome() : "(null)");
	}
}
