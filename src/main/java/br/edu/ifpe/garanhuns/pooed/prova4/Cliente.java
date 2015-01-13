package br.edu.ifpe.garanhuns.pooed.prova4;

public class Cliente {
	private String nome;
	private String email;

	public Cliente(String nome, String email) throws AplicacaoException {
		if (nome == null || nome.isEmpty()) {
			throw new AplicacaoException("nome inválido!");
		}

		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
}
