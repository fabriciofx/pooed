package com.github.fabriciofx.pooed.recprova4novo;

public class Juro {
	private double valor;
	
	public Juro(double valor) {
		this.valor = valor;
	}
	
	public double valor() {
		return valor;
	}

	public double calcula(double quantia) {
		return quantia * valor;
	}
}
