package br.edu.ifpe.garanhuns.pooed.recprova4novo;

public interface SimplesConta {
	// Força as classes que implementam esta interface ter um objeto
	// cliente, mas não reaproveita isso
	public Cliente cliente();

	// Força todas as classes que implementam esta interface de retornar
	// um saldo
	public double saldo();

	public void saque(double quantia) throws LimiteException, QuantiaException;

	public void deposito(double quantia) throws QuantiaException;
}
