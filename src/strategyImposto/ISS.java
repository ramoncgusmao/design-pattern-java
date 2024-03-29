package strategyImposto;

import state.Orcamento;

public class ISS extends Imposto {
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ISS() {
			super();
	}
	
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}
}
