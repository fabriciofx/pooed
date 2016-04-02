package com.github.fabriciofx.pooed.recprova4novo;

public class ContaCorrente implements Contabilizavel {
	private Conta conta;
	private Limite limite;

	public ContaCorrente(Cliente cliente, double saldo, Limite limite)
			throws QuantiaException {
		this.conta = new Conta(cliente, saldo);
		this.limite = limite;
	}

	@Override
	public Conta conta() {
		return conta;
	}

	public Cliente cliente() {
		return conta.cliente();
	}

	public double saldo() {
		return conta.saldo();
	}

	public void saque(double quantia) throws LimiteException, QuantiaException {
		limite.aprova(quantia);
		conta.saque(quantia);
	}

	public void deposito(double quantia) throws QuantiaException {
		conta.deposito(quantia);
	}
}
