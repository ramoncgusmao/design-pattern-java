package state;

public class OrcamentoReprovado implements EstadoDoOrcamento{

	@Override
	public void aplicaDesconto(Orcamento orcamento) {
		 throw new RuntimeException("Or�amentos reprovados n�o recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("n�o pode ser aprovado");
		
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
