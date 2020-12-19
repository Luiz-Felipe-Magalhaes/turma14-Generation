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
	private int notaFiscal = 2020181200;;
	
	

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
	public int getNotaFiscal() 
	{
		return notaFiscal;
	}

	public void setNotaFiscal(int notaFiscal) 
	{
		this.notaFiscal = notaFiscal;
	}

	//Métodos:
	public void realizarVenda (int qtdVendida)
	{
		double valorTotal=0, valorParcelas=0, subTotal=0, valorDesconto=0, valorImpostos=0, valorJuros=0;
		int numeroParcelas, formaPagamento;
		Random sorteia = new Random();
		this.notaFiscal = 2020181200;
				
		System.out.print("\nFORMAS DE PAGAMENTO\n[1] - A Vista em Dinheiro - Desconto 10%\n[2] - Débito a Vista\n"
				+ "[3] - Crédito a Vista - Juros de 5%\n[4] - Crédito em até 3x - Juros de 10%\nEscolha a opção desejada: ");
		formaPagamento = leia.nextInt();
		//pagamento a vista em dinheiro
		if (formaPagamento == 1)
		{
			this.qtdProdutoEstoque-=qtdVendida;
			subTotal = (qtdVendida*this.getPrecoUnitario());
			valorDesconto = subTotal*0.10;
			valorJuros = subTotal*0;
			valorImpostos = (subTotal-valorDesconto+valorJuros)*0.09;
			valorTotal = subTotal-valorDesconto+valorImpostos+valorJuros;
			//this.notaFiscal++;
			System.out.println("\nCOMPRA REALIZADA");
			System.out.printf("Cod.: %s - %s\nSubTotal: R$%.2f\nJuros: %.2f\nDescontos: -R$%.2f\nImpostos: "
					+ "R$%.2f\nVALOR A PAGAR: R$%.2f\n", this.getCodigoProduto(),
					this.getNomeProduto(), subTotal, valorJuros, valorDesconto, valorImpostos, valorTotal);
		}
		//pagamento a vista no Debito
		else if (formaPagamento == 2) 
		{
			this.qtdProdutoEstoque-=qtdVendida;
			subTotal = (qtdVendida*this.getPrecoUnitario());
			valorDesconto = subTotal*0;
			valorJuros = subTotal*0;
			valorImpostos = (subTotal-valorDesconto+valorJuros)*0.09;
			valorTotal = subTotal-valorDesconto+valorImpostos+valorJuros;
			this.notaFiscal++;
			
			System.out.println("\nCOMPRA REALIZADA");
			System.out.printf("Cod.: %s - %s\nSubTotal: R$%.2f\nJuros: %.2f\nDescontos: -R$%.2f\nImpostos: "
					+ "R$%.2f\nVALOR A PAGAR: R$%.2f\n", this.getCodigoProduto(),
					this.getNomeProduto(), subTotal, valorJuros, valorDesconto, valorImpostos, valorTotal);
		}
		//pagamento a vista no Crédito
		else if (formaPagamento == 3) 
		{
			this.qtdProdutoEstoque-=qtdVendida;
			subTotal = (qtdVendida*this.getPrecoUnitario());
			valorDesconto = subTotal*0;
			valorJuros = subTotal*0.05;
			valorImpostos = (subTotal-valorDesconto+valorJuros)*0.09;
			valorTotal = subTotal-valorDesconto+valorImpostos+valorJuros;
			this.notaFiscal++;
			System.out.println("\nCOMPRA REALIZADA");
			System.out.printf("Cod.: %s - %s\nSubTotal: R$%.2f\nJuros: %.2f\nDescontos: -R$%.2f\nImpostos: "
					+ "R$%.2f\nVALOR A PAGAR: R$%.2f\n", this.getCodigoProduto(),
					this.getNomeProduto(), subTotal, valorJuros, valorDesconto, valorImpostos, valorTotal);
		}
		//pagamento parcelado
		else if (formaPagamento == 4)
		{
			System.out.print("Digite o número de parcelas que deseja dividir: ");
			numeroParcelas = leia.nextInt();
			
			//pagamento em 2x
			if (numeroParcelas == 2)
			{
				this.qtdProdutoEstoque-=qtdVendida;
				subTotal = (qtdVendida*this.getPrecoUnitario());
				valorDesconto = subTotal*0;
				valorJuros = subTotal*0.05;
				valorImpostos = (subTotal-valorDesconto+valorJuros)*0.09;
				valorTotal = subTotal-valorDesconto+valorImpostos+valorJuros;
				valorParcelas = valorTotal/numeroParcelas;
				this.notaFiscal++;
				
				System.out.println("\nCOMPRA REALIZADA");
				System.out.printf("Cod.: %s - %s\nSubTotal: R$%.2f\nJuros: %.2f\nDescontos: -R$%.2f\nImpostos: "
						+ "R$%.2f\nVALOR A PAGAR: R$%.2f\nPagamento em 2x de R$%.2f\n", this.getCodigoProduto(),
						this.getNomeProduto(), subTotal, valorJuros, valorDesconto, valorImpostos, valorTotal, valorParcelas);
			}
			//pagamento em 2x
			else if (numeroParcelas == 3)
			{
				this.qtdProdutoEstoque-=qtdVendida;
				subTotal = (qtdVendida*this.getPrecoUnitario());
				valorDesconto = subTotal*0;
				valorJuros = subTotal*0.05;
				valorImpostos = (subTotal-valorDesconto+valorJuros)*0.09;
				valorTotal = subTotal-valorDesconto+valorImpostos+valorJuros;
				valorParcelas = valorTotal/numeroParcelas;
				this.notaFiscal++;
				System.out.println("\nCOMPRA REALIZADA");
				System.out.printf("Cod.: %s - %s\nSubTotal: R$%.2f\nJuros: %.2f\nDescontos: -R$%.2f\nImpostos: "
						+ "R$%.2f\nVALOR A PAGAR: R$%.2f\nPagamento em 3x de R$%.2f\n", this.getCodigoProduto(),
						this.getNomeProduto(), subTotal, valorJuros, valorDesconto, valorImpostos, valorTotal, valorParcelas);
			}
			else if (numeroParcelas > 3 || numeroParcelas <=1)
			{
				System.out.println("Numero de parcelas indisponivel.");
			}			
		}			
			
	}
	
	public void emitirNota()
	{
		this.notaFiscal++;
		System.out.printf("Nº NOTA FISCAL - %d\n",this.notaFiscal);
		System.out.println("\nObrigado por escolher a McFly Discos");
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
