package com.github.fabriciofx.pooed.prova4;

import javax.swing.JOptionPane;

public class TesteLoja {
	public static void main(String[] args) {
		Produto capacete = new Produto("Capacete feminino",
				"Capacete feminino rosa", 350.00);
		Produto luvas = new Produto("Luvas em couro",
				"Luvas em couro legítimo pretas", 125.00);
		Cliente maria = null;

		try {
			maria = new Cliente("Maria Lúcia Silva", "maria@gmail.com");
		} catch (AplicacaoException e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		}

		Pedido pedido = new Pedido(maria);
		pedido.adiciona(new Item(capacete, 2));
		pedido.adiciona(new Item(luvas, 3));

		JOptionPane.showMessageDialog(null, "Total: R$ " + pedido.total());
	}
}
