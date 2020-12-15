package BancosClasse;

public class Contas 
{
	public int numeroConta;
	public double saldoConta;
	public String cpf;
	
	public Contas (int numeroConta)
	{
		this.numeroConta = numeroConta;
	}
	
	
	public Contas(int numeroConta, String cpf) 
	{
		super();
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}

}
