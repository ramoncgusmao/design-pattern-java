package state;

public class OrcamentoEmAprovacao implements EstadoDoOrcamento{

	private boolean descontoAplicado = false;
	
	@Override
	public void aplicaDesconto(Orcamento orcamento) {
		if(!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.05;
			descontoAplicado = true;
		}else {
			 throw new RuntimeException("Desconto j� aplicado!");
		}
				
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estado = new OrcamentoAprovado();
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estado = new OrcamentoReprovado();
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		 throw new RuntimeException("Or�amentos em aprovacao nao podem ser finalizados!");
	}

}
