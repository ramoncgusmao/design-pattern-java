package stateConta;

import stategyInvestimento.Conta;

public class StatusPositivo implements StatusDaConta{

	@Override
	public void sacar(Conta conta, double valor) {
		conta.setValor(conta.getValor() - valor);
		if(conta.getValor() < 0) StatusNegativo(conta);
	}

	@Override
	public void depositar(Conta conta, double valor) {
		conta.setValor(conta.getValor() + valor*0.98);
	}

	@Override
	public void StatusPositivo(Conta conta) {
		throw new RuntimeException("Conta já está positiva");
		
	}

	@Override
	public void StatusNegativo(Conta conta) {
		conta.setStatus(new StatusNegativo());
		
	}

}
