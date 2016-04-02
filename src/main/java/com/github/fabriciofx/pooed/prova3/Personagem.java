package com.github.fabriciofx.pooed.prova3;

public interface Personagem {
	public void anda(int direcao);

	public void corre(int direcao);

	public void pula(int direcao);

	public void atira(int direcao);
	
	public void bloqueia();
	
	public void recolhe(Item item);
	
	public void utiliza(Item item);
}
