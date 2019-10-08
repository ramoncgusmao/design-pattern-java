package state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chainOfResponsability.Item;

public class Orcamento {

	protected double valor;
	private List<Item> itens;

	protected EstadoDoOrcamento estado;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
		this.estado = new OrcamentoEmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public boolean contemItemDeNome(String nomeDoItem) {
		for (Item item : itens) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}

	public void aplicaDescontoExtra() {
		estado.aplicaDesconto(this);
	}

	public void aprova() {
		estado.aprova(this);
	}

	public void reprova() {
		estado.reprova(this);
	}

	public void finaliza() {
		estado.finaliza(this);
	}
}
