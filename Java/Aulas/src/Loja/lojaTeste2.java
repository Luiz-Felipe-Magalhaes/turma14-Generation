package Loja;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class lojaTeste2 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		Calendar data = Calendar.getInstance();
		Collection <String >produtosEstoque = new ArrayList();
			
		int anoNascimento, qtdVendida;
		char generoCliente, opcaoContinuar='S', opcaoVoltarMenuInicial ='S', opcaoMenuInicial='S', formaPagamento;
		String nomeCliente, cpfCliente, escolhaDisco;
		int tamanhoLinha = 80;
		int anoAtual = data.get(Calendar.YEAR);
		
		List<Produto> listaProdutos = new ArrayList();
		List<Produto> carrinho = new ArrayList();
		
		listaProdutos.add(new Produto("Ac/Dc - Let There Be Rock","LP001",200));
		listaProdutos.add(new Produto("Childish Gambino - Because the Internet","LP002",170));
		listaProdutos.add(new Produto("Djavan - Vesuvio","LP003",110));
		listaProdutos.add(new Produto("Gorillaz - Gorillaz","LP004",170));
		listaProdutos.add(new Produto("Metallica - Ride The Lightning ","LP005",200));
		listaProdutos.add(new Produto("Milton Nascimento - Clube da Esquina 1","LP006",200));
		listaProdutos.add(new Produto("Queen - The Works","LP007",220));
		listaProdutos.add(new Produto("Raimundos - Raimundos","LP008",100));
		listaProdutos.add(new Produto("Tim Maia - Tim Maia 1973","LP009",110));
		listaProdutos.add(new Produto("System of a Down - Toxicity","LP010",150));
		
		do
		{	
			linha(tamanhoLinha);
			System.out.println("\n\t\t\tMcFly - Discos de Vinil");
			linha(tamanhoLinha);
			System.out.println("\n[1] - COMPRAR PRODUTOS\n[2] - PRODUTOS CADASTRADOS\n[3] - SAIR");
			System.out.print("Digite a opção desejada: ");
			opcaoMenuInicial = leia.next().charAt(0);
			
			
			if (opcaoMenuInicial == '1') 
			{
				/*System.out.println("\nCadastro Necessario para Compra.\nPreencha com as informações necessarias:");
				System.out.print("Nome: ");
				nomeCliente = leia.next().toUpperCase();
				System.out.print("CPF: ");
				cpfCliente = leia.next();
				System.out.print("Genêro - Digite [F] para Feminino [M] para Masculino [O] para Outro: ");
				generoCliente = leia.next().toUpperCase().charAt(0);
				System.out.print("Ano de nascimento: ");
				anoNascimento = leia.nextInt();	
				Cliente clienteTeste = new Cliente(nomeCliente, generoCliente, anoNascimento, cpfCliente);
				clienteTeste.voltaIdade(anoAtual, anoNascimento);
				System.out.println();
				linha(tamanhoLinha);
				
				do
				{	
					if (clienteTeste.getGenero() == 'M') 
					{
						System.out.printf("\nSeja bem-vindo a McFly Discos Sr. %s.\n", clienteTeste.getNome());
					} 	
					else if (clienteTeste.getGenero() == 'F') 
					{
						System.out.printf("\nSeja bem-vinda a McFly Discos Sra. %s.\n", clienteTeste.getNome());
					} 	
					else if (clienteTeste.getGenero() == 'O') 
					{
						System.out.printf("\nSeja bem-vindo a McFly Discos Srx. %s.\n", clienteTeste.getNome());
					}
					linha(tamanhoLinha);*/
					
					listarProdutos(listaProdutos);
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				
				/*System.out.print("\nDeseja realizar outra compra S/N: ");
				opcaoContinuar = leia.next().toUpperCase().charAt(0);
				}
				while (opcaoContinuar == 'S');*/
		
			}
		
		System.out.print("\nDeseja realizar outra compra S/N: ");
		opcaoContinuar = leia.next().toUpperCase().charAt(0);
		}
		while (opcaoContinuar == 'S');

		
	}
	
	public static void listarProdutos(List<Produto> produtosListados) 
	{
		System.out.printf("\nCODIGO | Preço Unit R$ | Estoque | Produto");
		for (Produto produtos : produtosListados)
		{
			System.out.printf("\n %s |    %.2f     |    %d    | %s ", produtos.getCodigoProduto(), produtos.getPrecoUnitario(),
					produtos.getQtdProdutoEstoque(), produtos.getNomeProduto());
		}
		
		
	}
		
	static void linha(int tamanhoLinha) 
	{

		for (int x = 1; x <= tamanhoLinha; x++) {
			System.out.print("—");
		}
	}
}
