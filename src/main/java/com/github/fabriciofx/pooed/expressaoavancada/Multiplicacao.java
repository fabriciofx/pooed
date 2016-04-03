package com.github.fabriciofx.pooed.expressaoavancada;

public class Multiplicacao extends Expressao {
	public Multiplicacao(Elemento... elementos) {
		super(elementos);
	}

	@Override
	public double avaliacao() {
		double r = 1.0;

		for (Elemento e : elementos()) {
			r = r * e.avaliacao();
		}

		return r;
	}

	@Override
	public String representacao() {
		return representacao("*");
	}
}
