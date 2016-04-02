package com.github.fabriciofx.pooed.ui;


public class TesteUI {
	public static void main(String[] args) {
		UI ui = new GUI();
		int idade = ui.leInteiro("Digite a idade", "idade inválida!");

		ui.mostra("Idade: " + idade);
	}
}
