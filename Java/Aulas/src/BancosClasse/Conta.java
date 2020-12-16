package BancosClasse;

import java.util.Scanner;

public abstract class Conta
{	
	Scanner leia = new Scanner(System.in);
	
	//Atributos:
	protected int numeroConta;
	protected double saldoConta;
	protected String cpf;
	protected boolean ativa;
	
	//Getters and Setters:
	public int getNumeroConta() 
	{
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) 
	{
		this.numeroConta = numeroConta;
	}

	public double getSaldoConta() 
	{
		return saldoConta;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}
	
	//Construtores:
	public Conta() 
	{
		super();
	}
	
	public Conta(int numeroConta) 
	{
		super();
		this.numeroConta = numeroConta;
	}	
	
	public Conta(int numeroConta, String cpf) 
	{
		super();
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}
	
	//Métodos:
	public void FazerCredito (double valorTransacao)
	{
		this.saldoConta+=valorTransacao;
		System.out.printf("\nTransação realizada com sucesso.\nSaldo atual: R$%.2f\n",getSaldoConta());
	}
	
	public void FazerDebito (double valorTransacao)
	{
		if (testarSaldo(valorTransacao))
		{
			this.saldoConta-=valorTransacao;
			System.out.printf("\nTransação realizada com sucesso.\nSaldo atual: R$%.2f",getSaldoConta());
		}
		else
		{
			System.out.printf("\nTransação não autorizada. Saldo insuficiente.\nSaldo Atual: R$%.2f",getSaldoConta());
		}
	}
	
	public boolean testarSaldo(double valorTransacao) 
	{
		
		boolean teste=false;
		
		if (valorTransacao <= this.saldoConta) 
		{
			teste = true;
		} 
				
		return teste;
	}

}
