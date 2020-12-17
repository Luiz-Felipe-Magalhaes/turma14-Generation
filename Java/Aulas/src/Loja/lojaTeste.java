package Loja;

import java.util.Calendar;
import java.util.Scanner;

public class lojaTeste 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		Calendar data = Calendar.getInstance();
		
		int anoNascimento;
		char generoCliente, opcaoMenuInicial;
		String nomeCliente;
		String cpfCliente;
		int tamanhoLinha = 80;
		int anoAtual = data.get(Calendar.YEAR);
		
		linha(tamanhoLinha);
		System.out.println("\n\t\t\tMcFly - Discos de Vinil");
		linha(tamanhoLinha);
		System.out.println("\n[1] - COMPRAR PRODUTOS\n[2] - PRODUTOS DISPONIVEIS\n[3] - SAIR");
		System.out.print("Digite a opção desejada: ");
		opcaoMenuInicial = leia.next().charAt(0);
		do
		{
			if (opcaoMenuInicial == '1') 
			{
				System.out.println("\nCadastro Necessario para Compra.\nPreencha com as informações necessarias.");
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
			}	
		}
		while (true);
		
		

	}
	
	static void linha(int tamanhoLinha) 
	{

		for (int x = 1; x <= tamanhoLinha; x++) {
			System.out.print("—");
		}
	}
	
}
