package Loja;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class lojaTeste 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		Calendar data = Calendar.getInstance();
		Collection <String >produtosEstoque = new ArrayList();
			
		int anoNascimento, quantidadeVenda;
		int numeroNotaFiscal = 1994062100;
		int numeroCodigoBarras = 2020271100;
		char generoCliente, opcaoContinuar='S', opcaoVoltarMenuInicial ='S', opcaoMenuInicial='S', adicionarNoCarrinho, formaPagamento, opcaoMenuFuncionario;
		String nomeCliente, cpfCliente, escolhaDisco, nomeFuncionario, codigoFuncionario;
		int tamanhoLinha = 80;
		int anoAtual = data.get(Calendar.YEAR);
		double subTotal=0, totalCompra = 0;
		
		List<Produto> listaProdutos = new ArrayList();
		List<Produto> carrinho = new ArrayList();
		
		listaProdutos.add(new Produto("Ac/Dc - Let There Be Rock","LP001",200, 10));
		listaProdutos.add(new Produto("Childish Gambino - Because the Internet","LP002",170, 10));
		listaProdutos.add(new Produto("Djavan - Vesuvio","LP003",110, 10));
		listaProdutos.add(new Produto("Gorillaz - Gorillaz","LP004",170, 10));
		listaProdutos.add(new Produto("Metallica - Ride The Lightning ","LP005",200, 10));
		listaProdutos.add(new Produto("Milton Nascimento - Clube da Esquina 1","LP006",200, 10));
		listaProdutos.add(new Produto("Queen - The Works","LP007",220, 10));
		listaProdutos.add(new Produto("Raimundos - Raimundos","LP008",100, 10));
		listaProdutos.add(new Produto("Tim Maia - Tim Maia 1973","LP009",110, 10));
		listaProdutos.add(new Produto("System of a Down - Toxicity","LP010",150, 10));
		
		do
		{	
			linha(tamanhoLinha);
			System.out.println("\n\t\t\tMcFly - Discos de Vinil");
			linha(tamanhoLinha);
			System.out.println("\n[1] - COMPRAR PRODUTOS\n[2] - CONTROLE DE PRODUTOS\n[3] - SAIR");
			System.out.print("\nDigite a opção desejada: ");
			opcaoMenuInicial = leia.next().charAt(0);
			linha(tamanhoLinha);
			totalCompra = 0;
			carrinho.clear();
			
			
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
						System.out.printf("\nSeja bem-vindx a McFly Discos Srx. %s.\n", clienteTeste.getNome());
					}
					linha(tamanhoLinha);
					
					listarProdutos(listaProdutos);
					System.out.println();
					linha(tamanhoLinha);
					System.out.printf("\nDigite o código do disco desejado: ");
					escolhaDisco = leia.next().toUpperCase();
					System.out.print("Digite a quantidade desejada: ");
					quantidadeVenda = leia.nextInt();
					//linha(tamanhoLinha);
					
					for (Produto indiceListaProdutos : listaProdutos)
					{
						if (escolhaDisco.equals(indiceListaProdutos.getCodigoProduto()) && quantidadeVenda <= indiceListaProdutos.getQtdProdutoEstoque()
								&& quantidadeVenda > 0)
						{							
							subTotal = indiceListaProdutos.getPrecoUnitario()*quantidadeVenda;
							System.out.printf("\nDisco selecionado: %d Unidade(s)  -  %s\nValor Unitário: R$%.2f  -  SubTotal: R$%.2f\n",
									quantidadeVenda, indiceListaProdutos.getNomeProduto(),indiceListaProdutos.getPrecoUnitario(), subTotal);
							System.out.print("\nAdicionar ao carrinho? S/N: " );
							adicionarNoCarrinho = leia.next().toUpperCase().charAt(0);
			
							if (adicionarNoCarrinho == 'S')
							{
								carrinho.add(new Produto(indiceListaProdutos.getNomeProduto(), quantidadeVenda, indiceListaProdutos.getPrecoUnitario()));
								indiceListaProdutos.retiraEstoque(quantidadeVenda);
								totalCompra+=subTotal;
								System.out.printf("\nValor Total no Carrinho: R$%.2f\n",totalCompra);
								System.out.print("\nDeseja continuar comprando? S/N: ");
								opcaoContinuar = leia.next().toUpperCase().charAt(0);
							}													
						}
						else if (escolhaDisco.equals(indiceListaProdutos.getCodigoProduto()) && quantidadeVenda > indiceListaProdutos.getQtdProdutoEstoque())
						{
							System.out.print("\nQuantidade indisponivel. Deseja selecionar outro produto? S/N: ");
							opcaoContinuar = leia.next().toUpperCase().charAt(0);
						}
						else if (escolhaDisco.equals(indiceListaProdutos.getCodigoProduto()) && quantidadeVenda <= 0)
						{
							System.out.print("\nQuantidade inválida. Deseja selecionar outro produto? S/N: ");
							opcaoContinuar = leia.next().toUpperCase().charAt(0);
						}
												
					}

				}
				while (opcaoContinuar == 'S');
				
				linha (tamanhoLinha);
				System.out.println();
				System.out.println("\n\t\t\tCARRINHO DE COMPRAS");
				System.out.printf("\nQuantidade | Valor Unitário |  SubTotal  | Produto\n");
				linha(tamanhoLinha);
				for (Produto indiceCarrinho : carrinho)
				{	
					subTotal = indiceCarrinho.getPrecoUnitario()*indiceCarrinho.getQtdVendida();
					System.out.printf("\n     %d     |    R$%.2f    |  R$%.2f  | %s",indiceCarrinho.getQtdVendida(), indiceCarrinho.getPrecoUnitario(), 
							subTotal, indiceCarrinho.getNomeProduto());
				}
				
				System.out.printf("\n\nValor Total da Compra: R$%.2f", totalCompra);
				System.out.println();
				linha (tamanhoLinha);
				numeroNotaFiscal ++;
				numeroCodigoBarras ++;
				finalizarVenda (totalCompra, clienteTeste.getCpfCliente(), numeroNotaFiscal, numeroCodigoBarras);
				
			}
						
			else if(opcaoMenuInicial == '2') 
			{
				System.out.println("\nAcesso Restrito a Funcionários ");
				System.out.print("Digite seu nome: ");
				nomeFuncionario = leia.next();
				System.out.print("Digite o seu código de funcionário: ");
				codigoFuncionario = leia.next();
				listarProdutos(listaProdutos);
				System.out.println("\n\n[1] - ADICIONAR PRODUTO\n[2] - REMOVER PRODUTO\n[3] - ALTERAR NOME\n"
						+ "[4] - ALTERAR PREÇO\n[5] - SAIR");
				System.out.print("\nDigite a opção desejada: ");
				opcaoMenuFuncionario = leia.next().charAt(0);
				
			}
			
			else if(opcaoMenuInicial == '3')
			{
				System.out.println("\nObrigado por visitar a McFly Discos. Volte sempre!");
				break;
			}
			
			System.out.println("\n");
		}
		
		while (true);
		
		
	}
	
	public static void listarProdutos(List<Produto> produtosListados) 
	{
		int tamanhoLinha = 80;
		
		System.out.printf("\nCODIGO | Preço Unit R$ | Estoque  | Produto\n");
		linha (tamanhoLinha);
		for (Produto produtos : produtosListados)
		{
			System.out.printf("\n %s |    %.2f     |    %d    | %s ", produtos.getCodigoProduto(), produtos.getPrecoUnitario(),
					produtos.getQtdProdutoEstoque(), produtos.getNomeProduto());
		}
		
		
	}
	
	
	public static void finalizarVenda (double valorTotalCompra, String cpfCliente, int numeroNotaFiscal, int numeroCodigoBarras)
	{
		Random sorteia = new Random();
		Scanner leia = new Scanner(System.in);
				
		double valorParcelas=0, valorDesconto=0, valorImpostos=0, valorJuros=0, valorFinalCompra=0;
		int numeroParcelas, formaPagamento;
		
						
		System.out.print("\nFORMAS DE PAGAMENTO\n\n[1] - A Vista em Dinheiro - Desconto 10%\n[2] - Débito a Vista\n"
				+ "[3] - Crédito a Vista - Juros de 5%\n[4] - Crédito em até 3x - Juros de 10%\nEscolha a opção desejada: ");
		formaPagamento = leia.nextInt();
		//pagamento a vista em dinheiro
		if (formaPagamento == 1)
		{
			valorDesconto = valorTotalCompra*0.10;
			valorJuros = valorTotalCompra*0;
			valorImpostos = (valorTotalCompra-valorDesconto+valorJuros)*0.09;
			valorFinalCompra = valorTotalCompra-valorDesconto+valorImpostos+valorJuros;
			System.out.println("\nCompra realizada com sucesso. Obrigado por escolher a McFly Discos!");
			System.out.println("╔══════════════════════════╗");
			System.out.printf("║NOTA FISCAL %d    ║\n",numeroNotaFiscal);
            System.out.println("║                          ║ ");
            System.out.printf("║CPF: %s                  ║\n",cpfCliente);
            System.out.println("║PAGAMENTO À VISTA-DINHEIRO║");
            System.out.printf("║SUBTOTAL: R$%.2f        ║\n",valorTotalCompra);
            System.out.printf("║DESCONTOS: R$%.2f        ║\n",valorDesconto);
            System.out.printf("║JUROS: R$%.2f             ║\n",valorJuros);
            System.out.printf("║IMPOSTOS: R$%.2f         ║\n",valorImpostos);
            System.out.printf("║VALOR FINAL: R$%.2f     ║\n",valorFinalCompra);
            System.out.println("║                          ║");
            System.out.println("║      ║|║|║║║║|║║         ║");
            System.out.printf ("║       %d         ║\n",numeroCodigoBarras);
            System.out.println("╚══════════════════════════╝");
			
		}
		//pagamento a vista no Debito
		else if (formaPagamento == 2) 
		{
			valorDesconto = valorTotalCompra*0;
			valorJuros = valorTotalCompra*0;
			valorImpostos = (valorTotalCompra-valorDesconto+valorJuros)*0.09;
			valorFinalCompra = valorTotalCompra-valorDesconto+valorImpostos+valorJuros;
			System.out.println("\nCompra realizada com sucesso. Obrigado por escolher a McFly Discos!");
			System.out.println("╔══════════════════════════╗");
			System.out.printf("║NOTA FISCAL %d    ║\n",numeroNotaFiscal);
            System.out.println("║                          ║ ");
            System.out.printf("║CPF: %s                  ║\n",cpfCliente);
            System.out.println("║PAGAMENTO À VISTA-DÉBITO  ║");
            System.out.printf("║SUBTOTAL: R$%.2f        ║\n",valorTotalCompra);
            System.out.printf("║DESCONTOS: R$%.2f         ║\n",valorDesconto);
            System.out.printf("║JUROS: R$%.2f             ║\n",valorJuros);
            System.out.printf("║IMPOSTOS: R$%.2f         ║\n",valorImpostos);
            System.out.printf("║VALOR FINAL: R$%.2f     ║\n",valorFinalCompra);
            System.out.println("║                          ║");
            System.out.println("║      ║|║|║║║║|║║         ║");
            System.out.printf ("║       %d         ║\n",numeroCodigoBarras);
            System.out.println("╚══════════════════════════╝");
			
			
		}
		//pagamento a vista no Crédito
		else if (formaPagamento == 3) 
		{
			valorDesconto = valorTotalCompra*0;
			valorJuros = valorTotalCompra*0.05;
			valorImpostos = (valorTotalCompra-valorDesconto+valorJuros)*0.09;
			valorFinalCompra = valorTotalCompra-valorDesconto+valorImpostos+valorJuros;
			System.out.println("\nCompra realizada com sucesso. Obrigado por escolher a McFly Discos!");
			System.out.println("╔══════════════════════════╗");
			System.out.printf("║NOTA FISCAL %d    ║\n",numeroNotaFiscal);
            System.out.println("║                          ║ ");
            System.out.printf("║CPF: %s                  ║\n",cpfCliente);
            System.out.println("║PAGAMENTO À VISTA-CRÉDITO ║");
            System.out.printf("║SUBTOTAL: R$%.2f        ║\n",valorTotalCompra);
            System.out.printf("║DESCONTOS: R$%.2f         ║\n",valorDesconto);
            System.out.printf("║JUROS: R$%.2f            ║\n",valorJuros);
            System.out.printf("║IMPOSTOS: R$%.2f         ║\n",valorImpostos);
            System.out.printf("║VALOR FINAL: R$%.2f     ║\n",valorFinalCompra);
            System.out.println("║                          ║");
            System.out.println("║      ║|║|║║║║|║║         ║");
            System.out.printf ("║       %d         ║\n",numeroCodigoBarras);
            System.out.println("╚══════════════════════════╝");
			
		}
		//pagamento parcelado
		else if (formaPagamento == 4)
		{
			do {
				System.out.print("Digite o número de parcelas que deseja dividir: ");
				numeroParcelas = leia.nextInt();
				
				//pagamento em 2x
				if (numeroParcelas == 2)
				{
					valorDesconto = valorTotalCompra*0;
					valorJuros = valorTotalCompra*0.05;
					valorImpostos = (valorTotalCompra-valorDesconto+valorJuros)*0.09;
					valorFinalCompra = valorTotalCompra-valorDesconto+valorImpostos+valorJuros;
					valorParcelas = valorFinalCompra/numeroParcelas;
					System.out.println("\nCompra realizada com sucesso. Obrigado por escolher a McFly Discos!");
					System.out.println("╔══════════════════════════╗");
					System.out.printf("║NOTA FISCAL %d    ║\n",numeroNotaFiscal);
		            System.out.println("║                          ║ ");
		            System.out.printf("║CPF: %s                  ║\n",cpfCliente);
		            System.out.println("║PAGAMENTO PARCELADO-2X    ║");
		            System.out.printf("║SUBTOTAL: R$%.2f        ║\n",valorTotalCompra);
		            System.out.printf("║DESCONTOS: R$%.2f         ║\n",valorDesconto);
		            System.out.printf("║JUROS: R$%.2f            ║\n",valorJuros);
		            System.out.printf("║IMPOSTOS: R$%.2f         ║\n",valorImpostos);
		            System.out.printf("║PARCELAS: R$%.2f        ║\n",valorParcelas);
		            System.out.printf("║VALOR FINAL: R$%.2f     ║\n",valorFinalCompra);
		            System.out.println("║                          ║");
		            System.out.println("║      ║|║|║║║║|║║         ║");
		            System.out.printf ("║       %d         ║\n",numeroCodigoBarras);
		            System.out.println("╚══════════════════════════╝");
					
		            break;
				}
				//pagamento em 2x
				else if (numeroParcelas == 3)
				{
					valorDesconto = valorTotalCompra*0;
					valorJuros = valorTotalCompra*0.05;
					valorImpostos = (valorTotalCompra-valorDesconto+valorJuros)*0.09;
					valorFinalCompra = valorTotalCompra-valorDesconto+valorImpostos+valorJuros;
					valorParcelas = valorFinalCompra/numeroParcelas;
					System.out.println("\nCompra realizada com sucesso. Obrigado por escolher a McFly Discos!");
					System.out.println("╔══════════════════════════╗");
					System.out.printf("║NOTA FISCAL %d    ║\n",numeroNotaFiscal);
		            System.out.println("║                          ║ ");
		            System.out.printf("║CPF: %s                  ║\n",cpfCliente);
		            System.out.println("║PAGAMENTO PARCELADO-3X    ║");
		            System.out.printf("║SUBTOTAL: R$%.2f        ║\n",valorTotalCompra);
		            System.out.printf("║DESCONTOS: R$%.2f         ║\n",valorDesconto);
		            System.out.printf("║JUROS: R$%.2f            ║\n",valorJuros);
		            System.out.printf("║IMPOSTOS: R$%.2f         ║\n",valorImpostos);
		            System.out.printf("║PARCELAS: R$%.2f        ║\n",valorParcelas);
		            System.out.printf("║VALOR FINAL: R$%.2f     ║\n",valorFinalCompra);
		            System.out.println("║                          ║");
		            System.out.println("║      ║|║|║║║║|║║         ║");
		            System.out.printf ("║       %d         ║\n",numeroCodigoBarras);
		            System.out.println("╚══════════════════════════╝");
					
		            break;
				}
				else if (numeroParcelas > 3 || numeroParcelas <=1)
				{
					System.out.println("Numero de parcelas indisponivel.");
				}
			}
			while (true);
		}			
			
	}
			
	static void linha(int tamanho) 
	{

		for (int x = 1; x <= tamanho; x++) {
			System.out.print("—");
		}
	}
}
