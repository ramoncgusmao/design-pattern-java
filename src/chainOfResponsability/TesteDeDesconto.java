package chainOfResponsability;

import strategyImposto.Orcamento;

public class TesteDeDesconto {

	public static void main(String[] args) {
		
		CalculadorDeDesconto descontos = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(300);
		orcamento.adicionaItem(new Item("CANETA", 30));
		orcamento.adicionaItem(new Item("LAPIS", 30));

		double descontoFinal = descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}

}
