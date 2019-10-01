package StategyInvestimento;

public class TesteInvestimento {

	public static void main(String[] args) {
		
		Investimento arroj = new ArrojadoInvestimento();
		Investimento conserv = new ConservadorInvestimento();
		Investimento moder = new ModeradoInvestimento();
		
		Conta conta = new Conta();
		conta.setValor(3000);
		RealizadorDeInvestimento realizadorDeInvestimento = new RealizadorDeInvestimento();
		
		System.out.println("Arrojado : " + realizadorDeInvestimento.resultado(conta, arroj));
		System.out.println("Conservador : " + realizadorDeInvestimento.resultado(conta, conserv));
		System.out.println("Moderado : " + realizadorDeInvestimento.resultado(conta, moder));
		
	}
}
