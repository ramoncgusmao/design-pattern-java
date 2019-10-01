package Strategy;
public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto qualquerImposto) {
		double imposto = qualquerImposto.calcula(orcamento);
		
		System.out.println(imposto);
	}
}
