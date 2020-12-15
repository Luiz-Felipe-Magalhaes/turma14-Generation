package banco;

import java.util.*;

public class banco_Completo2 
{

		public static void main(String[] args) 
		{
			Scanner leia = new Scanner(System.in);
			Random sorteia = new Random();
			
			String nomeClientes[] = {"Allen de Lima Vieira","Andr� de Brito Silva da Costa","B�rbara Liboni Guerra","Beatriz Martins",
		            "Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira",
		            "Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima",
		            "Fernanda Agapito","Fernanda Barbosa Ferraz","Francisco Jos� Pires","Gabriel Enrique Cabral Silva","Gabriel S�rgio Nascimento Santos Gon�alves",
		            "Gide�o da Silva Idelfonso","Gilson Amorim De Matos","Guilherme Gon�alves da Silva","Gustavo Rabelo Teles",
		            "Heloisa Beatriz De Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura",
		            "Jos� Jorge Hauck J�nior","Juliana Santos Andr�","K�lven Cleiton de Ara�jo Brand�o","La�s Lima Santos","Lucas anseloni Barros",
		            "Lucas Gon�alves da Silva","Luis Felipe da Silva","Luiz Felipe da Silva Magalh�es","Marcos Eduardo Gomes Gon�alves",
		            "Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Ver�nica Navarro Almena","Vinicius Alves Miranda"};
			char genero[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F',
	                'M','F','M','M','M','M','M','F','F','M','F','M'};
			int numeroConta[] = new int [40];
		    int tipoConta[] = new int [40];
		    String nomeTipoConta[] = {"Conta Poupan�a","Conta Corrente","Conta Especial","Conta Empresa","Conta Universitaria"};
		    double saldoConta[] = new double [40];
		    int conta = 0;
		    int tamanhoLinha=80;
		    int i = 0;
		    
		    for(i=0; i<40; i++) 
		    {
		    	numeroConta[i] = i + 1;
		    }
		    
		    for(i=0; i<40; i++) 
		    {
		    	tipoConta[i] = sorteia.nextInt(5);
		    	//tipoConta[i]=4;
		    }
		   
		    do 
		    {	
		    	System.out.println("G7 BANK");
			    System.out.print("\nDigite o n�mero da conta: ");
			    conta = leia.nextInt();
			    
			    for(i=0; i<40; i++) 
			    {
			    	if(numeroConta[i] == conta) 
			    	{
			    		System.out.printf("Ol� %s\n%s - N�mero: %d",nomeClientes[i], nomeTipoConta[tipoConta[i]],numeroConta[i]);
			    		break;
			    	}
			    }
		      
		      
		    	if (nomeTipoConta[tipoConta[i]].equals("Conta Poupan�a"))
		    	{
		    		saldoConta[i]=contaPoupanca(saldoConta[i]);
		    	}
		    	else if (nomeTipoConta[tipoConta[i]].equals("Conta Corrente"))
		    	{
		    		
		    	}
		    	else if (nomeTipoConta[tipoConta[i]].equals("Conta Especial"))
		    	{
		    		saldoConta[i]=contaEspecial(saldoConta[i]);
		    	}
		    	else if (nomeTipoConta[tipoConta[i]].equals("Conta Empresa"))
		    	{
		    		saldoConta[i]=contaEmpresa(saldoConta[i]);
		    	}
		    	else if (nomeTipoConta[tipoConta[i]].equals("Conta Universitaria"))
		    	{
		    		saldoConta[i]=contaUniversitaria(saldoConta[i]);
		    	}
		    	
		    }
		    while (true);
		}
		
