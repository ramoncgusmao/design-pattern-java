package Builder;

public class ItemDaNotaBuilder {

	private String nome;
	private double valor;
	
	public ItemDaNotaBuilder comNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public ItemDaNotaBuilder comValorDe(double valor) {
		this.valor = valor;
		return this;
	}
	
	public ItemDaNota builder() {
		return new ItemDaNota(nome, valor);
	}
}
