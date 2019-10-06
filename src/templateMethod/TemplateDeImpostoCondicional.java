package templateMethod;

import strategyImposto.Imposto;
import strategyImposto.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		
		if(condicaoMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento);
		}else {
			return minimaTaxacao(orcamento);
		}
	}

	abstract double minimaTaxacao(Orcamento orcamento);

	abstract double maximaTaxacao(Orcamento orcamento);

	abstract boolean condicaoMaximaTaxacao(Orcamento orcamento);
	
	

}
