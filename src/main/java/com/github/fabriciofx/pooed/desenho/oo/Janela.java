package com.github.fabriciofx.pooed.desenho.oo;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Janela extends JFrame {
	private static final long serialVersionUID = -3604580776297478957L;

	public Janela(String titulo) {
		this(titulo, 800, 600);
	}
	
	public Janela(String titulo, int largura, int altura) {
		super(titulo);
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

