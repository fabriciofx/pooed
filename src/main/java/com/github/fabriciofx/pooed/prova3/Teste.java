package com.github.fabriciofx.pooed.prova3;

// Esta classe n�o precisa fazer na prova. Apenas criei
// para voc�s verem como poderia ser a utiliza��o das classes
// e interfaces. Tamb�m lembrem-se que isto � apenas uma
// SUGEST�O de cria��o de classes. Outras abordagem tamb�m
// PODEM estar corretas.
public class Teste {
	public static void main(String[] args) {
		Personagem terran = new Terran();
		Personagem protoss = new Protoss();
		Personagem zerg = new Zerg();
		
		Item canhaoDePlasma = new Item();
		
		terran.anda(Direcao.DIREITA);
		protoss.atira(Direcao.BAIXO);
		zerg.corre(Direcao.CIMA);
		
		terran.recolhe(canhaoDePlasma);
		terran.utiliza(canhaoDePlasma);
	}
}
