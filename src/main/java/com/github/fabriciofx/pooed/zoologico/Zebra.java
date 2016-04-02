package com.github.fabriciofx.pooed.zoologico;

import javax.swing.JOptionPane;

public class Zebra extends Animal {
	public Zebra(String n, String r, String c) {
		super(n, r, c);
	}
	
	public void anda() {
		JOptionPane.showMessageDialog(null, "Anda a galope");
	}
	
	public void emiteSom() {
		JOptionPane.showMessageDialog(null, "RRIIMMMMMMM");
	}
	
	public void corre() {
		JOptionPane.showMessageDialog(null, "Corre galopando");
	}
	
	public void come() {
		JOptionPane.showMessageDialog(null, "Come grama, folhas e ramos");
	}
}
