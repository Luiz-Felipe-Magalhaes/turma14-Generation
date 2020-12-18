package Loja;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class lojaTeste 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		Calendar data = Calendar.getInstance();
		Collection <String >produtosEstoque = new ArrayList();
		
		int anoNascimento, qtdVendida;
		char generoCliente, opcaoContinuar='S', opcaoVoltarMenuInicial ='S', opcaoMenuInicial='S';
		String nomeCliente, cpfCliente, escolhaDisco;
		int tamanhoLinha = 80;
		int anoAtual = data.get(Calendar.YEAR);
		
		do
		{	
			linha(tamanhoLinha);
			System.out.println("\n\t\t\tMcFly - Discos de Vinil");
			linha(tamanhoLinha);
			System.out.println("\n[1] - COMPRAR PRODUTOS\n[2] - PRODUTOS CADASTRADOS\n[3] - SAIR");
			System.out.print("Digite a opção desejada: ");
			opcaoMenuInicial = leia.next().charAt(0);
			
			Produto produto1 = new Produto("Ac/Dc - Let There Be Rock","LP001",200);
			produto1.adicionaEstoque(10);
			Produto produto2 = new Produto("Childish Gambino - Because the Internet","LP002",170);
			produto2.adicionaEstoque(10);
			Produto produto3 = new Produto("Djavan - Vesuvio","LP003",110);
			produto3.adicionaEstoque(10);
			Produto produto4 = new Produto("Gorillaz - Gorillaz","LP004",170);
			produto4.adicionaEstoque(10);
			Produto produto5 = new Produto("Metallica - Ride The Lightning ","LP005",200);
			produto5.adicionaEstoque(10);
			Produto produto6 = new Produto("Milton Nascimento - Clube da Esquina 1","LP006",200);
			produto6.adicionaEstoque(10);
			Produto produto7 = new Produto("Queen - The Works","LP007",220);
			produto7.adicionaEstoque(10);
			Produto produto8 = new Produto("Raimundos - Raimundos","LP008",100);
			produto8.adicionaEstoque(10);
			Produto produto9 = new Produto("Tim Maia - Tim Maia 1973","LP009",110);
			produto9.adicionaEstoque(10);
			Produto produto10 = new Produto("System of a Down - Toxicity","LP010",150);
			produto10.adicionaEstoque(10);
			
			produtosEstoque.add("Ac/Dc - Let There Be Rock");
			produtosEstoque.add("Childish Gambino - Because the Internet");
			produtosEstoque.add("Djavan - Vesuvio");
			produtosEstoque.add("Gorillaz - Gorillaz");
			produtosEstoque.add("Metallica - Ride The Lightning ");
			produtosEstoque.add("Milton Nascimento - Clube da Esquina 1");
			produtosEstoque.add("Queen - The Works");
			produtosEstoque.add("Raimundos - Raimundos");
			produtosEstoque.add("Tim Maia - Tim Maia 1973");
			produtosEstoque.add("System of a Down - Toxicity");
			
			//do
			//{
				if (opcaoMenuInicial == '1') 
				{
					System.out.println("\nCadastro Necessario para Compra.\nPreencha com as informações necessarias:");
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
					linha(tamanhoLinha);
								
					System.out.printf("\nCODIGO | Preço Unit R$ | Estoque  | Produto");
					System.out.printf("\n %s |    %.2f     |    %d    | %s ", produto1.getCodigoProduto(), produto1.getPrecoUnitario(),
							produto1.getQtdProdutoEstoque(), produto1.getNomeProduto());
					
					System.out.printf("\n %s |    %.2f     |    %d    | %s ", produto2.getCodigoProduto(), produto2.getPrecoUnitario(),
							produto2.getQtdProdutoEstoque(), produto2.getNomeProduto());
					
					System.out.printf("\n %s |    %.2f     |    %d    | %s ", produto3.getCodigoProduto(), produto3.getPrecoUnitario(),
							produto3.getQtdProdutoEstoque(), produto3.getNomeProduto());
					
					System.out.printf("\n %s |    %.2f     |    %d    | %s ", produto4.getCodigoProduto(), produto4.getPrecoUnitario(),
							produto4.getQtdProdutoEstoque(), produto4.getNomeProduto());
					
					System.out.printf("\n %s |    %.2f     |    %d    | %s ", produto5.getCodigoProduto(), produto5.getPrecoUnitario(),
							produto5.getQtdProdutoEstoque(), produto5.getNomeProduto());
					
					System.out.printf("\n %s |    %.2f     |    %d    | %s ", produto6.getCodigoProduto(), produto6.getPrecoUnitario(),
							produto6.getQtdProdutoEstoque(), produto6.getNomeProduto());
					
					System.out.printf("\n %s |    %.2f     |    %d    | %s ", produto7.getCodigoProduto(), produto7.getPrecoUnitario(),
							produto7.getQtdProdutoEstoque(), produto7.getNomeProduto());
					
					System.out.printf("\n %s |    %.2f     |    %d    | %s ", produto8.getCodigoProduto(), produto8.getPrecoUnitario(),
							produto8.getQtdProdutoEstoque(), produto8.getNomeProduto());
					
					System.out.printf("\n %s |    %.2f     |    %d    | %s ", produto9.getCodigoProduto(), produto9.getPrecoUnitario(),
							produto9.getQtdProdutoEstoque(), produto9.getNomeProduto());
					
					System.out.printf("\n %s |    %.2f     |    %d    | %s \n", produto10.getCodigoProduto(), produto10.getPrecoUnitario(),
							produto10.getQtdProdutoEstoque(), produto10.getNomeProduto());	
					
					linha(tamanhoLinha);
					System.out.printf("\nDigite o código do disco desejado: ");
					escolhaDisco = leia.next().toUpperCase();
					
					if (escolhaDisco.equals("LP001"))
					{	
						System.out.printf("Disco escolhido: %s\nDigite a quantidade desejada: ",produto1.getNomeProduto());
						qtdVendida = leia.nextInt();
						if (produto1.getQtdProdutoEstoque() >= qtdVendida)
						{
							System.out.printf("Compra Realizada\nValor Total: R$%.2f",produto1.vendaRealizadaAVista(qtdVendida));
						}
						else
						{
							System.out.print("Quantidade indisponivel.");
						}
						
					}
					else if (escolhaDisco.equals("LP002"))
					{
						System.out.printf("Disco escolhido: %s\nDigite a quantidade desejada: ",produto2.getNomeProduto());
						qtdVendida = leia.nextInt();
						if (produto2.getQtdProdutoEstoque() >= qtdVendida)
						{
							System.out.printf("Compra Realizada\nValor Total: R$%.2f",produto2.vendaRealizadaAVista(qtdVendida));
						}
						else
						{
							System.out.print("Quantidade indisponivel.");
						}
					}
					else if (escolhaDisco.equals("LP003"))
					{
						System.out.printf("Disco escolhido: %s\nDigite a quantidade desejada: ",produto3.getNomeProduto());
						qtdVendida = leia.nextInt();
						if (produto3.getQtdProdutoEstoque() >= qtdVendida)
						{
							System.out.printf("Compra Realizada\nValor Total: R$%.2f",produto3.vendaRealizadaAVista(qtdVendida));
						}
						else
						{
							System.out.print("Quantidade indisponivel.");
						}
					}
					else if (escolhaDisco.equals("LP004"))
					{
						System.out.printf("Disco escolhido: %s\nDigite a quantidade desejada: ",produto4.getNomeProduto());
						qtdVendida = leia.nextInt();
						if (produto4.getQtdProdutoEstoque() >= qtdVendida)
						{
							System.out.printf("Compra Realizada\nValor Total: R$%.2f",produto4.vendaRealizadaAVista(qtdVendida));
						}
						else
						{
							System.out.print("Quantidade indisponivel.");
						}
					}
					else if (escolhaDisco.equals("LP005"))
					{
						System.out.printf("Disco escolhido: %s\nDigite a quantidade desejada: ",produto5.getNomeProduto());
						qtdVendida = leia.nextInt();
						if (produto5.getQtdProdutoEstoque() >= qtdVendida)
						{
							System.out.printf("Compra Realizada\nValor Total: R$%.2f",produto5.vendaRealizadaAVista(qtdVendida));
						}
						else
						{
							System.out.print("Quantidade indisponivel.");
						}
					}
					else if (escolhaDisco.equals("LP006"))
					{
						System.out.printf("Disco escolhido: %s\nDigite a quantidade desejada: ",produto6.getNomeProduto());
						qtdVendida = leia.nextInt();
						if (produto6.getQtdProdutoEstoque() >= qtdVendida)
						{
							System.out.printf("Compra Realizada\nValor Total: R$%.2f",produto6.vendaRealizadaAVista(qtdVendida));
						}
						else
						{
							System.out.print("Quantidade indisponivel.");
						}
					}
					else if (escolhaDisco.equals("LP007"))
					{
						System.out.printf("Disco escolhido: %s\nDigite a quantidade desejada: ",produto7.getNomeProduto());
						qtdVendida = leia.nextInt();
						if (produto7.getQtdProdutoEstoque() >= qtdVendida)
						{
							System.out.printf("Compra Realizada\nValor Total: R$%.2f",produto7.vendaRealizadaAVista(qtdVendida));
						}
						else
						{
							System.out.print("Quantidade indisponivel.");
						}
					}
					else if (escolhaDisco.equals("LP008"))
					{
						System.out.printf("Disco escolhido: %s\nDigite a quantidade desejada: ",produto8.getNomeProduto());
						qtdVendida = leia.nextInt();
						if (produto8.getQtdProdutoEstoque() >= qtdVendida)
						{
							System.out.printf("Compra Realizada\nValor Total: R$%.2f",produto8.vendaRealizadaAVista(qtdVendida));
						}
						else
						{
							System.out.print("Quantidade indisponivel.");
						}
					}
					else if (escolhaDisco.equals("LP009"))
					{
						System.out.printf("Disco escolhido: %s\nDigite a quantidade desejada: ",produto9.getNomeProduto());
						qtdVendida = leia.nextInt();
						if (produto9.getQtdProdutoEstoque() >= qtdVendida)
						{
							System.out.printf("Compra Realizada\nValor Total: R$%.2f",produto9.vendaRealizadaAVista(qtdVendida));
						}
						else
						{
							System.out.print("Quantidade indisponivel.");
						}
					}
					else if (escolhaDisco.equals("LP010"))
					{
						System.out.printf("Disco escolhido: %s\nDigite a quantidade desejada: ",produto10.getNomeProduto());
						qtdVendida = leia.nextInt();
						if (produto10.getQtdProdutoEstoque() >= qtdVendida)
						{
							System.out.printf("Compra Realizada\nValor Total: R$%.2f",produto10.vendaRealizadaAVista(qtdVendida));
						}
						else
						{
							System.out.print("Quantidade indisponivel.");
						}
					}
					System.out.print("\nDeseja realizar outra compra S/N: ");
					opcaoContinuar = leia.next().toUpperCase().charAt(0);
					}
					while (opcaoContinuar == 'S');
				}
						
			if (opcaoMenuInicial == '2')
			{
				System.out.println("\nLISTA DE PRODUTOS CADASTRADOS:");
				for (String produto : produtosEstoque)
				{
					System.out.printf("%s\n",produto);
				}
				System.out.println("\n*Consulte a disponibilidade na área de compras*\n");
				System.out.print("Deseja voltar ao Menu Principal S/N: ");
				opcaoVoltarMenuInicial = leia.next().toUpperCase().charAt(0);
			}
			if (opcaoMenuInicial == '3')
			{
				break;
			}							
		}
		while (opcaoVoltarMenuInicial == 'S');
	}

	static void linha(int tamanhoLinha) 
	{

		for (int x = 1; x <= tamanhoLinha; x++) {
			System.out.print("—");
		}
	}

}
