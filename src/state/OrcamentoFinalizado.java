package state;

public class OrcamentoFinalizado implements EstadoDoOrcamento{

	@Override
	public void aplicaDesconto(Orcamento orcamento) {
		 throw new RuntimeException("Orçamentos Finalizados não recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		 throw new RuntimeException("Orçamentos finalizados não podem ser aprovados!");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		 throw new RuntimeException("Orçamentos finalizados não podem ser reprovados!");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		 throw new RuntimeException("Orçamentos Finalizados não podem finalizar!");
		
	}

}
