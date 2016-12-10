package com.github.fabriciofx.pooed.ui;


public class TesteUI {
	public static void main(String[] args) {
		final UI ui = new GUI();
		
		int idade = ui.le(Integer.class, "Digite a idade: ", "idade inválida");
		ui.mostra("Idade: " + idade);
	}
}
