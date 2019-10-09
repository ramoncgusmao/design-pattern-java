package observer;

import Builder.NotaFiscal;

public class Impressora implements AcaoAposGerarNota{


	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("nota imprimida");
	}

}
