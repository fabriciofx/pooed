package com.github.fabriciofx.pooed.zoologico;

public class Zoologico {
	Animal[] animais;
	int posicao;
	
	public Zoologico() {
		animais = new Animal[20];
		posicao = 0;
	}
	
	public void recebe(Animal a) {
		if (posicao < animais.length) {
			animais[posicao] = a;
			posicao++;
		}
	}
	
	public void cante() {
		for (int i = 0; i < posicao; i++) {
			animais[i].emiteSom();
		}
	}
}
