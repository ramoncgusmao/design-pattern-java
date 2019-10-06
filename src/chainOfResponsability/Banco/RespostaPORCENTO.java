package chainOfResponsability.Banco;

import stategyInvestimento.Conta;

public class RespostaPORCENTO implements Resposta{

	private Resposta resposta;

	@Override
	public void Responde(Formato formato, Conta conta) {
		
		if(formato == Formato.PORCENTO){
			System.out.println("%"+ conta.getNome()+"%"
					+ "%"+ conta.getValor() +"%");
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
