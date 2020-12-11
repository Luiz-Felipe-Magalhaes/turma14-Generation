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
		int limiteTransacoes = 3, contaTransacoes=0;
		char opcaoMenuConta, opcaoOutraTransacao='N';
		int tamanhoLinha = 80;
		
		
		
		do
		{	
			desenhaLinha(tamanhoLinha);
			System.out.println("\nCONTA EMPRESA - G7 BANK");
			desenhaLinha(tamanhoLinha);
			System.out.println("\n[1] - Realizar Transações\n[2] - Saldo em Conta\n[3] - Solicitar Emprestimo\n[4] - SAIR");
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
							somaSaldo += valorTransacao[i];
							contaTransacoes++;
							saldoConta[i] = somaSaldo;
							
							System.out.printf("\nSaldo Atual: R$%.2f\n",saldoConta[i]);
								
							desenhaLinha(tamanhoLinha);
							
							System.out.print("\nDeseja realizar outra Transação S/N: ");
							opcaoOutraTransacao = leia.next().toUpperCase().charAt(0);
							break;
							
						}
						else if (tipoTransacao[i] == 'D')
						{
							if ((somaSaldo - valorTransacao[i])>=0)
							{
								somaSaldo -= valorTransacao[i];
								saldoConta[i] = somaSaldo;
								
								System.out.print("\nTransação realizada com sucesso.");
								contaTransacoes++;
								System.out.printf("\nSaldo Atual: R$%.2f\n",saldoConta[i]);	
								desenhaLinha(tamanhoLinha);
								System.out.print("\nDeseja realizar outra Transação S/N: ");
								opcaoOutraTransacao = leia.next().toUpperCase().charAt(0);
								break;
							}
							else if ((somaSaldo - valorTransacao[i]) < 0)				
							{
								System.out.println("\nVocê não possui saldo suficiente.");
								saldoConta[i] = somaSaldo;
								System.out.printf("Saldo Atual: R$%.2f\n",saldoConta[i]);	
								desenhaLinha(tamanhoLinha);
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
				System.out.printf("\nSaldo Atual: %.2f\n",somaSaldo);
			}
			
			if (opcaoMenuConta == '3')
			{
				
			}
			
			
			
			
			
		}
		while (true);
		
		
		
		/*EMPRESA - EMPRESTIMO [1000 - 10000] - PODE PEDI EMPRESTADO O VALOR A QUALQUER TEMPO, NÃO PODE FICA NEGATIVO.
		 *  O EMPRESTIMO É SOLICITADO.
		 *O SALDO DO EMPRESTIMO É CORRIGIDO A CADA USO.
		 *
		 *[1]  - 10 MOVIMENTOS PERMITIDOS

			INICIAR MOVIMENTO S/N: _
			
			QUAL O VALOR DO MOVIMENTO: R$ XX.XX
			[D]DÉBITO OU [C] CRÉDITO: _
			
			CONTINUAR S/N: _
			VOLTA AO MENU INICIAL

		 */

	}
	
	
	static void desenhaLinha (int linha)
	{
		for (int i = 1; i<=linha; i++)
		{
			System.out.print("—");
		}
	}		
}
