package com.github.fabriciofx.pooed.matematica;

import javax.swing.JOptionPane;

public class TesteMatematica {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, new Soma(2, 3, 4));
		JOptionPane.showMessageDialog(null,
				new Soma(new Multiplicacao(2, 3).getResultado(), 4));
	}
}
