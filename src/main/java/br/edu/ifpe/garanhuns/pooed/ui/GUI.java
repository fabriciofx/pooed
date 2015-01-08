package br.edu.ifpe.garanhuns.pooed.ui;

import javax.swing.JOptionPane;

// GUI: Graphical User Interface (Interface Gráfica de Usuário)
public class GUI implements UI {
	public GUI() {
	}

	@Override
	public void mostra(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	@Override
	public String leString(String mensagem) {
		return JOptionPane.showInputDialog(mensagem);
	}

	@Override
	public int leInteiro(String mensagem, String mensagemErro) {
		boolean valorInvalido = true;
		int valor = 0;

		do {
			try {
				String s = leString(mensagem);
				valor = Integer.parseInt(s);
				valorInvalido = false;
			} catch (NumberFormatException e) {
				mostra(mensagemErro);
			}
		} while (valorInvalido);

		return valor;
	}
}