		public static double contaPoupanca(double saldoConta) 
		{
			Scanner leia = new Scanner (System.in);
			char opcaoContinuar='S';
			
			
			//desenhaLinha(tamanhoLinha);		
			char operacao, continuar;	
			double valorMovimentacao[] = new double[10];
			//double saldos[] = new double[10];
			char tipoMovimentacao[] = new char[10];
			char opcaoMenuConta;
			int limiteOperacoes = 10, diaAniversario = 10, i = 0;
			
			//saldos[0] = 0;
			do{
					opcaoMenuConta = menuInicial();
					if (opcaoMenuConta == '1')
					{	
						do
						{	
						System.out.printf("\nQual transa��o deseja realizar [C]Credito ou D[D�bito]: ");
						operacao = leia.next().toUpperCase().charAt(0);
						System.out.printf("Informe o valor da transa��o: R$");
						valorMovimentacao[i] = leia.nextDouble();	
					
						if (operacao == 'C')
						{	
							System.out.print("\nTransa��o realizada com sucesso.");	
							saldoConta += valorMovimentacao[i];
							System.out.printf("\nSaldo Atual: R$%.2f\n",saldoConta);	
							//desenhaLinha(tamanhoLinha);
							tipoMovimentacao[i] = 'C';
							i++;
						}
					
					
							else if (operacao == 'D')
						{
						
							if ((saldoConta - valorMovimentacao[i])>=0)
							{
								
								saldoConta -= valorMovimentacao[i];
								System.out.print("\nTransa��o realizada com sucesso.");
								System.out.printf("\nSaldo Atual: R$%.2f\n",saldoConta);	
								//desenhaLinha(tamanhoLinha);
								tipoMovimentacao[i] = 'D';
								i++;
							}
							else if ((saldoConta- valorMovimentacao[i]) < 0)
							{
								
								System.out.println("\nVoc� nao possui saldo suficiente.");
								System.out.printf("Saldo Atual: R$%.2f\n",saldoConta);	
								//desenhaLinha(tamanhoLinha);
							}

						}
					
					System.out.print("\nDeseja realizar mais transa��es S/N? ");
					opcaoContinuar = leia.next().toUpperCase().charAt(0);
						}
						while (opcaoContinuar == 'S' && i < limiteOperacoes);
					//saldos[i] = saldos[i-1];
					
					}
					else if (opcaoMenuConta == '2')
					{
					System.out.printf("Saldo Atual: R$%.2f\n",saldoConta);
					/*System.out.println("Deseja mostras suas operacoes realizadas, S/N?");
					opcaoContinuar = leia.next().toUpperCase().charAt(0);
					if(opcaoContinuar == 'S') {
						for(i = 0; i < 10; i++) {
							if(valorMovimentacao[i] > 0) {
								if(tipoMovimentacao[i] == 'C') {
									System.out.printf("Credito no valor de %.2f reais\n", valorMovimentacao[i]);
								}else if(tipoMovimentacao[i] == 'D') {
									System.out.printf("Debito no valor de %.2f reais\n", valorMovimentacao[i]);
								}
							}
							
						}*/
					}
			
			
			
				}	
				while (opcaoMenuConta!='3');
					
				System.out.println("Digite o dia de hoje");
				int diaHoje = leia.nextInt();
				if(diaHoje == diaAniversario) 
				{
					saldoConta *= 1.05;
					System.out.println("Parabens! Voce recebeu uma bonifica��o de 5% em sua conta");
					System.out.printf("Seu saldo atual � de %.2f\n", saldoConta);
				}
				
			return saldoConta;	
	    }	
		
		
		
