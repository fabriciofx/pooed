package com.github.fabriciofx.pooed.bidirecional;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.fabriciofx.pooed.bidirecional.Cerebro;
import com.github.fabriciofx.pooed.bidirecional.Corpo;

public class TesteBidirecional {
	private Corpo stallone = new Corpo("Stallone");
	private Corpo schwarzenegger = new Corpo("Schwarzenegger");
	private Cerebro einstein = new Cerebro("Einstein");
	private Cerebro hawking = new Cerebro("Hawking");
	private Cerebro feynman = new Cerebro("Feynman");

	@Test
	public void colocaCerebroNoCorpo() {
		stallone.setCerebro(einstein);

		assertEquals("Stallone", stallone.getNome());
		assertEquals("Einstein", stallone.getCerebro().getNome());

		assertEquals("Einstein", einstein.getNome());
		assertEquals("Stallone", einstein.getCorpo().getNome());
	}

	@Test
	public void colocaCorpoNoCerebro() {
		einstein.setCorpo(stallone);

		assertEquals("Stallone", stallone.getNome());
		assertEquals("Einstein", stallone.getCerebro().getNome());

		assertEquals("Einstein", einstein.getNome());
		assertEquals("Stallone", einstein.getCorpo().getNome());
	}

	@Test
	public void trocaOCerebroDoCorpo() {
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
	public void trocaOCorpoDoCerebro() {
		einstein.setCorpo(stallone);
		einstein.setCorpo(schwarzenegger);

		assertEquals("Einstein", einstein.getNome());
		assertEquals("Schwarzenegger", einstein.getCorpo().getNome());

		assertEquals("Schwarzenegger", schwarzenegger.getNome());
		assertEquals("Einstein", schwarzenegger.getCerebro().getNome());

		assertEquals("Stallone", stallone.getNome());
		assertEquals(null, stallone.getCerebro());
	}

	@Test
	public void separaOCerebroDoCorpo() {
		stallone.setCerebro(einstein);
		stallone.setCerebro(null);

		assertEquals("Stallone", stallone.getNome());
		assertEquals(null, stallone.getCerebro());

		assertEquals("Einstein", einstein.getNome());
		assertEquals(null, einstein.getCorpo());
	}

	@Test
	public void separaOCorpoDoCerebro() {
		einstein.setCorpo(stallone);
		einstein.setCorpo(null);

		assertEquals("Einstein", einstein.getNome());
		assertEquals(null, einstein.getCorpo());

		assertEquals("Stallone", stallone.getNome());
		assertEquals(null, stallone.getCerebro());
	}

	@Test
	public void trocaOCerebroDeUmCorpoQueJaTinhaCerebro() {
		stallone.setCerebro(einstein);
		schwarzenegger.setCerebro(hawking);
		stallone.setCerebro(hawking);

		assertEquals("Stallone", stallone.getNome());
		assertEquals("Hawking", stallone.getCerebro().getNome());

		assertEquals("Hawking", hawking.getNome());
		assertEquals("Stallone", hawking.getCorpo().getNome());

		assertEquals("Einstein", einstein.getNome());
		assertEquals(null, einstein.getCorpo());

		assertEquals("Schwarzenegger", schwarzenegger.getNome());
		assertEquals(null, schwarzenegger.getCerebro());
	}

	@Test
	public void trocaOCorpoDeUmCerebroQueJaTinhaCorpo() {
		einstein.setCorpo(stallone);
		hawking.setCorpo(schwarzenegger);
		einstein.setCorpo(schwarzenegger);

		assertEquals("Einstein", einstein.getNome());
		assertEquals("Schwarzenegger", einstein.getCorpo().getNome());

		assertEquals("Schwarzenegger", schwarzenegger.getNome());
		assertEquals("Einstein", schwarzenegger.getCerebro().getNome());

		assertEquals("Stallone", stallone.getNome());
		assertEquals(null, stallone.getCerebro());
	}
}
