package strategyImposto;

import state.Orcamento;

public abstract class CalculadorDeImpostos {

	public static void realizaCalculo(Orcamento orcamento, Imposto qualquerImposto) {
		double imposto = qualquerImposto.calcula(orcamento);
		
		System.out.println(imposto);
	}
}
