package br.edu.ifpe.garanhuns.pooed.prova4;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private Cliente cliente;
	private List<Item> itens = new ArrayList<>();

	public Pedido(Cliente cliente) {
		this.cliente = cliente;
	}

	// Não precisava colocar os métodos gets e sets!	
	public Cliente getCliente() {
		return cliente;
	}

	public List<Item> getItens() {
		return itens;
	}
	
	// Estes métodos eram necessários!
	public void adiciona(Item item) {
		itens.add(item);
	}

	public void remove(Item item) {
		itens.remove(item);
	}

	public double total() {
		double total = 0.0;

		for (Item i : itens) {
			total += i.getValor();
		}

		return total;
	}
}
