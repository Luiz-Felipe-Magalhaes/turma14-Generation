package banco;

import java.util.Scanner;

public class banco_contasSemMatriz 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		char opcaoMenuInicial, opcaoContinuar='S';
		int tamanhoLinha=80, numeroOperacoes=3;
		String numeroConta="00001";
		double saldoConta=0.00;

		do
		{		
			desenhaLinha(tamanhoLinha);
			System.out.println("\n\t\t\t\t G7-Bank");
			desenhaLinha(tamanhoLinha);
			System.out.println("\nSERVIÇOS DISPONÍVEIS");
			System.out.println("\n[1] - CONTA POUPANÇA\r\n[2] - CONTA CORRENTE\n[3] - CONTA ESPECIAL\n"
					+ "[4] - CONTA EMPRESA\n[5] - CONTA UNIVERSITÁRIA\n[6] - SAIR");
			desenhaLinha(tamanhoLinha);
			System.out.print("\nDigite a opção desejada: ");
			opcaoMenuInicial = leia.next().charAt(0);
			desenhaLinha(tamanhoLinha);

			if (opcaoMenuInicial == '1')
			{
				contaPoupanca(numeroConta, saldoConta, numeroOperacoes, tamanhoLinha);
			}
			else if (opcaoMenuInicial == '2')
			{
				contaCorrente(numeroConta, saldoConta, numeroOperacoes, tamanhoLinha);
			}
			else if (opcaoMenuInicial == '3')
			{
				contaEspecial(numeroConta, saldoConta, numeroOperacoes, tamanhoLinha);
			}			
			else if (opcaoMenuInicial == '4')
			{
				contaEmpresa(numeroConta, saldoConta, numeroOperacoes, tamanhoLinha);
			}
			else if (opcaoMenuInicial == '5')
			{
				contaUniversitaria(numeroConta, saldoConta, numeroOperacoes, tamanhoLinha);
			}
			else if (opcaoMenuInicial == '6')
			{
				System.out.println("\nObrigado por utilizar o G7 Bank.");
			}

		}
		while (opcaoContinuar == 'S');

	}

	static void contaPoupanca (String conta, double saldo, int limiteOperacoes, int tamanhoLinha) //Respeita A Ordem Das Variaveis Enviadas quando a função foi chamada
	{
		Scanner leia = new Scanner (System.in);
		System.out.printf("\nConta Poupança");
		System.out.printf("\nNúmero da conta: %s",conta);
		System.out.printf("\nSalto Atual: R$%.2f\n",saldo);
		desenhaLinha(tamanhoLinha);

		char operacao, opcaoContinuar;
		double saldoAtual=saldo, valorOperacao;

		do
		{
			for (int i = 1; i <= limiteOperacoes; i++)
			{
				System.out.printf("\nQual transação deseja realizar [C]Credito ou D[Débito]: ");
				operacao = leia.next().toUpperCase().charAt(0);
				System.out.printf("Informe o valor da transação: R$");
				valorOperacao = leia.nextDouble();

				if (operacao == 'C')
				{
					System.out.print("\nTransação realizada com sucesso.");	
					saldoAtual += valorOperacao;
					System.out.printf("\nSaldo Atual: R$%.2f\n",saldoAtual);	
					desenhaLinha(tamanhoLinha);
				}
				else if (operacao == 'D')
				{
					if ((saldoAtual - valorOperacao)>=0)
					{
						saldoAtual -= valorOperacao;
						System.out.print("\nTransação realizada com sucesso.");
						System.out.printf("\nSaldo Atual: R$%.2f\n",saldoAtual);	
						desenhaLinha(tamanhoLinha);
					}
					else if ((saldoAtual - valorOperacao) < 0)				
					{
						System.out.println("\nVocê nao possui saldo suficiente.");
						System.out.printf("Saldo Atual: R$%.2f\n",saldoAtual);	
						desenhaLinha(tamanhoLinha);
					}
				}

			}
			System.out.print("\nDeseja realizar mais transações S/N? ");
			opcaoContinuar = leia.next().toUpperCase().charAt(0);
		}
		while (opcaoContinuar == 'S');
	}	

	static void contaCorrente(String conta, double saldo, int limiteOperacoes, int tamanhoLinha)
	{
		Scanner leia = new Scanner (System.in);
		System.out.printf("\nConta Corrente");
		System.out.printf("\nNúmero da conta: %s",conta);
		System.out.printf("\nSalto Atual: R$%.2f\n",saldo);
		desenhaLinha(tamanhoLinha);

		char operacao, opcaoContinuar;
		double saldoAtual=saldo, valorOperacao;

		do
		{
			for (int i = 1; i <= limiteOperacoes; i++)
			{
				System.out.printf("\nQual transação deseja realizar [C]Credito ou D[Débito]: ");
				operacao = leia.next().toUpperCase().charAt(0);
				System.out.printf("Informe o valor da transação: R$");
				valorOperacao = leia.nextDouble();

				if (operacao == 'C')
				{
					System.out.print("\nTransação realizada com sucesso.");	
					saldoAtual += valorOperacao;
					System.out.printf("\nSaldo Atual: R$%.2f\n",saldoAtual);	
					desenhaLinha(tamanhoLinha);
				}
				else if (operacao == 'D')
				{
					if ((saldoAtual - valorOperacao)>=0)
					{
						saldoAtual -= valorOperacao;
						System.out.print("\nTransação realizada com sucesso.");
						System.out.printf("\nSaldo Atual: R$%.2f\n",saldoAtual);	
						desenhaLinha(tamanhoLinha);
					}
					else if ((saldoAtual - valorOperacao) < 0)				
					{
						System.out.println("\nVocê nao possui saldo suficiente.");
						System.out.printf("Saldo Atual: R$%.2f\n",saldoAtual);	
						desenhaLinha(tamanhoLinha);
					}
				}

			}
			System.out.print("\nDeseja realizar mais transações S/N? ");
			opcaoContinuar = leia.next().toUpperCase().charAt(0);
		}
		while (opcaoContinuar == 'S');
	}	

	static void contaEspecial (String conta, double saldo, int limiteOperacoes, int tamanhoLinha)
	{
		Scanner leia = new Scanner (System.in);
		System.out.printf("\nConta Especial");
		System.out.printf("\nNúmero da conta: %s",conta);
		System.out.printf("\nSalto Atual: R$%.2f\n",saldo);
		desenhaLinha(tamanhoLinha);

		char operacao, opcaoContinuar;
		double saldoAtual=saldo, valorOperacao;

		do
		{
			for (int i = 1; i <= limiteOperacoes; i++)
			{
				System.out.printf("\nQual transação deseja realizar [C]Credito ou D[Débito]: ");
				operacao = leia.next().toUpperCase().charAt(0);
				System.out.printf("Informe o valor da transação: R$");
				valorOperacao = leia.nextDouble();

				if (operacao == 'C')
				{
					System.out.print("\nTransação realizada com sucesso.");	
					saldoAtual += valorOperacao;
					System.out.printf("\nSaldo Atual: R$%.2f\n",saldoAtual);	
					desenhaLinha(tamanhoLinha);
				}
				else if (operacao == 'D')
				{
					if ((saldoAtual - valorOperacao)>=0)
					{
						saldoAtual -= valorOperacao;
						System.out.print("\nTransação realizada com sucesso.");
						System.out.printf("\nSaldo Atual: R$%.2f\n",saldoAtual);	
						desenhaLinha(tamanhoLinha);
					}
					else if ((saldoAtual - valorOperacao) < 0)				
					{
						System.out.println("\nVocê nao possui saldo suficiente.");
						System.out.printf("Saldo Atual: R$%.2f\n",saldoAtual);	
						desenhaLinha(tamanhoLinha);
					}
				}

			}
			System.out.print("\nDeseja realizar mais transações S/N? ");
			opcaoContinuar = leia.next().toUpperCase().charAt(0);
		}
		while (opcaoContinuar == 'S');
	}	

	static void contaEmpresa (String conta, double saldo, int limiteOperacoes, int tamanhoLinha)
	{
		Scanner leia = new Scanner (System.in);
		System.out.printf("\nConta Empresa");
		System.out.printf("\nNúmero da conta: %s",conta);
		System.out.printf("\nSalto Atual: R$%.2f\n",saldo);
		desenhaLinha(tamanhoLinha);

		char operacao, opcaoContinuar;
		double saldoAtual=saldo, valorOperacao;

		do
		{
			for (int i = 1; i <= limiteOperacoes; i++)
			{
				System.out.printf("\nQual transação deseja realizar [C]Credito ou D[Débito]: ");
				operacao = leia.next().toUpperCase().charAt(0);
				System.out.printf("Informe o valor da transação: R$");
				valorOperacao = leia.nextDouble();

				if (operacao == 'C')
				{
					System.out.print("\nTransação realizada com sucesso.");	
					saldoAtual += valorOperacao;
					System.out.printf("\nSaldo Atual: R$%.2f\n",saldoAtual);	
					desenhaLinha(tamanhoLinha);
				}
				else if (operacao == 'D')
				{
					if ((saldoAtual - valorOperacao)>=0)
					{
						saldoAtual -= valorOperacao;
						System.out.print("\nTransação realizada com sucesso.");
						System.out.printf("\nSaldo Atual: R$%.2f\n",saldoAtual);	
						desenhaLinha(tamanhoLinha);
					}
					else if ((saldoAtual - valorOperacao) < 0)				
					{
						System.out.println("\nVocê nao possui saldo suficiente.");
						System.out.printf("Saldo Atual: R$%.2f\n",saldoAtual);	
						desenhaLinha(tamanhoLinha);
					}
				}

			}
			System.out.print("\nDeseja realizar mais transações S/N? ");
			opcaoContinuar = leia.next().toUpperCase().charAt(0);
		}
		while (opcaoContinuar == 'S');
	}	

	static void contaUniversitaria (String conta, double saldo, int limiteOperacoes, int tamanhoLinha)
	{
		Scanner leia = new Scanner (System.in);
		System.out.printf("\nConta Universitária");
		System.out.printf("\nNúmero da conta: %s",conta);
		System.out.printf("\nSalto Atual: R$%.2f\n",saldo);
		desenhaLinha(tamanhoLinha);

		char operacao, opcaoContinuar;
		double saldoAtual=saldo, valorOperacao;

		do
		{
			for (int i = 1; i <= limiteOperacoes; i++)
			{
				System.out.printf("\nQual transação deseja realizar [C]Credito ou D[Débito]: ");
				operacao = leia.next().toUpperCase().charAt(0);
				System.out.printf("Informe o valor da transação: R$");
				valorOperacao = leia.nextDouble();

				if (operacao == 'C')
				{
					System.out.print("\nTransação realizada com sucesso.");	
					saldoAtual += valorOperacao;
					System.out.printf("\nSaldo Atual: R$%.2f\n",saldoAtual);	
					desenhaLinha(tamanhoLinha);
				}
				else if (operacao == 'D')
				{
					if ((saldoAtual - valorOperacao)>=0)
					{
						saldoAtual -= valorOperacao;
						System.out.print("\nTransação realizada com sucesso.");
						System.out.printf("\nSaldo Atual: R$%.2f\n",saldoAtual);	
						desenhaLinha(tamanhoLinha);
					}
					else if ((saldoAtual - valorOperacao) < 0)				
					{
						System.out.println("\nVocê nao possui saldo suficiente.");
						System.out.printf("Saldo Atual: R$%.2f\n",saldoAtual);	
						desenhaLinha(tamanhoLinha);
					}
				}

			}
			System.out.print("\nDeseja realizar mais transações S/N? ");
			opcaoContinuar = leia.next().toUpperCase().charAt(0);
		}
		while (opcaoContinuar == 'S');
	}	

	static void desenhaLinha (int linha)
	{
		for (int i = 1; i<=linha; i++)
		{
			System.out.print("—");
		}
	}		
}