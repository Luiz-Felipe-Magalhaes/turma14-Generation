package BancosClasse;

public class Conta
{
	private int numeroConta;
	private double saldoConta;
	private String cpf;
	private boolean ativa;
	
	public Conta ()
	{
		
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Conta (int numeroConta)
	{
		this.numeroConta = numeroConta;
	}
	
	
	public Conta(int numeroConta, String cpf) 
	{
		super();
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}

}
