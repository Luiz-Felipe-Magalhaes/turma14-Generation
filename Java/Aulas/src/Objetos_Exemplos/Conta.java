package Objetos_Exemplos;

public class Conta 
{
	public int numeroConta;
	public double saldo;
	public String cpf;
	
	public Conta() {
		
	}
	
	
	public Conta(int numeroConta)
	{
		this.numeroConta = numeroConta;
	}
	public Conta(int numeroConta, String cpf)
	{
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}
}
