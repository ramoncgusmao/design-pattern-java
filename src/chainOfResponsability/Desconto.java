package chainOfResponsability;

import strategyImposto.Orcamento;

public interface Desconto {

	double desconto(Orcamento orcamento);
	
	void setProximo(Desconto proximo);
}
