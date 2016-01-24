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
		while (true) {
			try {
				String s = leString(mensagem);
				return Integer.parseInt(s);
			} catch (NumberFormatException e) {
				mostra(mensagemErro);
			}
		}
	}
}
