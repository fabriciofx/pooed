package com.github.fabriciofx.pooed.expressaoavancada;

public class Numero implements Elemento {
	private double valor;
	
	public Numero(double valor) {
		this.valor = valor;
	}
	
	@Override
	public double avaliacao() {
		return valor;
	}
	
	public double fracao(double valor) {
		return valor % 1;
	}
	
	private long inteiro(double valor) {
		return (long) (valor - fracao(valor));
	}

	private boolean real(double valor) {
		return valor % 1 == 0;
	}
	
	@Override
	public String representacao() {
		String r;
		if (real(valor)) {
			r = inteiro(valor) + "";
		} else {
			r = valor + "";
		}
		return r;
	}
}
