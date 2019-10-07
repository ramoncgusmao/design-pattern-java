package templateMethod.relatorio;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import stategyInvestimento.Conta;

public class RelatorioComplexo extends Relatorio {

	
	@Override
	protected String rodape() {
		// TODO Auto-generated method stub
		return "atendimento@bancodoramon.com.br\n"+ LocalDate.now();
	}

	@Override
	protected String corpo(List<Conta> contas) {
		
		String texto = contas.stream().map(e -> contaToString(e)).collect(Collectors.joining("\n"));
		return texto;
	}

	@Override
	protected String cabecalho() {
		// TODO Auto-generated method stub
		return "Banco do Ramon \nRua 1, centro, 65789-352 \ntelefone: 3352-6780/ 34233-231";
	}

	private String contaToString(Conta conta) {
		return "Ag: " +conta.getAgencia() + " CC: " + conta.getConta() +" Nome: " + conta.getNome() +" saldo: " + conta.getValor() ;
	}
}
