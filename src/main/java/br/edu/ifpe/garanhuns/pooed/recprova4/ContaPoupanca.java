package br.edu.ifpe.garanhuns.pooed.recprova4;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(Cliente cliente, double saldo) {
		super(cliente, saldo, 1000, 0.03);
	}
}
