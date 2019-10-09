package observer;

import Builder.ItemDaNotaBuilder;
import Builder.NotaFiscal;
import Builder.NotaFiscalBuilder;

public class testeObserver {

	public static void main(String[] args) {


		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionar(new EnviadoPorSms());
		builder.adicionar(new EnviadorDeEmail());
		builder.adicionar(new NotaFiscalDao());
		builder.adicionar(new Impressora());
		builder.adicionar(new Multiplicador(5));
		
		
		 NotaFiscal nf = builder
				 .paraEmpresa("Caelum")
				 .comCnpj("1020.1002.02/0001-10")
	       		 .comItem(new ItemDaNotaBuilder().comNome("item1").comValorDe(100.0).builder())
	       		 .comItem(new ItemDaNotaBuilder().comNome("item 2").comValorDe(200.0).builder())
	       		 .comItem(new ItemDaNotaBuilder().comNome("item 3").comValorDe(300.0).builder())
	       		 .comObservacoes("entregar nf pessoalmente")
	       		 .constroi();
		 
		 System.out.println(nf.toString());
		
	}

}
