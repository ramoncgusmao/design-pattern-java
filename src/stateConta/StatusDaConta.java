package stateConta;

import stategyInvestimento.Conta;

public interface StatusDaConta {

	public void sacar(Conta conta, double valor);
	
	public void depositar(Conta conta, double valor);
	
	public void StatusPositivo(Conta conta);
	
	public void StatusNegativo(Conta conta);
	
}
