package stategyInvestimento;

public class ModeradoInvestimento implements Investimento{

	@Override
	public double Resultado(double valor) {
		boolean escolhido = new java.util.Random().nextDouble() > 0.50;
		if(escolhido) {
			return valor*0.025;
		
		}else {
			return valor*0.007;
		}
	}

}
