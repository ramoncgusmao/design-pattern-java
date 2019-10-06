package chainOfResponsability.Banco;

import stategyInvestimento.Conta;

public class TesteResposta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNome("Ramon");
		conta.setValor(2000.0);
		
		BuscarResposta.percorrer(Formato.CSV, conta);
		BuscarResposta.percorrer(Formato.PORCENTO, conta);
		BuscarResposta.percorrer(Formato.XML, conta);
	}
}
