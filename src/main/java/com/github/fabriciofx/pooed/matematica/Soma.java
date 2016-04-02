package com.github.fabriciofx.pooed.matematica;

public class Soma implements Operacao {
	private double[] numeros;

	public Soma(double... numeros) {
		this.numeros = numeros;
	}

	@Override
	public double resultado() {
		double r = 0.0;

		for (double n : numeros) {
			r = r + n;
		}

		return r;
	}
	
	@Override
	public String toString() {
		return resultado() + "";
	}
}
