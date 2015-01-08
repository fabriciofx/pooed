package br.edu.ifpe.garanhuns.pooed.ui;

import java.util.Scanner;

// CLI: Command-line Interface (Interface de Linha de Comando)
public class CLI implements UI {
	private Scanner teclado;

	public CLI() {
		teclado = new Scanner(System.in);
	}

	@Override
	public void mostra(String mensagem) {
		System.out.println(mensagem);
	}

	@Override
	public String leString(String mensagem) {
		System.out.print(mensagem + ": ");

		return teclado.nextLine();
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
