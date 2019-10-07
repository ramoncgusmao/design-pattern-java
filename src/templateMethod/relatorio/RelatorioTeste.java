package templateMethod.relatorio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import stategyInvestimento.Conta;

public class RelatorioTeste {

	public static void main(String[] args) {

		List<Conta> contas = new ArrayList<Conta>();
		
		Conta c1 = new Conta("ramon","1234","123401",2039.0);
		Conta c2 = new Conta("evelyn","1234","123401",39.0);
		Conta c3 = new Conta("thiago","1234","123401",1039.0);
		
		contas.addAll( Arrays.asList(c1,c2,c3));
		
		Relatorio relatorio = new RelatorioSimples();
		
		relatorio.imprimirRelatorio(contas);
		
		
	}

}
