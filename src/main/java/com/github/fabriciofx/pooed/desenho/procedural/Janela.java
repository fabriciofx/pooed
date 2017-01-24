package com.github.fabriciofx.pooed.desenho.procedural;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Janela extends JFrame {
	public Janela() {
		this(800, 600);
	}
	
	public Janela(int largura, int altura) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(largura, altura);
	}

	public void adiciona(final JComponent componente) {
		getContentPane().add(componente);
	}

	public void mostra() {
	    setLocationRelativeTo(null);
		setVisible(true);
	}
}

