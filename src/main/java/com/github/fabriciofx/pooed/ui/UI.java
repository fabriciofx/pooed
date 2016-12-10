package com.github.fabriciofx.pooed.ui;

// UI: User Interface (Interface com o Usuário)
public interface UI {
	void mostra(String mensagem);

	<T> T le(Class<T> tipo, String mensagem, String erro);
}
