package BancosClasse;

import java.util.Scanner;

public class bancoTeste  
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
				
		String cpfConta, nome;
		double valorTransacao, valorEmprestimo;
		char opcaoConta, opcaoMenu, tipoTransacao, opcaoContinuar, opcaoMenuConta, aceiteEmprestimo, opcaoSaida;
		int numeroConta=0, contaTransacoes=0, transacoesRealizadas=0, limiteTransacoes=10;
		
		
		System.out.println("G7-Bank");
		
		do
		{
			System.out.println("[1] - Abertura de conta");
			System.out.println("[2] - Acesso a uma conta existente");
			System.out.println("[3] - Sair");
			System.out.print("Digite a opção desejada: ");
			opcaoMenu = leia.next().charAt(0);
			if (opcaoMenu == '1')
			{	
				System.out.print("Digite seu nome: ");
				nome = leia.next();
								
				System.out.println("\n1 - Conta Poupança");
				System.out.println("2 - Conta Corrente");
				System.out.println("3 - Conta Especial - WIP");
				System.out.println("4 - Conta Empresa");
				System.out.println("5 - Conta Universitaria");
				System.out.print("Escolha o tipo de conta que deseja abrir: ");
				opcaoConta = leia.next().charAt(0);
				numeroConta++;
				System.out.println("Digite o seu CPF:");
				cpfConta = leia.next();
				System.out.printf("Conta aberta com sucesso. Bem-vindo ao G7-Bank.\nNumero da conta: %d\n",numeroConta);
				
				switch (opcaoConta)
				{
					case '1':
					{
						System.out.print("Digite a data de aniversario da conta: ");
						int dataAniversario = leia.nextInt();		
						Poupanca poupanca = new Poupanca(numeroConta,nome,dataAniversario);
						
	                	do{
	                		System.out.printf("Qual transação deseja realizar [C]Credito ou D[Débito]: ");
							tipoTransacao = leia.next().toUpperCase().charAt(0);
							System.out.printf("Informe o valor da transação: R$");
							valorTransacao = leia.nextDouble();
							
							if (tipoTransacao == 'C')
							{
								poupanca.FazerCredito(valorTransacao);
							}
							else if (tipoTransacao == 'D')
							{
								poupanca.FazerDebito(valorTransacao);
							}
							System.out.print("\nDeseja realizar mais transações S/N:");
							opcaoContinuar = leia.next().toUpperCase().charAt(0);
							
							if (opcaoContinuar == 'S')
							{
								transacoesRealizadas++;
							}
							opcaoContinuar = limiteTransacoes(opcaoContinuar, limiteTransacoes, transacoesRealizadas);
							
						}
						while (opcaoContinuar == 'S');
	                			              
	                    System.out.println("Digite a data de hoje");
	                    int data = leia.nextInt();
	                    poupanca.bonusPoupanca(data);
		                		
					}
					break;
					case '2':
					{	
						ContaCorrente corrente = new ContaCorrente(numeroConta, cpfConta);
						
						do{
	                		System.out.printf("Qual transação deseja realizar [C]Credito ou D[Débito]: ");
							tipoTransacao = leia.next().toUpperCase().charAt(0);
							System.out.printf("Informe o valor da transação: R$");
							valorTransacao = leia.nextDouble();
							
							if (tipoTransacao == 'C')
							{
								corrente.FazerCredito(valorTransacao);
								
							}
							else if (tipoTransacao == 'D')
							{
								corrente.FazerDebito(valorTransacao);
							}
							
							corrente.talao(3,0);
										
							System.out.print("\nDeseja realizar mais transações S/N:");
							opcaoContinuar = leia.next().toUpperCase().charAt(0);
				
							if (opcaoContinuar == 'S')
							{
								transacoesRealizadas++;
							}
							opcaoContinuar = limiteTransacoes(opcaoContinuar, limiteTransacoes, transacoesRealizadas);
		
						}
						while (opcaoContinuar == 'S');

					}
					break;
					case '3':
					{
						System.out.println("WIP");
					}
					break;
					case '4':
					{	
						ContaEmpresa empresa = new ContaEmpresa(numeroConta,cpfConta,10000);
											
						opcaoMenuConta = menuInicial();
						if (opcaoMenuConta == '1')
						{	
						
						do
						{	
							System.out.printf("Qual transação deseja realizar [C]Credito ou D[Débito]: ");
							tipoTransacao = leia.next().toUpperCase().charAt(0);
							System.out.printf("Informe o valor da transação: R$");
							valorTransacao = leia.nextDouble();
							
							if (tipoTransacao == 'C')
							{
								empresa.FazerCredito(valorTransacao);
							}
							else if (tipoTransacao == 'D')
							{
								empresa.FazerDebito(valorTransacao);
							}
							System.out.printf("\nVocê tem um limite de Emprestimo de: R$%.2f\nDeseja Solicitar S/N: ",empresa.getEmprestimoEmpresa());
							aceiteEmprestimo = leia.next().toUpperCase().charAt(0);
							
							if (aceiteEmprestimo == 'S')
							{
								System.out.print("Digite o valor que deseja solicitar: R$");
								valorEmprestimo = leia.nextDouble();
								
								empresa.FazerEmprestimo(valorEmprestimo);
							}
							System.out.print("\nDeseja realizar mais transações S/N:");
							opcaoContinuar = leia.next().toUpperCase().charAt(0);
							
							if (opcaoContinuar == 'S')
							{
								transacoesRealizadas++;
							}
							opcaoContinuar = limiteTransacoes(opcaoContinuar, limiteTransacoes, transacoesRealizadas);
							
						}
						while (opcaoContinuar == 'S');
						}
						else if (opcaoMenuConta == '2')
						{
							System.out.printf("Saldo Atual: R$%.2f\n",empresa.getSaldoConta());
						}
						else if (opcaoMenuConta == '3')
						{
							System.out.println("Obrigado por utilizar o G7Bank.");
							break;
						}
	
					}
					break;
					case '5':
					{
						ContaUniversitaria universitaria = new ContaUniversitaria(numeroConta,cpfConta,1000,1000);
						
						opcaoMenuConta = menuInicial();
						if (opcaoMenuConta == '1')
						{	
						
						do
						{	
							System.out.printf("Qual transação deseja realizar [C]Credito ou D[Débito]: ");
							tipoTransacao = leia.next().toUpperCase().charAt(0);
							System.out.printf("Informe o valor da transação: R$");
							valorTransacao = leia.nextDouble();
							
							if (tipoTransacao == 'C')
							{
								universitaria.Credito(valorTransacao);
							}
							else if (tipoTransacao == 'D')
							{
								universitaria.Debito(valorTransacao);
							}
							System.out.println("\nSaldo atual: " + universitaria.getSaldoConta() + 
									"\nValor Limite Disponível: " + universitaria.getLimite()
									+ "\nValor Limite Universitário Disponível: " + universitaria.getLimiteUniversitario());
							
							System.out.print("\nDeseja realizar mais transações S/N:");
							opcaoContinuar = leia.next().toUpperCase().charAt(0);
							
							if (opcaoContinuar == 'S')
							{
								transacoesRealizadas++;
							}
							
							opcaoContinuar = limiteTransacoes(opcaoContinuar, limiteTransacoes, transacoesRealizadas);
							
						}
						while (opcaoContinuar == 'S');
						}
						else if (opcaoMenuConta == '2')
						{
							System.out.printf("Saldo Atual: R$%.2f\n",universitaria.getSaldoConta());
						}
						else if (opcaoMenuConta == '3')
						{
							System.out.println("Obrigado por utilizar o G7 - Bank.");
							break;
						}
	
					}
					
					break;
				}	
			}
			else if (opcaoMenu == '2')
			{
				System.out.println("wip");
			}
			else
			{
				System.out.println("Obrigado por utilizar o G7 - Bank.");
				break;
			}
			System.out.println("Deseja Continuar S/N");
			opcaoSaida = leia.next().toUpperCase().charAt(0);
		}
		while(opcaoSaida == 'S');
			
	}
	
	public static char menuInicial ()
	{
		Scanner leia = new Scanner (System.in);
		char opcao='0';
		
		System.out.println("\n[1] - Realizar Transações\n[2] - Saldo em Conta\n[3] - Sair");
		System.out.print("\nDigite a opção desejada: ");
		opcao = leia.next().charAt(0);
				
		return (opcao);
	}
	
	public static char limiteTransacoes (char opcaoContinuar, int limiteTransacoes, int transacoesRealizadas)
	{
				
		if (opcaoContinuar == 'S')
		{
			if (transacoesRealizadas == limiteTransacoes)
			{
				System.out.println("Você atingiu o limite de transações diaria. Volte amanhã.");
				opcaoContinuar = 'N';
				return opcaoContinuar;
			} 	
		}
		return opcaoContinuar;
	}	
}