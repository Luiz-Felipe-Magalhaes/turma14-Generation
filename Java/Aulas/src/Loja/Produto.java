package Loja;

import java.util.Random;
import java.util.Scanner;

public class Produto 
{
	Scanner leia = new Scanner(System.in);
	
	//Atributos:
	private String nomeProduto;
	private String codigoProduto;
	private double precoUnitario;
	private int qtdProdutoEstoque;	
	private int qtdVendida;

	//Construtores:
	public Produto(String nomeProduto, String codigoProduto, double precoUnitario, int qtdProdutoEstoque) 
	{
		super();
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.precoUnitario = precoUnitario;
		this.qtdProdutoEstoque = qtdProdutoEstoque;
	}
	public Produto(String nomeProduto) 
	{
		super();
		this.nomeProduto = nomeProduto;
	}

	public Produto(String nomeProduto, int qtdVendida, double precoUnitario) 
	{
		super();
		this.nomeProduto = nomeProduto;
		this.qtdVendida = qtdVendida;
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
	
	public int getQtdVendida() 
	{
		return qtdVendida;
	}
	public void setQtdVendida(int qtdVendida) 
	{
		this.qtdVendida = qtdVendida;
	}
	
	//Métodos:
	
	public void adicionaEstoque (int qtdEntrada)
	{
		this.qtdProdutoEstoque+=qtdEntrada;
	}

	public void retiraEstoque(int qtdRetirada)
	{
		if (testarQtdEstoque (qtdRetirada))
		{
			this.qtdProdutoEstoque-=qtdRetirada;
			/*System.out.printf("Retirada realizada.\nQuantidade anterior: %d\nQuantidade atual: %d",this.getQtdProdutoEstoque()+
					qtdRetirada,qtdRetirada);*/
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
