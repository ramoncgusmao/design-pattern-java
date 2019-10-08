package state;

public interface EstadoDoOrcamento {

	public void aplicaDesconto(Orcamento orcamento);
	
	public void aprova(Orcamento orcamento);
	
	public void reprova(Orcamento orcamento);
	
	public void finaliza(Orcamento orcamento);
	
}
