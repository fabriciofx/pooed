package com.github.fabriciofx.pooed.loja;

import javax.swing.JOptionPane;

public class TesteLoja {
	public static void main(String[] args) {
		Loja autoPecas = new Loja();

		Produto velaDoMotor = new Produto(1, "Vela do Motor", 15.00);
		Produto pneu = new Produto(2, "Pneu", 150.00);
		Produto correia = new Produto(3, "Correia Dentada", 56.70);

		Cliente joao = new Cliente("João da Silva", "111222333-12",
				"Rua do Beco, 20", "joao@gmail.com", "99123-2342");
		Cliente maria = new Cliente("Maria Batista", "444222555-20",
				"Av. Caruaru, 123", "maria@gmail.com", "99342-1122");

		Pedido pedidoDoJoao = new Pedido(joao);
		pedidoDoJoao.adiciona(new Item(velaDoMotor, 4));
		pedidoDoJoao.adiciona(new Item(pneu, 2));
		autoPecas.adiciona(pedidoDoJoao);

		JOptionPane.showMessageDialog(null, "Total do pedido de João: R$ "
				+ pedidoDoJoao.calculaTotal());

		Pedido pedidoDaMaria = new Pedido(maria);
		pedidoDaMaria.adiciona(new Item(correia, 1));
		pedidoDaMaria.adiciona(new Item(pneu, 3));
		autoPecas.adiciona(pedidoDaMaria);

		JOptionPane.showMessageDialog(null, "Total do pedido de Maria: R$ "
				+ pedidoDaMaria.calculaTotal());

		JOptionPane.showMessageDialog(null,
				"Apurado da Loja: R$ " + autoPecas.calculaTotalPedidos());
	}
}
