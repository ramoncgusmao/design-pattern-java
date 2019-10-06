package chainOfResponsability.Banco;

import stategyInvestimento.Conta;

public class RespostaXML implements Resposta{

	private Resposta resposta;

	@Override
	public void Responde(Formato formato, Conta conta) {
		if(formato == Formato.XML){
			System.out.println("<conta><titular>"+ conta.getNome()+"</titular>"
					+ "<saldo>"+ conta.getValor() +"</saldo></conta>");
		}else {
			resposta.Responde(formato, conta);
		}
	}

	@Override
	public void SetProxima(Resposta resposta) {
		this.resposta = resposta;
		// TODO Auto-generated method stub
		
	}

}
