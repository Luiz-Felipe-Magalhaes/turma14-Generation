package Loja;

public class Produto 
{
	//Atributos:
	private String nomeProduto;
	private String codigoProduto;
	private double precoUnitario;
	private int qtdProdutoEstoque;
	private double faturamento;
	
	

	//Construtores:
	public Produto(String nomeProduto, String codigoProduto, double precoUnitario) 
	{
		super();
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.precoUnitario = precoUnitario;
	}
	
	//Getters and Setters:
	public String getNomeProduto() 
	{
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) 
	{
		this.nomeProduto = nomeProduto;
	}

	public String getCodigoProduto() 
	{
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) 
	{
		this.codigoProduto = codigoProduto;
	}

	public double getPrecoUnitario() 
	{
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) 
	{
		this.precoUnitario = precoUnitario;
	}

	public int getQtdProdutoEstoque() 
	{
		return qtdProdutoEstoque;
	}
	
	//Métodos:
	public double vendaRealizadaAVista (int qtdVendida)
	{
		double valorVenda=0;
		
		if (testarQtdEstoque (qtdVendida))
		{
			this.qtdProdutoEstoque-=qtdVendida;
			valorVenda = (qtdVendida*this.getPrecoUnitario())*0.9*1.09;
		}
				
		return valorVenda;
	}
	
	public double vendaRealizadaDebito (int qtdVendida)
	{
		double valorVenda=0;
		
		if (testarQtdEstoque (qtdVendida))
		{
			this.qtdProdutoEstoque-=qtdVendida;
			valorVenda = qtdVendida*this.getPrecoUnitario();
		}
				
		return valorVenda;
	} 
	
	public void adicionaEstoque (int qtdEntrada)
	{
		this.qtdProdutoEstoque+=qtdEntrada;
	}

	public void retiraEstoque(int qtdRetirada)
	{
		if (testarQtdEstoque (qtdRetirada))
		{
			this.qtdProdutoEstoque-=qtdRetirada;
			System.out.printf("Retirada realizada.\nQuantidade anterior: %d\nQuantidade atual: %d",this.getQtdProdutoEstoque()+qtdRetirada,qtdRetirada);
		}
	}
	
	public boolean testarQtdEstoque(int qtdRetirada)
	{
		boolean testaEstoque = false;
		
		if (qtdRetirada <= this.getQtdProdutoEstoque())
		{
			testaEstoque = true;
		}
		
		return testaEstoque;
	}
	
}
