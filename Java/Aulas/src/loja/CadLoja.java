package loja;

import java.util.Scanner;

public class CadLoja 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);

		String nome;
		char genero, opcaoMenuInicial, opcaoMenu2, opcaoConfirmaDisco, opcaoContinuar = 'S';
		String codigos[] = new String[10];
		String produtos[] = { "Ac/Dc - Let There Be Rock", "Childish Gambino - Because the Internet",
				"Djavan - Vesuvio", "Gorillaz - Gorillaz", "Metallica - Ride The Lightning",
				"Milton Nascimento - Clube da Esquina 1", "Queen - The Works", "Raimundos - Raimundos",
				"Tim Maia - Tim Maia 1973", "System of a Down - Toxicity" };
		Double precos[] = { 200.00, 170.00, 110.00, 170.00, 200.00, 200.00, 220.00, 100.00, 110.00, 150.00 };
		int estoque[] = new int [10];
		int carrinhoCompras[] = new int[10];
		int quantidadeCompra = 0;
		String escolha;
		int produtoEscolhido = 0, tamanhoLinha = 80;

		linha(tamanhoLinha);
		System.out.println("\n\t\t\tMcFly - Discos de Vinil");
		linha(tamanhoLinha);

			System.out.println("\n[1] - COMPRAR PRODUTOS\r\n[2] - GERENCIAR ESTOQUE\r\n[3] - SAIR\r\n");
			System.out.print("Digite a opção desejada: ");
			opcaoMenuInicial = leia.next().charAt(0);

			if (opcaoMenuInicial == '1') 
			{
					System.out.print("\nDigite seu nome: ");
					nome = leia.next().toUpperCase();

					System.out.print("Qual seu Gênero - Digite [F] para Feminino ou [M] para Masculino: ");
					genero = leia.next().toUpperCase().charAt(0);
					linha(tamanhoLinha);
					
				//do 
				//{	
					
					if (voltaGenero(genero) == "Masculino") 
					{
						System.out.printf("\nSeja bem-vindo a McFly Discos Sr. %s.\n", nome);
					} 	else if (voltaGenero(genero) == "Feminino") 
					{
						System.out.printf("\nSeja bem-vinda a McFly Discos Sra. %s.\n", nome);
					} 	else if (voltaGenero(genero) == "*") 
					{
						System.out.printf("\nSeja bem-vindo a McFly Discos Srx. %s.\n", nome);
					}
					linha(tamanhoLinha);

					System.out.printf("\nCODIGO | Preço Unit R$ | Estoque | Produto\n");
					linha(tamanhoLinha);
					for (int i = 0; i < 10; i++) 
					{
						estoque[i] = 10;
						codigos[i] = (i < 9) ? "LP00" + (i + 1) : "LP0" + (i + 1);
						System.out.printf("\n %s |    %.2f     |    %d   | %s ", codigos[i], precos[i], estoque[i],
								produtos[i]);
						System.out.println();
					}
					linha(tamanhoLinha);
					System.out.printf("\nDigite o código do disco desejado: ");
					escolha = leia.next().toUpperCase();
					for (int i = 0; i < 10; i++) 
					{
						if (codigos[i].equals(escolha)) 
						{
							produtoEscolhido = i;
						}
					}
					System.out.println("Disco escolhido: " + produtos[produtoEscolhido]);
					linha(tamanhoLinha);
					System.out.printf("\nDigite a quantidade desejada: ");
					quantidadeCompra = leia.nextInt();
					if (estoque[produtoEscolhido] < quantidadeCompra) 
					{
						System.out.println("Quantidade indisponivel.");
					} else if (estoque[produtoEscolhido] >= quantidadeCompra)
					{
						estoque[produtoEscolhido] -= quantidadeCompra;
						System.out.println("Compra efetuada com sucesso.");
					}

					carrinhoCompras[produtoEscolhido] += quantidadeCompra;
					estoque[produtoEscolhido] -= quantidadeCompra;

					System.out.printf("\nDeseja continuar S/N? ");
					opcaoContinuar = leia.next().toUpperCase().charAt(0);
				
			} 
			else if (opcaoMenuInicial == '2') 
			{
				System.out.println("WIP");
				System.out.printf("\nDeseja continuar S/N? ");
				opcaoContinuar = leia.next().toUpperCase().charAt(0);
			} else if (opcaoMenuInicial == '3') {
				opcaoContinuar = 'N';
			}

		//} 
			//while (opcaoContinuar == 'S');
			//System.out.println("\nObrigado pela visita. Volte Sempre!");

	}

	static void linha(int tamanhoLinha) {

		for (int x = 1; x <= tamanhoLinha; x++) {
			System.out.print("—");
		}
	}

	public static String voltaGenero(char genero) {
		String tipo;

		if (genero == 'M') {
			tipo = "Masculino";
		} else if (genero == 'F') {
			tipo = "Feminino";
		} else {
			tipo = "*";
		}
		return tipo;
	}
}
