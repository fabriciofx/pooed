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
		// Se for passado um objeto com null, zera a referência
		// e interrompe a execução dos outros passos
		if (cerebro == null) {
			this.cerebro = null;
			return;
		}

		if (this.cerebro != null) {
			this.cerebro.setCorpo(null);
		}

		this.cerebro = cerebro;

		// Evita a chamada recursiva
		if (cerebro.getCorpo() != this) {
			cerebro.setCorpo(this);
		}
	}

	@Override
	public String toString() {
		String nomeDoCerebro = cerebro != null ? cerebro.getNome() : "(null)";

		return "Corpo [nome=" + nome + ", cerebro=" + nomeDoCerebro + "]";
	}
}
