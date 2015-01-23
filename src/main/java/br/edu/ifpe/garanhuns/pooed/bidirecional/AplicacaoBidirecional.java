package br.edu.ifpe.garanhuns.pooed.bidirecional;

public class AplicacaoBidirecional {
	public static void main(String[] args) {
		Corpo stallone = new Corpo("Stallone");
		Corpo schwarzenegger = new Corpo("Schwarzenegger");
		Cerebro einstein = new Cerebro("Einstein");
		Cerebro hawking = new Cerebro("Hawking");
		Cerebro feynman = new Cerebro("Feynman");

		// Ok
		stallone.setCerebro(einstein);
		System.out.println(stallone);
		System.out.println(einstein);

		System.out.println("----------------");

		stallone.setCerebro(null);
		System.out.println(stallone);
		System.out.println(einstein);

		System.out.println("----------------");
				
		stallone.setCerebro(hawking);
		System.out.println(stallone);
		System.out.println(hawking);
		System.out.println(einstein);

		System.out.println("----------------");
		
		stallone.setCerebro(feynman);
		System.out.println(stallone);
		System.out.println(feynman);
		System.out.println(hawking);
		System.out.println(einstein);

		System.out.println("----------------");
		
		einstein.setCorpo(schwarzenegger);
		System.out.println(schwarzenegger);
		System.out.println(einstein);		
	}
}
