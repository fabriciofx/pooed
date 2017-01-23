package com.github.fabriciofx.pooed.desenho.oo;

import java.awt.Graphics2D;

public class Retangulo implements Desenho {
	private int x;
	private int y;
	private int largura;
	private int altura;
	
	public Retangulo(int x, int y, int largura, int altura) {
		this.x = x;
		this.y = y;
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public void desenhe(Graphics2D tela) {
		tela.drawRect(x, y, largura, altura);
	}
}
