package templateMethod;

import strategyImposto.Imposto;
import strategyImposto.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

	public ICPP() {
		super();// TODO Auto-generated constructor stub
	}

	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	@Override
	double minimaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.05;
	}

	@Override
	double maximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.07;
	}

	@Override
	boolean condicaoMaximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() > 500;
	}

}
