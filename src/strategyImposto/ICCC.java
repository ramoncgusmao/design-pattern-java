package strategyImposto;

public class ICCC extends Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		
		double valor = orcamento.getValor();
		
		if(valor < 1000.0) {
			return expressao(valor, 0.05, 0) + calculoDoOutroImposto(orcamento);  
		}else if(valor < 3000.0) {
			return expressao(valor, 0.07, 0)  + calculoDoOutroImposto(orcamento);			
		}else if(valor > 3000.0){
			return expressao(valor, 0.08, 30)  + calculoDoOutroImposto(orcamento);
		}
			
		return 0;
	}
	
	public double expressao(double valor, double taxa, double soma) {
		return valor*taxa + soma;
	}
	

}
