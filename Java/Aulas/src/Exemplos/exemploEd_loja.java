package Exemplos;

import java.util.Scanner;

public class exemploEd_loja {
		
	public static void main(String[] args) 
	{
	
			Scanner leia = new Scanner(System.in);
			
				
			linhaDetalhe();
			System.out.println("Loja Generation");
			System.out.println("Mundando vidas, acessando conhecimento!!!");
			linhaDetalhe();
			System.out.println();
			// menu inicial
			System.out.println("[1] - COMPRAR PRODUTOS");
			System.out.println("[2] - GERENCIAR ESTOQUE");
			System.out.println("[3] - SAIR");
			System.out.println();
			System.out.print("DIGITE A OPÇÃO: ");
			char opcaoMenu = leia.next().charAt(0);
			switch (opcaoMenu)
			{
				case '1':
				{
					System.out.print("Por favor informe o seu nome: ");
					String nomeCliente = leia.next().toUpperCase();
					System.out.print("Você de define como M-masculino, F-feminino ou O-outro :");
					char generoCliente = leia.next().toUpperCase().charAt(0);
					System.out.printf("Seja bem-vind%s loja %s!!!",voltaGenero(generoCliente),nomeCliente);
								
					break;
					
				}
				case '2':
				{
					System.out.println("WIP");  // work in progress
					break;
				}
				case '3':
				{
					System.out.println("Volte sempre, adoramos sua visita!!!");
					break;
				}
					
			}
			
			
		}
		
		
		public static void linhaDetalhe() {
			System.out.println("═══════════════════════════════════════════════════════");
			
		}
		
		public static String voltaGenero(char generoCliente) {
			
			String tipo;
			if (generoCliente == 'M')
			{
				tipo = "o";
			}
			else if (generoCliente == 'F')
			{
				tipo = "a";
			}
			else if (generoCliente == 'O')
			{
				tipo = "x";
			}
			else
			{
				tipo = "*";
			}
				
			
			return tipo;
		
		}
		
	}
