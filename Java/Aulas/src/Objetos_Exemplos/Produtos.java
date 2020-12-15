package Objetos_Exemplos;

public class Produtos 
{
	public String nomeProduto;
	public int qtdeProduto;
	public double valorUnitario;
	
	
	public Produtos()
	{
		
	}
	//sobrecarga
	public Produtos(String nomeProduto, int qtdeProduto, double valorUnitario)
	{
		super(); //depois explico
		this.nomeProduto = nomeProduto;
		this.qtdeProduto = qtdeProduto;
		this.valorUnitario = valorUnitario;
	}
	public Produtos(String nomeProduto)
	{
		this.nomeProduto = nomeProduto;
		
	}
	
}
