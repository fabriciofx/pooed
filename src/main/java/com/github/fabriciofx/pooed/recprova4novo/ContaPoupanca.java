package com.github.fabriciofx.pooed.recprova4novo;

public class ContaPoupanca implements Rentavel {
	private ContaCorrente conta;
	private Juro juro;

	public ContaPoupanca(Cliente cliente, double saldo, Limite limite, Juro juro)
			throws QuantiaException {
		this.conta = new ContaCorrente(cliente, saldo, limite);
		this.juro = juro;
	}

	@Override
	public Conta conta() {
		return conta.conta();
	}

	public Cliente cliente() {
		return conta.cliente();
	}

	public double saldo() {
		return conta.saldo();
	}

	public void saque(double quantia) throws LimiteException, QuantiaException {
		conta.saque(quantia);
	}

	public void deposito(double quantia) throws QuantiaException {
		conta.deposito(quantia);
	}

	@Override
	public double calcula() {
		return juro.calcula(conta.saldo());
	}
}
