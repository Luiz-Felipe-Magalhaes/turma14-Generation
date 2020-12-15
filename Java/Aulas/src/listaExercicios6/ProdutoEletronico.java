package listaExercicios6;

public class ProdutoEletronico 
{
	String nome, categoria;
	double preco;
	int estoque;
	
	public ProdutoEletronico(String nomeProduto, String categoriaProduto, double precoProduto, int estoqueProduto) 
	{
		this.nome = nomeProduto;
		this.categoria = categoriaProduto;
		this.preco = precoProduto;
		this.estoque = estoqueProduto;
	}
	
	public void DadosProduto ()
	{
		System.out.printf("%s - %s - Preço Unitario: R$%.2f Quantidade em Estoque: %d",this.nome, this.categoria, this.preco, estoque);
		
	}
	
	
	
	public void CompraProduto(int quantidadeCompra)  
	{
		double precoFinal;
		
		if (estoque < quantidadeCompra)
		{
			System.out.println("Quantidade não disponivel.");
		}
		else
		{
			precoFinal = this.preco*quantidadeCompra;
			this.estoque-=quantidadeCompra;	
			System.out.printf("\nPreço Final: R$%.2f\nQuantidade Restante em Estoque: %d",precoFinal, estoque);
		}
	}
	
	
	
}
