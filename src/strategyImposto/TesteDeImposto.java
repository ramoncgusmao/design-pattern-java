package strategyImposto;

public class TesteDeImposto {

	public static void main(String[] args) {
		
		Imposto iss = new ISS(new ICMS());
		Imposto icms = new ICMS();
		Orcamento orcamento = new Orcamento(500.0);
		
	//	CalculadorDeImpostos calc = new CalculadorDeImpostos();
		
		CalculadorDeImpostos.realizaCalculo(orcamento, icms);
		CalculadorDeImpostos.realizaCalculo(orcamento, iss);
	}

}
