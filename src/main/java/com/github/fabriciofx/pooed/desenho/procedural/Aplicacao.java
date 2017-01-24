package com.github.fabriciofx.pooed.desenho.procedural;

public class Aplicacao {
	public static void main(String[] args) {
		Janela janela = new Janela();
		janela.adiciona(new Quadro(1, 2));
		janela.mostra();
	}
}
