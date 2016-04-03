package com.github.fabriciofx.pooed.expressaoavancada;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.fabriciofx.pooed.expressaoavancada.Multiplicacao;
import com.github.fabriciofx.pooed.expressaoavancada.Soma;
import com.github.fabriciofx.pooed.expressaoavancada.Numero;

public class TesteExpressaoAvancada {
	@Test
	public void somaNumerosPositivos() {
		Expressao soma = new Soma(new Numero(2), new Numero(3));
		assertEquals(5, soma.avaliacao(), 0.001);
		assertEquals("2 + 3", soma.representacao());
	}

	@Test
	public void multiplicacaoESomaDeNumerosPositivos() {
		Expressao multESoma = new Soma(
				new Multiplicacao(new Numero(2), new Numero(3)),
				new Numero(4)
		);
		assertEquals(10, multESoma.avaliacao(), 0.001);
		assertEquals("2 * 3 + 4", multESoma.representacao());
	}

	@Test
	public void somaEMultiplicacaoDeNumerosPositivos() {
		Expressao somaEMult = new Soma(
				new Numero(4),
				new Multiplicacao(new Numero(2), new Numero(3))
		);
		assertEquals(10, somaEMult.avaliacao(), 0.001);
		assertEquals("4 + 2 * 3", somaEMult.representacao());
	}

	@Test
	public void somaEMultiplicacaoDeNumerosPositivos2() {
		Expressao somaEMult = new Soma(
				new Numero(2),
				new Multiplicacao(new Numero(3), new Numero(4))
		);
		assertEquals(14, somaEMult.avaliacao(), 0.001);
		assertEquals("2 + 3 * 4", somaEMult.representacao());
	}
}
