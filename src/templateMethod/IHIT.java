package templateMethod;


import java.util.ArrayList;
import java.util.List;

import chainOfResponsability.Item;
import state.Orcamento;
import strategyImposto.Imposto;

public class IHIT extends TemplateDeImpostoCondicional{

	public IHIT() {
		super();// TODO Auto-generated constructor stub
	}

	public IHIT(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	double minimaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor()*(orcamento.getItens().size()*0.01);
	}

	@Override
	double maximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return (orcamento.getValor()*0.13)+ 100.0;
	}

	@Override
	boolean condicaoMaximaTaxacao(Orcamento orcamento) {
		
		List<String> noOrcamento = new ArrayList<>();
		
		for (Item item : orcamento.getItens()) {
			if(noOrcamento.contains(item.getNome())) return true;
			else noOrcamento.add(item.getNome());
		}
		return false;
	}

}
