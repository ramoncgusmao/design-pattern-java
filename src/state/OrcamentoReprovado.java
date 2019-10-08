package state;

public class OrcamentoReprovado implements EstadoDoOrcamento{

	@Override
	public void aplicaDesconto(Orcamento orcamento) {
		 throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("não pode ser aprovado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("ja esta reprovado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("nao pode ser finalizado");
	}

}
