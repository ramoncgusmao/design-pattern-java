package chainOfResponsability;

import strategyImposto.Orcamento;

public class DescontoVendaCasada implements Desconto{

	private Desconto proximo;

	@Override
	public double desconto(Orcamento orcamento) {
		
		if(orcamento.contemItemDeNome("LAPIS") && orcamento.contemItemDeNome("CANETA")) {
			System.out.println("casada -");
			return orcamento.getValor()*0.05;
		} else {
			return proximo.desconto(orcamento);
		}
		
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		// TODO Auto-generated method stub
		
	}

}
