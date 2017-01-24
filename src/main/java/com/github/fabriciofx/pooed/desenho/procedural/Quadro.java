package com.github.fabriciofx.pooed.desenho.procedural;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Arrays;
import java.util.List;

import javax.swing.JComponent;

import com.github.fabriciofx.pooed.desenho.oo.Desenho;

public class Quadro extends JComponent {
	private final List<Integer> desenhos;

	public Quadro(final Integer... desenhos) {
		this(Arrays.asList(desenhos));
	}

	public Quadro(final List<Integer> desenhos) {
		this.desenhos = desenhos;
	}
	
	@Override
	public void paint(final Graphics g) {
		final Graphics2D tela = (Graphics2D) g;
		tela.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		for(int desenho : desenhos) {
			if (desenho == 1) {
				tela.drawLine(100, 100, 200, 200);
			} else if (desenho == 2) {
				tela.drawRect(250, 250, 100, 100);
			}
		}
	}
}
