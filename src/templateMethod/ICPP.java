package templateMethod;

import strategyImposto.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional{


	@Override
	double minimaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor()*0.05;
	}

	@Override
	double maximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor()*0.07;
	}

	@Override
	boolean condicaoMaximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() > 500;
	}

}
