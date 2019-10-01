package StategyInvestimento;

public class ConservadorInvestimento implements Investimento{

	@Override
	public double Resultado(double valor) {
		
		return 0.008 * valor;
	}

}
