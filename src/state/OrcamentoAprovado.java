package state;

public class OrcamentoAprovado implements EstadoDoOrcamento{
	private boolean descontoAplicado = false;
	@Override
	public void aplicaDesconto(Orcamento orcamento) {
	
		if(!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.02;
			descontoAplicado = true;
		}else {
			 throw new RuntimeException("desconto ja aplicado");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		 throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		 throw new RuntimeException("Orcamento aprovação não podem ir para finalizado diretamente");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estado = new OrcamentoFinalizado();
		
	}

}
