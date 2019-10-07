package templateMethod.relatorio;

import java.util.List;

import stategyInvestimento.Conta;

public abstract class Relatorio {

	public void imprimirRelatorio(List<Conta> contas) {
		
		System.out.println(cabecalho());
		System.out.println(corpo(contas));
		System.out.println(rodape());
		
	}

	protected abstract String rodape();

	protected abstract String corpo(List<Conta> contas);

	protected abstract String cabecalho();
}
