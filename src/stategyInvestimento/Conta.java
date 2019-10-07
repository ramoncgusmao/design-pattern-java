package stategyInvestimento;

public class Conta {

	
	
	private String nome;
	private String agencia;
	private String conta;
	private double valor;

	public Conta() {
		// TODO Auto-generated constructor stub
	}
	
	public Conta(String nome,String agencia, String conta, Double valor) {
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;
		this.valor = valor;
		// TODO Auto-generated constructor stub
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}


	
	
}
