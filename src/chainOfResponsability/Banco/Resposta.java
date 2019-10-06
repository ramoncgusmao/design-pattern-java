package chainOfResponsability.Banco;

import stategyInvestimento.Conta;

public interface Resposta {

	
	void Responde(Formato formato, Conta conta);
	void SetProxima(Resposta resposta);
}
