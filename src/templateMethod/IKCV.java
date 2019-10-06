package templateMethod;


import strategyImposto.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {


	private boolean temItemMaiorQue100(Orcamento orcamento) {

		return orcamento.getItens().stream().anyMatch(p -> p.getValor() > 100);
	}

	@Override
	double minimaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.06;
	}

	@Override
	double maximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.10;
	}

	@Override
	boolean condicaoMaximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() > 500 && temItemMaiorQue100(orcamento);
	}

}
