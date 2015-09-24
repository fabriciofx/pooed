package br.edu.ifpe.garanhuns.pooed.zoologico;

public class Teste {
	public static void main(String[] args) {
		Zoologico zoologico = new Zoologico();
		
		zoologico.recebe(new Leao("Alex", "Corajosus", "Amarelo"));
		zoologico.recebe(new Leao("Simba", "Brabus", "Amarelo"));
		zoologico.recebe(new Zebra("Martin", "Amigos", "Branco e Preto"));

		zoologico.cante();
	}
}
