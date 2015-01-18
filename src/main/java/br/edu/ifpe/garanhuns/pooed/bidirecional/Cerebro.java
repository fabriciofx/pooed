package br.edu.ifpe.garanhuns.pooed.bidirecional;

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
		if (this.corpo == null && corpo != null) {
			this.corpo = corpo;

			if (corpo.getCerebro() != this) {
				corpo.setCerebro(this);
			}
		} else if (this.corpo != null && corpo != null) {
			this.corpo.setCerebro(null);
			this.corpo = corpo;

			if (corpo.getCerebro() != this) {
				corpo.setCerebro(this);
			}
		} else if (this.corpo != null && corpo == null) {
			this.corpo = null;
		}
	}

	@Override
	public String toString() {
		String nomeDoCorpo = corpo != null ? corpo.getNome() : "(null)";

		return "Cerebro [nome=" + nome + ", corpo=" + nomeDoCorpo + "]";
	}
}
