package br.edu.ifpe.garanhuns.pooed.bidirecional;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteBidirecional {
	private Corpo stallone = new Corpo("Stallone");
	private Corpo schwarzenegger = new Corpo("Schwarzenegger");
	private Cerebro einstein = new Cerebro("Einstein");
	private Cerebro hawking = new Cerebro("Hawking");

	@Test
	public void colocaUmCerebroEmUmCorpo() {
		stallone.setCerebro(einstein);

		assertEquals("Stallone", stallone.getNome());
		assertEquals("Einstein", stallone.getCerebro().getNome());

		assertEquals("Einstein", einstein.getNome());
		assertEquals("Stallone", einstein.getCorpo().getNome());
	}

	@Test
	public void colocaUmCorpoEmUmCerebro() {
		einstein.setCorpo(stallone);

		assertEquals("Stallone", stallone.getNome());
		assertEquals("Einstein", stallone.getCerebro().getNome());

		assertEquals("Einstein", einstein.getNome());
		assertEquals("Stallone", einstein.getCorpo().getNome());
	}

	@Test
	public void trocaUmCerebroEmUmCorpo() {
		stallone.setCerebro(einstein);
		stallone.setCerebro(hawking);

		assertEquals("Stallone", stallone.getNome());
		assertEquals("Hawking", stallone.getCerebro().getNome());

		assertEquals("Hawking", hawking.getNome());
		assertEquals("Stallone", hawking.getCorpo().getNome());

		assertEquals("Einstein", einstein.getNome());
		assertEquals(null, einstein.getCorpo());
	}

	@Test
	public void trocaUmCorpoEmUmCerebro() {
		einstein.setCorpo(stallone);
		einstein.setCorpo(schwarzenegger);

		assertEquals("Einstein", einstein.getNome());
		assertEquals("Schwarzenegger", einstein.getCorpo().getNome());

		assertEquals("Schwarzenegger", schwarzenegger.getNome());
		assertEquals("Einstein", schwarzenegger.getCerebro().getNome());

		assertEquals("Stallone", stallone.getNome());
		assertEquals(null, stallone.getCerebro());
	}
}
