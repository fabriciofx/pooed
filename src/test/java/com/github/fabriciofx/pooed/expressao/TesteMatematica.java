package com.github.fabriciofx.pooed.expressao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.fabriciofx.pooed.expressao.Multiplicacao;
import com.github.fabriciofx.pooed.expressao.Operacao;
import com.github.fabriciofx.pooed.expressao.Soma;

public class TesteMatematica {
	@Test
	public void somaNumerosPositivos() {
		Operacao soma = new Soma(2, 3);
		assertEquals(5, soma.resultado(), 0.001);
	}

	@Test
	public void somaNumerosNegativos() {
		Operacao soma = new Soma(-2, -3);
		assertEquals(-5, soma.resultado(), 0.001);
	}

	@Test
	public void somaNumerosPositivosENegativos() {
		Operacao soma = new Soma(2, -3);
		assertEquals(-1, soma.resultado(), 0.001);
	}

	@Test
	public void multiplicacaoESomaDeNumerosPositivos() {
		Operacao multESoma = new Soma(new Multiplicacao(2, 3).resultado(), 4);
		assertEquals(10, multESoma.resultado(), 0.001);
	}
}
