package Objetos_Exemplos;

import java.util.Scanner;

import BancosClasse.ContaEmpresa;

public class BancoTesteEd 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		char op;//visivel em todo o programa - escopo
		char saida;
		int numeroConta=0; //escopo global
		
		System.out.println("BANCO DO ED!!!");
		do
		{
			System.out.println("1 - Abertura de conta: ");
			System.out.println("2 - Acesso a uma conta existente: ");
			System.out.println("3 - Sair: ");
			op = leia.next().charAt(0);
			if (op == '1')
			{
				System.out.println("1 - Conta Poupança");
				System.out.println("2 - Conta Corrente");
				System.out.println("3 - Conta Especial");
				System.out.println("4 - Conta Empresa");
				System.out.println("5 - conta Universitaria");
				System.out.print("Digite o numero de sua opção: ");
				char opconta = leia.next().charAt(0);
				numeroConta++;
				System.out.println("Digite o seu CPF:");
				String cpfConta = leia.next();
				switch (opconta)
				{
					case '1':
					{
						System.out.println("Digite a data de aniversario da conta: ");
						int dataAniversario = leia.nextInt();
						ContaPoupancaEd poupanca = new ContaPoupancaEd(numeroConta,cpfConta,dataAniversario);
					}
					break;
					case '2':
					{	
						ContaCorrenteEd corrente = new ContaCorrenteEd(numeroConta, cpfConta);	
					}
					break;
					case '3':
					{
						ContaEspecialEd especial = new ContaEspecialEd(numeroConta, 5000);
					}
					break;
					case '4':
					{
						ContaEmpresaEd empresa = new ContaEmpresaEd(numeroConta, 10000);
					}
					break;
					case '5':
					{
						ContaUniversitariaEd universitaria = new ContaUniversitariaEd(numeroConta, 1000, 1000);
					}
					break;
				}
			}
			else if (op == '2')
			{
				System.out.println("wip");
			}
			else
			{
				System.out.println("Obrigado por utilizar o Ed Bank.");
			}
			System.out.println("Continua S/N");
			saida = leia.next().toUpperCase().charAt(0);
			if (saida == 'N') {
				break;
			}
		
		} while(true);
		

	}

}
