package com.github.fabriciofx.pooed.matematica;

public class Multiplicacao implements Operacao {
	private double[] numeros;

	public Multiplicacao(double... numeros) {
		this.numeros = numeros;
	}

	@Override
	public double resultado() {
		double r = 1.0;

		for (double n : numeros) {
			r = r * n;
		}

		return r;
	}
	
	@Override
	public String toString() {
		return resultado() + "";
	}
}
