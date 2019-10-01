package strategyImposto;

public class ICCC implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		
		double valor = orcamento.getValor();
		
		if(valor < 1000.0) {
			return expressao(valor, 0.05, 0);  
		}else if(valor < 3000.0) {
			return expressao(valor, 0.07, 0);			
		}else if(valor > 3000.0){
			return expressao(valor, 0.08, 30);
		}
			
		return 0;
	}
	
	public double expressao(double valor, double taxa, double soma) {
		return valor*taxa + soma;
	}
	

}
