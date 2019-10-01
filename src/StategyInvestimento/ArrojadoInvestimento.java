package StategyInvestimento;

public class ArrojadoInvestimento implements Investimento{


	@Override
	public double Resultado(double valor) {
		boolean escolhido = new java.util.Random().nextDouble() > 0.50;
		if(escolhido) {
			return valor*0.006;
		}else {
			boolean chance40 = new java.util.Random().nextDouble() < 0.4;
			if(chance40) {
				return valor*0.05;
			}else {
				return valor*0.03;
			}
		}

	}

}
