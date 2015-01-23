package br.edu.ifpe.garanhuns.pooed.recprova4novo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Contabilizavel> contabilizaveis = new ArrayList<>();
	private List<Rentavel> rentaveis = new ArrayList<>();

	public Banco(String nome) {
		this.nome = nome;
	}

	public String nome() {
		return nome;
	}

	public void adiciona(Contabilizavel contabilizavel) {
		contabilizaveis.add(contabilizavel);
	}

	public void remove(Contabilizavel contabilizavel) {
		contabilizaveis.remove(contabilizavel);
	}

	public void adiciona(Rentavel rentavel) {
		rentaveis.add(rentavel);
		contabilizaveis.add(rentavel);
	}

	public void remove(Rentavel rentavel) {
		rentaveis.add(rentavel);
		contabilizaveis.remove(rentavel);
	}

	public List<Cliente> clientes() {
		List<Cliente> clientes = new ArrayList<>();

		for (Contabilizavel c : contabilizaveis) {
			clientes.add(c.conta().cliente());
		}

		return clientes;
	}

	public double juros() {
		double total = 0.0;

		for (Rentavel r : rentaveis) {
			total = total + r.calcula();
		}

		return total;
	}
}
