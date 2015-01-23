package br.edu.ifpe.garanhuns.pooed.recprova4novo;

import br.edu.ifpe.garanhuns.pooed.recprova4novo.LimiteException;

public class Limite {
	private double valor;

	public Limite(double valor) {
		this.valor = valor;
	}

	public double valor() {
		return valor;
	}

	public void aprova(double quantia) throws LimiteException {
		if (quantia > valor) {
			throw new LimiteException("quantia acima do limite");
		}
	}
}