		public static double contaEspecial(double saldoConta) 
		{
			Scanner leia = new Scanner(System.in); 
			{
				char operacao,opcaoContinuar,opcaoMenuConta = 0; 
				double valorOperacao,limiteTotal = 1000, limiteDisponivel=1000,somaLimite=0,saldoNegativo =-1000;
				int limiteOperacoes=10;
				
				do{
					opcaoMenuConta = menuInicial();
					if (opcaoMenuConta == '1')
					{	
						do {
							for (int i = 1; i <= limiteOperacoes; i++) {
								System.out.printf("\nQual transa��o deseja realizar [C]Credito ou D[D�bito]: ");
								operacao = leia.next().toUpperCase().charAt(0);
								System.out.printf("Informe o valor da transa��o: R$");
								valorOperacao = leia.nextDouble();
				
								if (operacao == 'C') {
									System.out.print("\nTransa��o realizada com sucesso.");					
									
									if ((limiteDisponivel + valorOperacao) <= limiteTotal && saldoConta >= 0)
									{
										limiteDisponivel+=valorOperacao;
										System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta);
									}		
									else if ((limiteDisponivel + valorOperacao) > limiteTotal && saldoConta >= 0)
									{
										somaLimite = limiteTotal - limiteDisponivel;
										valorOperacao-=somaLimite;
										saldoConta+=valorOperacao;
										limiteDisponivel=limiteTotal;
										System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta);
										
									}			 
									else if (saldoConta + valorOperacao >=0 && limiteDisponivel == 0)
									{
										
										if ((limiteDisponivel+valorOperacao+saldoConta) > limiteTotal)
										{
											somaLimite = limiteTotal - limiteDisponivel;
											limiteDisponivel = 1000;
											saldoConta+=valorOperacao-somaLimite;
											System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta);
										}
										else if ((limiteDisponivel+valorOperacao+saldoConta) <= limiteTotal)
										{
											limiteDisponivel+=valorOperacao+saldoConta;
											saldoConta=0;
											System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta);
										}
									}
									else if (saldoConta < 0 && limiteDisponivel == 0)
									{
										if (saldoConta+valorOperacao > 0)
										{
											limiteDisponivel+=valorOperacao-saldoConta;
										}
										else if (saldoConta+valorOperacao < 0)
										{			
											saldoConta+=valorOperacao;
										}
										System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta);
									}
									
								} 
								else if (operacao == 'D') {			
									
									if ((saldoConta - valorOperacao) >= 0) {
										saldoConta -= valorOperacao;
										System.out.print("\nTransa��o realizada com sucesso.");
										System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta); //incluir limite disponivel
										
									}
									
																			
									else if ((saldoConta - valorOperacao) < 0 && (saldoConta - valorOperacao) >= saldoNegativo && (limiteDisponivel - valorOperacao) >= 0)
									{		
										limiteDisponivel += saldoConta-valorOperacao;				
										saldoConta = 0;
										System.out.printf("\nTransa��o realizada com sucesso. Voc� utilizou o seu limite.");
										System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta); //incluir limite disponivel
										//desenhaLinha(tamanhoLinha);
									}                                           
									else if ((saldoConta - valorOperacao) < 0 && (saldoConta - valorOperacao) >= saldoNegativo+limiteDisponivel*-1 && (limiteDisponivel - valorOperacao) <= 0)
									{
										saldoConta-=valorOperacao-limiteDisponivel;
										limiteDisponivel=0;
										System.out.printf("\nTransa��o realizada com sucesso. Voc� est� negativado.");
										System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta);
									}
									
									
									else if ((saldoConta - valorOperacao) < 0 && (saldoConta - valorOperacao) < saldoNegativo) 
									{	
										System.out.println("\nTransa��o N�o autorizada. Limite indisponivel.");
										System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta); //incluir limite disponivel
										
									}
									
								
				
								}
				
							}
							System.out.print("\nDeseja realizar mais transa��es S/N? ");
							opcaoContinuar = leia.next().toUpperCase().charAt(0);
						} while (opcaoContinuar == 'S');
					
					
					}
					else if (opcaoMenuConta == '2')
					{
					System.out.printf("Saldo Atual: R$%.2f\n",saldoConta);
				
					}
			
			
			
				}	
				while (opcaoMenuConta!='3');
				return saldoConta;
			}
		}
		
		public static double contaEmpresa(double saldoConta) 
		{
			Scanner leia = new Scanner (System.in);
			
			double valorTransacao[] = new double [10];
			char tipoTransacao [] = new char [10];
			double somaSaldo=0;
			double limiteEmprestimo=10000, valorEmprestimo=0;
			int limiteTransacoes = 3, contaTransacoes=0;
			char opcaoMenuConta, opcaoOutraTransacao='N', opcaoEmprestimo;
			int tamanhoLinha = 80;
					
					
			do
			{	
				opcaoMenuConta = menuInicial();
				
				if (opcaoMenuConta == '1')
				{	
					do 
					{
						for (int i=0; i<limiteTransacoes; i++)
						{
							System.out.printf("\nQual transa��o deseja realizar [C]Credito ou D[D�bito]: ");
							tipoTransacao[i]= leia.next().toUpperCase().charAt(0);
							System.out.printf("Informe o valor da transa��o: R$");
							valorTransacao[i] = leia.nextDouble();
							
							if (tipoTransacao[i] == 'C')
							{
								System.out.print("\nTransa��o realizada com sucesso.");
								saldoConta+= valorTransacao[i];
								contaTransacoes++;
								System.out.printf("\nSaldo Atual: R$%.2f\n",saldoConta);	
								System.out.printf("\nVoc� tem um emprestimo pr�-aprovado de R$%.2f. "
										+ "\nDeseja contratar S/N? ",limiteEmprestimo);
								opcaoEmprestimo = leia.next().toUpperCase().charAt(0);
								if (opcaoEmprestimo == 'S')
								{
									System.out.print("Digite o valor que deseja solicitar: R$");
									valorEmprestimo = leia.nextDouble();
									if ((limiteEmprestimo-valorEmprestimo) < 0)
									{
										System.out.println("\nValor n�o disponivel.");
									}
									else if ((limiteEmprestimo-valorEmprestimo) >= 0)
									{
										limiteEmprestimo-=valorEmprestimo;
										saldoConta+= valorEmprestimo;
										System.out.println("\nEmprestimo contratado com sucesso.");
										System.out.printf("Novo limite de Emprestimo: R$%.2f",limiteEmprestimo);
										System.out.printf("\nSaldo Atual: R$%.2f\n",saldoConta);
									}
									
								}
								System.out.print("\nDeseja realizar outra Transa��o S/N: ");
								opcaoOutraTransacao = leia.next().toUpperCase().charAt(0);
								break;
								
								
							}
							else if (tipoTransacao[i] == 'D')
							{
								if ((saldoConta- valorTransacao[i])>=0)
								{
																
									System.out.print("\nTransa��o realizada com sucesso.");
									contaTransacoes++;
									saldoConta -= valorTransacao[i];
									System.out.printf("\nSaldo Atual: R$%.2f\n",saldoConta);	
									System.out.printf("\nVoc� tem um emprestimo pr�-aprovado de R$%.2f. "
											+ "\nDeseja contratar S/N? ",limiteEmprestimo);
									opcaoEmprestimo = leia.next().toUpperCase().charAt(0);
									if (opcaoEmprestimo == 'S')
									{
										System.out.print("Digite o valor que deseja solicitar: R$");
										valorEmprestimo = leia.nextDouble();
										if ((limiteEmprestimo-valorEmprestimo) < 0)
										{
											System.out.println("\nValor n�o disponivel.");
										}
										else if ((limiteEmprestimo-valorEmprestimo) >= 0)
										{
											limiteEmprestimo-=valorEmprestimo;
											saldoConta += valorEmprestimo;
											System.out.println("\nEmprestimo contratado com sucesso.");
											System.out.printf("Novo limite de Emprestimo: R$%.2f",limiteEmprestimo);
											System.out.printf("\nSaldo Atual: R$%.2f\n",saldoConta);
											
										}
										
									}
									System.out.print("\nDeseja realizar outra Transa��o S/N: ");
									opcaoOutraTransacao = leia.next().toUpperCase().charAt(0);
									break;
								}
								else if ((saldoConta - valorTransacao[i]) < 0)				
								{
									System.out.println("\nVoc� n�o possui saldo suficiente.");
									System.out.printf("Saldo Atual: R$%.2f\n",saldoConta);
									System.out.printf("\nVoc� tem um emprestimo pr�-aprovado de R$%.2f. "
											+ "\nDeseja contratar S/N? ",limiteEmprestimo);
									opcaoEmprestimo = leia.next().toUpperCase().charAt(0);
									if (opcaoEmprestimo == 'S')
									{
										System.out.print("Digite o valor que deseja solicitar: R$");
										valorEmprestimo = leia.nextDouble();
										if ((limiteEmprestimo-valorEmprestimo) < 0)
										{
											System.out.println("\nValor n�o disponivel.");
										}
										else if ((limiteEmprestimo-valorEmprestimo) >= 0)
										{
											limiteEmprestimo-=valorEmprestimo;
											saldoConta += valorEmprestimo;
											System.out.println("\nEmprestimo contratado com sucesso.");
											System.out.printf("Novo limite de Emprestimo: R$%.2f",limiteEmprestimo);
											System.out.printf("\nSaldo Atual: R$%.2f\n",saldoConta);
								
										}
										
									}
									System.out.print("\nDeseja realizar outra Transa��o S/N: ");
									opcaoOutraTransacao = leia.next().toUpperCase().charAt(0);
									break;
								}
							}
							
						}
										
					}
					while(opcaoOutraTransacao == 'S' && contaTransacoes < limiteTransacoes);
					if (contaTransacoes == limiteTransacoes)
					{
						System.out.println("\nInfelizmente voc� atingiu o limite de transa��es do dia.");
					}
					
				}
				if (opcaoMenuConta == '2')
				{	
					System.out.printf("\nSaldo Atual: %.2f\n",saldoConta);
				}
				if (opcaoMenuConta == '3')
				{
					System.out.println("Obrigado por utilizar o G7Bank.");
					break;
				}
			}
			while (true);
			
			return saldoConta;
			
		}
		
		public static char menuInicial ()
		{
			Scanner leia = new Scanner (System.in);
			char opcao='0';
			
			System.out.println("\n[1] - Realizar Transa��es\n[2] - Saldo em Conta\n[3] - Sair");
			System.out.print("\nDigite a op��o desejada: ");
			opcao = leia.next().charAt(0);
			
			
			return (opcao);
		}
		
		public static double contaUniversitaria(double saldoConta) 
		{
			Scanner leia = new Scanner(System.in);
			//System.out.printf("\nConta Universit�ria");
			//System.out.printf("\nN�mero da conta: %s", conta);
			//System.out.printf("\nSalto Atual: R$%.2f\n", saldo);
			//desenhaLinha(tamanhoLinha);

			double limiteTotal = 1000, limiteDisponivel=1000;
			double saldoNegativo =-1000;
			int limiteOperacoes = 10;
			
			
			char operacao, opcaoContinuar, opcaoMenuConta;
		
			//saldo valorOperacao;
			double valorOperacao, somaLimite=0;
			
			
			do{
				opcaoMenuConta = menuInicial();
				if (opcaoMenuConta == '1')
				{	
					do {
						for (int i = 1; i <= limiteOperacoes; i++) {
							System.out.printf("\nQual transa��o deseja realizar [C]Credito ou D[D�bito]: ");
							operacao = leia.next().toUpperCase().charAt(0);
							System.out.printf("Informe o valor da transa��o: R$");
							valorOperacao = leia.nextDouble();
			
							if (operacao == 'C') 
							{
								System.out.print("\nTransa��o realizada com sucesso.");					
								if ((limiteDisponivel + valorOperacao) <= limiteTotal && saldoConta >= 0)
								{
									limiteDisponivel+=valorOperacao;
									System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta);
								}		
								else if ((limiteDisponivel + valorOperacao) > limiteTotal && saldoConta >= 0)
								{
									somaLimite = limiteTotal - limiteDisponivel;
									valorOperacao-=somaLimite;
									saldoConta+=valorOperacao;
									limiteDisponivel=limiteTotal;
									System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta);
									
								}			 
								else if (saldoConta + valorOperacao >=0 && limiteDisponivel == 0)
								{
									
									if ((limiteDisponivel+valorOperacao+saldoConta) > limiteTotal)
									{
										somaLimite = limiteTotal - limiteDisponivel;
										limiteDisponivel = 1000;
										saldoConta+=valorOperacao-somaLimite;
										System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta);
									}
									else if ((limiteDisponivel+valorOperacao+saldoConta) <= limiteTotal)
									{
										limiteDisponivel+=valorOperacao+saldoConta;
										saldoConta=0;
										System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta);
									}
								}
								else if (saldoConta < 0 && limiteDisponivel == 0)
								{
									if (saldoConta+valorOperacao > 0)
									{
										limiteDisponivel+=valorOperacao-saldoConta;
									}
									else if (saldoConta+valorOperacao < 0)
									{			
										saldoConta+=valorOperacao;
									}
									System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta);
								}
								
							} 
							else if (operacao == 'D') {			
								//verificar se o debito foi realizado com sucesso e o saldo fica positivo.
								if ((saldoConta - valorOperacao) >= 0) {
									saldoConta -= valorOperacao;
									System.out.print("\nTransa��o realizada com sucesso.");
									System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta); //incluir limite disponivel
									//desenhaLinha(tamanhoLinha);
								}
								//verificar se entrou no limite.
																		
								else if ((saldoConta - valorOperacao) < 0 && (saldoConta - valorOperacao) >= saldoNegativo && (limiteDisponivel - valorOperacao) >= 0)
								{		
									limiteDisponivel += saldoConta-valorOperacao;				
									saldoConta = 0;
									System.out.printf("\nTransa��o realizada com sucesso. Voc� utilizou o seu limite.");
									System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta); //incluir limite disponivel
									//desenhaLinha(tamanhoLinha);
								}                                           
								else if ((saldoConta - valorOperacao) < 0 && (saldoConta - valorOperacao) >= saldoNegativo+limiteDisponivel*-1 && (limiteDisponivel - valorOperacao) <= 0)
								{
									saldoConta-=valorOperacao-limiteDisponivel;
									limiteDisponivel=0;
									System.out.printf("\nTransa��o realizada com sucesso. Voc� est� negativado.");
									System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta);
								}
								//verificar caso o cliente ultrapasse valor dispon�vel do limite.
								
								else if ((saldoConta - valorOperacao) < 0 && (saldoConta - valorOperacao) < saldoNegativo) 
								{	
									System.out.println("\nTransa��o N�o autorizada. Limite indisponivel.");
									System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteDisponivel, saldoConta); //incluir limite disponivel
									
								}
								
							
			
							}
			
						}
						System.out.print("\nDeseja realizar mais transa��es S/N? ");
						opcaoContinuar = leia.next().toUpperCase().charAt(0);
					} while (opcaoContinuar == 'S');
				//saldos[i] = saldos[i-1];
				
				}
				else if (opcaoMenuConta == '2')
				{
				System.out.printf("Saldo Atual: R$%.2f\n",saldoConta);
				/*System.out.println("Deseja mostras suas operacoes realizadas, S/N?");
				opcaoContinuar = leia.next().toUpperCase().charAt(0);
				if(opcaoContinuar == 'S') {
					for(i = 0; i < 10; i++) {
						if(valorMovimentacao[i] > 0) {
							if(tipoMovimentacao[i] == 'C') {
								System.out.printf("Credito no valor de %.2f reais\n", valorMovimentacao[i]);
							}else if(tipoMovimentacao[i] == 'D') {
								System.out.printf("Debito no valor de %.2f reais\n", valorMovimentacao[i]);
							}
						}
						
					}*/
				}
		
		
		
			}	
			while (opcaoMenuConta!='3');
				
			return saldoConta;
		}

		
		

		public static void desenhaLinha (int linha)
		{
			for (int i = 1; i<=linha; i++)
			{
				System.out.print("�");
			}
		}

	}
