package stategyInvestimento;

import stateConta.StatusDaConta;
import stateConta.StatusPositivo;

public class Conta {

	
	
	private String nome;
	private String agencia;
	private String conta;
	private double valor;

	private StatusDaConta status;
	
	public Conta() {
		setStatus(new StatusPositivo());
	}
	
	public Conta(String nome,String agencia, String conta, Double valor) {
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;
		this.valor = valor;
		setStatus(new StatusPositivo());
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

	public StatusDaConta getStatus() {
		return status;
	}

	public void setStatus(StatusDaConta status) {
		this.status = status;
	}


	 public void saca(double valor) {
		 status.sacar(this, valor);
	    }

	    public void deposita(double valor) {
	    	status.depositar(this, valor);
	    }
	
}
