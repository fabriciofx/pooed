package com.github.fabriciofx.pooed.expressaoavancada;

public class Soma extends Expressao {
	public Soma(Elemento... elementos) {
		super(elementos);
	}

	@Override
	public double avaliacao() {
		double r = 0.0;

		for (Elemento e : elementos()) {
			r = r + e.avaliacao();
		}

		return r;
	}
	
	@Override
	public String representacao() {
		return representacao("+");
	}	
}
