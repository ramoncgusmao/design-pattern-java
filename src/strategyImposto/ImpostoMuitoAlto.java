package strategyImposto;

import state.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto(Imposto imposto) {
		super(imposto);
		// TODO Auto-generated constructor stub
	}
	
	public ImpostoMuitoAlto(){
		super();
	}
	
	@Override
	protected double calcula(Orcamento orcamento) {
		
		return orcamento.getValor()*0.2 + calculoDoOutroImposto(orcamento);
	}

}
