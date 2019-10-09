package observer;

import Builder.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("enviado para o email");
	}

}
