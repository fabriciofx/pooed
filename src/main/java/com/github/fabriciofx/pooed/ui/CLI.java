package com.github.fabriciofx.pooed.ui;

import java.util.Scanner;

// CLI: Command-line Interface (Interface de Linha de Comando)
public class CLI implements UI {
	private Scanner teclado;

	public CLI() {
		teclado = new Scanner(System.in);
	}

	@Override
	public void mostra(final String mensagem) {
		System.out.print(mensagem);
	}

	@Override
	public <T> T le(final Class<T> tipo, final String mensagem,
			final String erro) {
		while (true) {
			Object dado;
			mostra(mensagem);
			try {
				final String str = teclado.nextLine();
				if (tipo.equals(Byte.class)) {
					dado = Byte.parseByte(str);
				} else if (tipo.equals(Short.class)) {
					dado = Short.parseShort(str);
				} else if (tipo.equals(Integer.class)) {
					dado = Integer.parseInt(str);
				} else if (tipo.equals(Long.class)) {
					dado = Long.parseLong(str);
				} else if (tipo.equals(String.class)) {
					dado = str;
				} else {
					throw new IllegalStateException(
						String.format("tipo %s is not allowed", tipo.getName())
					);
				}
			} catch (final Exception e) {
				mostra(String.format("Erro: %s\n", erro));
				continue;
			}
			return tipo.cast(dado);
		}
	}
}
