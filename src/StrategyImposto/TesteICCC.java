package StrategyImposto;

public class TesteICCC {

	public static void main(String[] args) {
		Imposto iccc = new ICCC();
		
		Orcamento orc = new Orcamento(600);
		Orcamento orc2 = new Orcamento(2000);
		Orcamento orc3 = new Orcamento(4000);
		
		CalculadorDeImpostos calc = new CalculadorDeImpostos();

		calc.realizaCalculo(orc, iccc);
		calc.realizaCalculo(orc2, iccc);
		calc.realizaCalculo(orc3, iccc);

	}
}
