package chainOfResponsability;

import strategyImposto.Orcamento;

public class DescontoPorMaisdeQuinhentosReais implements Desconto {

	private Desconto proximo;

	@Override
	public double desconto(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			System.out.println("500 -");
			return orcamento.getValor() * 0.07;
		}
		
		return proximo.desconto(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		

	}

}
