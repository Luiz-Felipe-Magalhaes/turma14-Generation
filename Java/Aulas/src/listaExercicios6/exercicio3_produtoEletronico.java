package listaExercicios6;

import java.util.Scanner;

public class exercicio3_produtoEletronico 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int quantidadeCompra;
		
		ProdutoEletronico iphone = new ProdutoEletronico("iPhone XR","Smartphone", 3500.00, 10);
		
		iphone.DadosProduto();
		
		System.out.print("\nDigite a quantidade desejada: ");
		quantidadeCompra = leia.nextInt();
		
		iphone.CompraProduto(quantidadeCompra);
				
	}

}
