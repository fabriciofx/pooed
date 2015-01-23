package br.edu.ifpe.garanhuns.pooed.recprova4;

public abstract class Conta {
	private Cliente cliente;
	private double saldo;
	private double limite;
	private double juros;

	public Conta(Cliente cliente, double saldo, double limite, double juros) {
		this.cliente = cliente;
		this.saldo = saldo;
		this.limite = limite;
		this.juros = juros;
	}

	public Cliente cliente() {
		return cliente;
	}

	public double saldo() {
		return saldo;
	}
	
	public double limite() {
		return limite;
	}

	public double juros() {
		return juros;
	}

	public void saque(double quantia) throws LimiteException, QuantiaException {
		if (quantia > limite) {
			throw new LimiteException("quantia acima do limite");
		}

		if (quantia < 0) {
			throw new QuantiaException("quantia inválida");
		}

		this.saldo = saldo - quantia;
	}

	public void deposito(double quantia) throws QuantiaException {
		if (quantia < 0) {
			throw new QuantiaException("quantia inválida");
		}

		this.saldo = saldo + quantia;
	}
	
	public double calculaJuros() {
		return saldo * juros;
	}
}
