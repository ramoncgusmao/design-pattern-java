package Strategy;

public class TesteDeImposto {

	public static void main(String[] args) {
		
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calc = new CalculadorDeImpostos();
		
		calc.realizaCalculo(orcamento, icms);
		calc.realizaCalculo(orcamento, iss);
	}

}
