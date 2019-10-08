package stateConta;

import stategyInvestimento.Conta;

public class StatusNegativo implements StatusDaConta{

	@Override
	public void sacar(Conta conta, double valor) {

		throw new RuntimeException("Conta negativada");
		
	}

	@Override
	public void depositar(Conta conta, double valor) {
		conta.setValor(conta.getValor() + valor*0.95);
		
	}

	@Override
	public void StatusPositivo(Conta conta) {
		conta.setStatus(new StatusPositivo());
		
	}

	@Override
	public void StatusNegativo(Conta conta) {

		throw new RuntimeException("Conta já está negativada");
		
	}

	

}
