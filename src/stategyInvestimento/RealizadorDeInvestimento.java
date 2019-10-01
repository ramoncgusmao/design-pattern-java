package stategyInvestimento;

public class RealizadorDeInvestimento {

	public double resultado(Conta conta, Investimento investimento) {
		
		double valor = 0.75* investimento.Resultado(conta.getValor());
		
		return valor;
	}
}
