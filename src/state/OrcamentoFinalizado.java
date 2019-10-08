package state;

public class OrcamentoFinalizado implements EstadoDoOrcamento{

	@Override
	public void aplicaDesconto(Orcamento orcamento) {
		 throw new RuntimeException("Or�amentos Finalizados n�o recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		 throw new RuntimeException("Or�amentos finalizados n�o podem ser aprovados!");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		 throw new RuntimeException("Or�amentos finalizados n�o podem ser reprovados!");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		 throw new RuntimeException("Or�amentos Finalizados n�o podem finalizar!");
		
	}

}
