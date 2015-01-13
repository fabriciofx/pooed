package br.edu.ifpe.garanhuns.pooed.prova4;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private Cliente cliente;
	private List<Item> itens = new ArrayList<>();

	public Pedido(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void adiciona(Item item) {
		itens.add(item);
	}

	public void remove(Item item) {
		itens.remove(item);
	}

	public List<Item> getItens() {
		return itens;
	}

	public double total() {
		double total = 0.0;

		for (Item i : itens) {
			total += i.getValor();
		}

		return total;
	}
	
	// Não precisa deste método. Só coloquei para efeitar!
	public String toString() {
		return String.format("", itens);
	}
}
