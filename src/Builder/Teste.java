package Builder;

import java.util.Calendar;

public class Teste {

	public static void main(String[] args) {
		
		 NotaFiscal nf = new NotaFiscalBuilder()
				 .paraEmpresa("Caelum")
				 .comCnpj("123.456.789/0001-10")
	       		 .comItem(new ItemDaNotaBuilder().comNome("item1").comValorDe(100.0).builder())
	       		 .comItem(new ItemDaNotaBuilder().comNome("item 2").comValorDe(200.0).builder())
	       		 .comItem(new ItemDaNotaBuilder().comNome("item 3").comValorDe(300.0).builder())
	       		 .comObservacoes("entregar nf pessoalmente")
	       		 .constroi();
	        
	        System.out.println(nf.toString());
	        
	}
}
