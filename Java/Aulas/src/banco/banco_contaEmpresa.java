package banco;

import java.util.*;

public class banco_contaEmpresa 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		double valorTransacao[] = new double [10];
		char tipoTransacao [] = new char [10];
		double saldoConta[] = new double [40];
		double somaSaldo=0;
		double limiteEmprestimo=10000, valorEmprestimo=0;
		int limiteTransacoes = 3, contaTransacoes=0;
		char opcaoMenuConta, opcaoOutraTransacao='N', opcaoEmprestimo;
		int tamanhoLinha = 80;
		
				
		do
		{	
			desenhaLinha(tamanhoLinha);
			System.out.println("\nCONTA EMPRESA - G7 BANK");
			desenhaLinha(tamanhoLinha);
			System.out.println("\n[1] - Realizar Transações\n[2] - Saldo em Conta\n[3] - Sair");
			desenhaLinha(tamanhoLinha);
			System.out.print("\nDigite a opção desejada: ");
			opcaoMenuConta = leia.next().charAt(0);
					
			if (opcaoMenuConta == '1')
			{	
				do 
				{
					for (int i=0; i<limiteTransacoes; i++)
					{
						System.out.printf("\nQual transação deseja realizar [C]Credito ou D[Débito]: ");
						tipoTransacao[i]= leia.next().toUpperCase().charAt(0);
						
						System.out.printf("Informe o valor da transação: R$");
						valorTransacao[i] = leia.nextDouble();
						
						if (tipoTransacao[i] == 'C')
						{
							System.out.print("\nTransação realizada com sucesso.");
							/*somaSaldo*/saldoConta[i] += valorTransacao[i];
							contaTransacoes++;
							//saldoConta[i] = somaSaldo;
							System.out.printf("\nSaldo Atual: R$%.2f\n",saldoConta[i]);	
							desenhaLinha(tamanhoLinha);
							System.out.printf("\nVocê tem um emprestimo pré-aprovado de R$%.2f. "
									+ "\nDeseja contratar S/N? ",limiteEmprestimo);
							opcaoEmprestimo = leia.next().toUpperCase().charAt(0);
							if (opcaoEmprestimo == 'S')
							{
								System.out.print("Digite o valor que deseja solicitar: R$");
								valorEmprestimo = leia.nextDouble();
								if ((limiteEmprestimo-valorEmprestimo) < 0)
								{
									System.out.println("\nValor não disponivel.");
								}
								else if ((limiteEmprestimo-valorEmprestimo) >= 0)
								{
									limiteEmprestimo-=valorEmprestimo;
									/*somaSaldo*/ saldoConta[i]+= valorEmprestimo;
									//saldoConta[i]=somaSaldo;
									System.out.println("\nEmprestimo contratado com sucesso.");
									System.out.printf("Novo limite de Emprestimo: R$%.2f",limiteEmprestimo);
									System.out.printf("\nSaldo Atual: R$%.2f\n",saldoConta[i]);
									desenhaLinha(tamanhoLinha);
								}
								
							}
							System.out.print("\nDeseja realizar outra Transação S/N: ");
							opcaoOutraTransacao = leia.next().toUpperCase().charAt(0);
							break;
							
							
						}
						else if (tipoTransacao[i] == 'D')
						{
							if ((saldoConta[i]- valorTransacao[i])>=0)
							{
															
								System.out.print("\nTransação realizada com sucesso.");
								contaTransacoes++;
								/*somaSaldo*/saldoConta[i] -= valorTransacao[i];
								//saldoConta[i]=somaSaldo;
								System.out.printf("\nSaldo Atual: R$%.2f\n",saldoConta[i]);	
								desenhaLinha(tamanhoLinha);
								System.out.printf("\nVocê tem um emprestimo pré-aprovado de R$%.2f. "
										+ "\nDeseja contratar S/N? ",limiteEmprestimo);
								opcaoEmprestimo = leia.next().toUpperCase().charAt(0);
								if (opcaoEmprestimo == 'S')
								{
									System.out.print("Digite o valor que deseja solicitar: R$");
									valorEmprestimo = leia.nextDouble();
									if ((limiteEmprestimo-valorEmprestimo) < 0)
									{
										System.out.println("\nValor não disponivel.");
									}
									else if ((limiteEmprestimo-valorEmprestimo) >= 0)
									{
										limiteEmprestimo-=valorEmprestimo;
										/*somaSaldo*/saldoConta[i] += valorEmprestimo;
										//saldoConta[i]=somaSaldo;
										System.out.println("\nEmprestimo contratado com sucesso.");
										System.out.printf("Novo limite de Emprestimo: R$%.2f",limiteEmprestimo);
										System.out.printf("\nSaldo Atual: R$%.2f\n",saldoConta[i]);
										desenhaLinha(tamanhoLinha);
									}
									
								}
								System.out.print("\nDeseja realizar outra Transação S/N: ");
								opcaoOutraTransacao = leia.next().toUpperCase().charAt(0);
								break;
							}
							else if ((/*somaSaldo*/ saldoConta[i] - valorTransacao[i]) < 0)				
							{
								System.out.println("\nVocê não possui saldo suficiente.");
								//saldoConta[i] = somaSaldo;
								System.out.printf("Saldo Atual: R$%.2f\n",saldoConta[i]);
								desenhaLinha(tamanhoLinha);
								System.out.printf("\nVocê tem um emprestimo pré-aprovado de R$%.2f. "
										+ "\nDeseja contratar S/N? ",limiteEmprestimo);
								opcaoEmprestimo = leia.next().toUpperCase().charAt(0);
								if (opcaoEmprestimo == 'S')
								{
									System.out.print("Digite o valor que deseja solicitar: R$");
									valorEmprestimo = leia.nextDouble();
									if ((limiteEmprestimo-valorEmprestimo) < 0)
									{
										System.out.println("\nValor não disponivel.");
									}
									else if ((limiteEmprestimo-valorEmprestimo) >= 0)
									{
										limiteEmprestimo-=valorEmprestimo;
										/*somaSaldo*/saldoConta[i] += valorEmprestimo;
										//saldoConta[i]=somaSaldo;
										System.out.println("\nEmprestimo contratado com sucesso.");
										System.out.printf("Novo limite de Emprestimo: R$%.2f",limiteEmprestimo);
										System.out.printf("\nSaldo Atual: R$%.2f\n",saldoConta[i]);
										desenhaLinha(tamanhoLinha);
									}
									
								}
								System.out.print("\nDeseja realizar outra Transação S/N: ");
								opcaoOutraTransacao = leia.next().toUpperCase().charAt(0);
								break;
							}
						}
						
					}
									
				}
				while(opcaoOutraTransacao == 'S' && contaTransacoes < limiteTransacoes);
				if (contaTransacoes == limiteTransacoes)
				{
					System.out.println("\nInfelizmente você atingiu o limite de transações do dia.");
				}
				
			}
			if (opcaoMenuConta == '2')
			{	
				System.out.printf("\nSaldo Atual: %.2f\n",somaSaldo/*saldoConta[i]*/);
				desenhaLinha(tamanhoLinha);
			}
			if (opcaoMenuConta == '3')
			{
				System.out.println("Obrigado por utilizar o G7Bank.");
				break;
			}
		}
		while (true);
		
	}
	
	
	public static void desenhaLinha (int linha)
	{
		for (int i = 1; i<=linha; i++)
		{
			System.out.print("—");
		}
	}
	
}
