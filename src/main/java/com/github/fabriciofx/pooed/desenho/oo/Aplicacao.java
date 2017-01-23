package com.github.fabriciofx.pooed.desenho.oo;

public class Aplicacao {
	public static void main(String[] args) {
		Janela janela = new Janela();
		janela.adiciona(
			new Quadro(
				new Linha(100, 100, 200, 200),
				new Retangulo(250, 250, 100, 100)
			)
		);
		janela.mostra();
	}
}
