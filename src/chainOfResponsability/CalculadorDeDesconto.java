package chainOfResponsability;

import state.Orcamento;

public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisdeQuinhentosReais();
		Desconto d3 = new DescontoVendaCasada();
		
		Desconto descontoFinal = new SemDesconto();
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(descontoFinal);
		
		return d1.desconto(orcamento);
	}
}
