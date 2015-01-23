package br.edu.ifpe.garanhuns.pooed.recprova4novo;

public class TesteBanco {
	public static void main(String[] args) {
		Banco banco = new Banco("Banco Patinhas");

		Cliente donald = new Cliente("Pato Donald", "2222-3333");
		Cliente huguinho = new Cliente("Huguinho", "3333-4444");

		Contabilizavel cc, cs, cp;

		try {
			cc = new ContaCorrente(donald, 5000.00, new Limite(2000.00));
			cs = new ContaSalario(donald, 3000.00);
			cp = new ContaPoupanca(huguinho, 300.00, new Limite(100.00),
					new Juro(0.03));

			banco.adiciona(cc);
			banco.adiciona(cs);
			banco.adiciona(cp);
		} catch (QuantiaException e) {
			e.printStackTrace();
		}

		System.out.println("Quantia rezervada para os juros: R$ "
				+ banco.juros());
	}
}
