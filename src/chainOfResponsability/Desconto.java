package chainOfResponsability;

import state.Orcamento;

public interface Desconto {

	double desconto(Orcamento orcamento);
	
	void setProximo(Desconto proximo);
}
