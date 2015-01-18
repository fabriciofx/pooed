package br.edu.ifpe.garanhuns.pooed.bidirecional;

public class Corpo {
	private String nome;
	private Cerebro cerebro;

	public Corpo(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Cerebro getCerebro() {
		return cerebro;
	}

	public void setCerebro(Cerebro cerebro) {
		if (this.cerebro == null && cerebro != null) {
			this.cerebro = cerebro;

			if (cerebro.getCorpo() != this) {
				cerebro.setCorpo(this);
			}
		} else if (this.cerebro != null && cerebro != null) {
			this.cerebro.setCorpo(null);
			this.cerebro = cerebro;

			if (cerebro.getCorpo() != this) {
				cerebro.setCorpo(this);
			}
		} else if (this.cerebro != null && cerebro == null) {
			this.cerebro = null;
		}
	}

	@Override
	public String toString() {
		String nomeDoCerebro = cerebro != null ? cerebro.getNome() : "(null)";

		return "Corpo [nome=" + nome + ", cerebro=" + nomeDoCerebro + "]";
	}
}
