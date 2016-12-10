package com.github.fabriciofx.pooed.ui;

import javax.swing.JOptionPane;

// GUI: Graphical User Interface (Interface Gráfica de Usuário)
public class GUI implements UI {
	public GUI() {
	}

	@Override
	public void mostra(final String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	@Override
	public <T> T le(final Class<T> tipo, final String mensagem,
		final String erro) {
		while (true) {
			Object dado;
			try {
				final String str = JOptionPane.showInputDialog(mensagem);
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
