package chainOfResponsability;

import strategyImposto.Orcamento;

public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisdeQuinhentosReais();
		
		Desconto descontoFinal = new SemDesconto();
		d1.setProximo(d2);
		d2.setProximo(descontoFinal);
		
		return d1.desconto(orcamento);
	}
}
