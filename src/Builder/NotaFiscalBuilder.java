package Builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import observer.AcaoAposGerarNota;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private double valorTotal;
	private double impostos;
	private List<ItemDaNota> todosItens = new ArrayList<>();
	private String observacoes;
	private Calendar data;
	private List<AcaoAposGerarNota> acaoAposGerarNotas;

	public NotaFiscalBuilder() {
		this.acaoAposGerarNotas = new ArrayList<AcaoAposGerarNota>();
	}
	
	public void adicionar(AcaoAposGerarNota acao) {
		acaoAposGerarNotas.add(acao);
	}
	public NotaFiscalBuilder  paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder  comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder  comItem(ItemDaNota item) {
		todosItens.add(item);
		valorTotal += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder  comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	private NotaFiscalBuilder  naData(Calendar calendar) {
		this.data = calendar;
		return this;
	}

	public NotaFiscal constroi() {
		if(data == null) {
			data = Calendar.getInstance();
		}
		
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorTotal, impostos, todosItens, observacoes);
		
		acaoAposGerarNotas.forEach(acao -> acao.executa(nf));
		return nf;
		
	}


	private void salvaNoBanco(NotaFiscal nf) {
		System.out.println("nota salva no banco");
	}

	private void enviaPorEmail(NotaFiscal nf) {
		System.out.println("nota enviada por email");
		
	}

	
	
	
}
