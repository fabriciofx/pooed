package com.github.fabriciofx.pooed.expressaoavancada;

public abstract class Expressao implements Elemento {
	private Elemento[] elementos;

	public Expressao(Elemento... elementos) {
		this.elementos = elementos;
	}
	
	public Elemento[] elementos() {
		return elementos;
	}
	
	public String representacao(String simbolo) {
		StringBuilder sb = new StringBuilder();
		Elemento[] elementos = elementos();
		
		for (int i = 0; i < elementos.length - 1; i++) {
			sb.append(elementos[i].representacao()).append(" " + simbolo + " ");
		}

		sb.append(elementos[elementos.length - 1].representacao());
		return sb.toString();
	}
}
