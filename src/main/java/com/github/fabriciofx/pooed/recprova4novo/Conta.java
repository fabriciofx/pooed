package com.github.fabriciofx.pooed.recprova4novo;

public class Conta {
	private Cliente cliente;
	private double saldo;

	private void valida(double quantia) throws QuantiaException {
		if (quantia <= 0) {
			throw new QuantiaException("valor de quantia inválido.");
		}
	}

	public Conta(Cliente cliente, double saldo) throws QuantiaException {
		valida(saldo);
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public Cliente cliente() {
		return cliente;
	}

	public double saldo() {
		return saldo;
	}

	public void saque(double quantia) throws QuantiaException {
		valida(quantia);
		saldo = saldo - quantia;
	}

	public void deposito(double quantia) throws QuantiaException {
		valida(quantia);
		saldo = saldo + quantia;
	}
}
