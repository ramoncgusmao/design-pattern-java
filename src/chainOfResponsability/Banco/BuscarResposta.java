package chainOfResponsability.Banco;

import stategyInvestimento.Conta;

public abstract class BuscarResposta {

	public static void percorrer(Formato formato, Conta conta) {
		
		Resposta r1 = criarListaEncadeada();

		r1.Responde(formato, conta);
		
	}

	private static Resposta criarListaEncadeada() {
		Resposta r1 = new RespostaCSV();
		Resposta r2 = new RespostaXML();
		Resposta r3 = new RespostaPORCENTO();
		Resposta FINAL = new RespostaFinal();
		
		r1.SetProxima(r2);
		r2.SetProxima(r3);
		r3.SetProxima(FINAL);
		return r1;
	}
}
