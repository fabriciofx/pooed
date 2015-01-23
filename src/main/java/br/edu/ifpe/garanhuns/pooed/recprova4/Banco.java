package br.edu.ifpe.garanhuns.pooed.recprova4;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public Banco(String nome) {
		this.nome = nome;
	}

	public String nome() {
		return nome;
	}

	public void adiciona(Conta conta) {
		contas.add(conta);
	}

	public void remove(Conta conta) {
		contas.remove(conta);
	}

	public List<Cliente> clientes() {
		List<Cliente> clientes = new ArrayList<>();

		for (Conta c : contas) {
			clientes.add(c.cliente());
		}

		return clientes;
	}

	public double calculaJuros() {
		double total = 0.0;

		for (Conta c : contas) {
			total = total + c.calculaJuros();
		}

		return total;
	}
}
