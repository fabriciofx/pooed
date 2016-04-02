package com.github.fabriciofx.pooed.ui;

// UI: User Interface (Interface com o Usuário)
public interface UI {
	public void mostra(String mensagem);

	public String leString(String mensagem);

	public int leInteiro(String mensagem, String mensagemErro);
}
