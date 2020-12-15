package listaExercicios7;

public class Fornecedor extends Pessoa
{
	private double valorCredito;
	private double valorDivida;
	
	//Get valorCredito
	public double getValorCredito() 
	{
		return valorCredito;
	}
	//Set valorCredito
	public void setValorCredito(double valorCredito) 
	{
		this.valorCredito = valorCredito;
	}
	//Get valorDivida
	public double getValorDivida() 
	{
		return valorDivida;
	}
	//Set valorDivida
	public void setValorDivida(double valorDivida) 
	{
		this.valorDivida = valorDivida;
	}
	
	//Construtores:
	public Fornecedor(String nome) 
	{
		super(nome);
	}
	
	//Métodos:
	public Fornecedor (double valorCredito, double valorDivida)
	{
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo()
	{
		double saldoFornecedor;
		
		saldoFornecedor = this.valorCredito - this.valorDivida;
		
		return saldoFornecedor;
	}

}
	
