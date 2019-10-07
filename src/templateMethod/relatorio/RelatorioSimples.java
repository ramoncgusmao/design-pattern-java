package templateMethod.relatorio;

import java.util.List;
import java.util.stream.Collectors;

import stategyInvestimento.Conta;

public class RelatorioSimples extends Relatorio{

	@Override
	protected String rodape() {
		
		return "3321-2598";
	}

	@Override
	protected String corpo(List<Conta> contas) {
		// TODO Auto-generated method stub
		return contas.stream().map(e -> contaToString(e)).collect(Collectors.joining("\n"));
	}

	@Override
	protected String cabecalho() {
		// TODO Auto-generated method stub
		return "Banco do ramon";
	}

	private String contaToString(Conta conta) {
		return " Nome: " + conta.getNome() +" saldo: " + conta.getValor() ;
	}
}
