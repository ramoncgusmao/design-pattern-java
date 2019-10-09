package observer;

import Builder.NotaFiscal;

public class EnviadoPorSms implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("enviado por sms");

	}

}
