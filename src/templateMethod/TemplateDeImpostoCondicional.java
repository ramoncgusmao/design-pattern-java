package templateMethod;

import state.Orcamento;
import strategyImposto.Imposto;

public abstract class TemplateDeImpostoCondicional extends Imposto{

	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public TemplateDeImpostoCondicional() {
		super();
	}
	@Override
	public final double calcula(Orcamento orcamento) {
		
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
