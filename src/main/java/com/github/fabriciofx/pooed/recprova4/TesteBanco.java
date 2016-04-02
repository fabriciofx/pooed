package com.github.fabriciofx.pooed.recprova4;

public class TesteBanco {
	public static void main(String[] args) {
		Banco banco = new Banco("Banco Patinhas");
		Cliente donald = new Cliente("Pato Donald", "2222-3333");
		Cliente huguinho = new Cliente("Huguinho", "3333-4444");

		banco.adiciona(new ContaCorrente(donald, 5000.00));
		banco.adiciona(new ContaSalario(donald, 3000.00));

		banco.adiciona(new ContaPoupanca(huguinho, 300.00));

		System.out.println("Quantia rezervada para os juros: R$ "
				+ banco.calculaJuros());
	}
}
