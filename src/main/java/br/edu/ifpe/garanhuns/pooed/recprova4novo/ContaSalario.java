package br.edu.ifpe.garanhuns.pooed.recprova4novo;

public class ContaSalario implements Contabilizavel {
	private Conta conta;

	public ContaSalario(Cliente cliente, double saldo) throws QuantiaException {
		this.conta = new Conta(cliente, saldo);
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
	
	public void saque(double quantia) throws QuantiaException {
		conta.saque(quantia);
	}

	public void deposito(double quantia) throws QuantiaException {
		conta.deposito(quantia);
	}
}
