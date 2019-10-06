package chainOfResponsability.Banco;

import stategyInvestimento.Conta;

public class RespostaFinal implements Resposta {

	@Override
	public void Responde(Formato formato, Conta conta) {
		System.out.println("sem resposta");
	}

	@Override
	public void SetProxima(Resposta resposta) {
		// TODO Auto-generated method stub

	}

}
