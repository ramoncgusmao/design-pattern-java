package observer;

import Builder.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("salvando no banco");	
	}

}
