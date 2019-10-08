package strategyImposto;

import state.Orcamento;

public class TesteImpostoMuitoAlto {

	public static void main(String[] args) {
		
		Imposto impMuitAlto = new ImpostoMuitoAlto(new ICMS( new ISS()));
		
		Orcamento orc = new Orcamento(300.0);
		
		CalculadorDeImpostos.realizaCalculo(orc, impMuitAlto);
	}
}
