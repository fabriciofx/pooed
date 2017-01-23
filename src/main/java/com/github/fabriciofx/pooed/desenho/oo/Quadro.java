package com.github.fabriciofx.pooed.desenho.oo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Arrays;
import java.util.List;

import javax.swing.JComponent;

public class Quadro extends JComponent {
	private final List<Desenho> desenhos;

	public Quadro(final Desenho... desenhos) {
		this(Arrays.asList(desenhos));
	}

	public Quadro(final List<Desenho> desenhos) {
		this.desenhos = desenhos;
	}

	public void paint(final Graphics g) {
		final Graphics2D tela = (Graphics2D) g;
		tela.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		for (final Desenho s : desenhos) {
			s.desenhe(tela);
		}
	}
}
