package com.github.fabriciofx.pooed.zoologico;

import javax.swing.JOptionPane;

public class Leao extends Animal {
	public Leao(String n, String r, String c) {
		super(n, r, c);
	}
	
	public void anda() {
		JOptionPane.showMessageDialog(null, "Anda de mansinho");
	}
	
	public void emiteSom() {
		JOptionPane.showMessageDialog(null, "GRRAAUUUUUU");
	}
	
	public void corre() {
		JOptionPane.showMessageDialog(null, "Corre rápidoooo");
	}
	
	public void come() {
		JOptionPane.showMessageDialog(null, "Come outros animais");
	}
}
