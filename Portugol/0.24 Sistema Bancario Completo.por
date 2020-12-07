programa
{
	inclua biblioteca Matematica --> mat
	inclua biblioteca Util
	 
	funcao inicio()
	{
		cadeia clientes[39] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins",
		"Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira",
		"Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima",
		"Fernanda Agapito","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves",
		"Gideão da Silva Idelfonso","Gilson Amorim De Matos","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
		"Heloisa Beatriz De Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura",
		"José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni Barros",
		"Lucas Gonçalves da Silva","Luis Felipe da Silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves",
		"Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almena","Vinicius Alves Miranda"}
 		cadeia numeroConta
 		cadeia contas[39] 
 		caracter generos[39]={'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F',
		'M','F','M','M','M','M','M','F','F','M','F','M'}
		caracter opcao = 'n'
		real movimentacoes [5]

		const inteiro dia = 2
		const inteiro operacoes = 2
		
		real matriz[dia][operacoes]
		real saldo = 0.0
		
				
		escreva ("G7-BANK\n")
		escreva ("\nNumero da conta: ")
		leia (numeroConta)

				
		para (inteiro i = 0; i < 39; i++)
		{											
			se (i<9)
			{
			contas[i] = "00"+(i+1)	
			}	
			senao
			{
			contas[i] = "0"+(i+1)
			}
		}
		para (inteiro i = 0; i < 39;i++)
		{
			se (numeroConta == contas[i])
			{
				se (generos[i] == 'M')
				{
					escreva ("Bem-Vindo ",clientes[i],"\n")
				}
				senao se (generos[i] == 'F')
				{
					escreva ("Bem-Vinda ",clientes[i],"\n")
				}
			}
			
		}

		para (inteiro i=0; i<dia; i++ )
			{
			se (i==0){
				saldo=0.0
			}
			senao{
				saldo = matriz[i-1][operacoes-1]
			}
			para (inteiro x=0; x<operacoes; x++){
				
				
			//{
			escreva ("\n\nEscolha o tipo de conta\n")
			escreva ("[1]Conta-Poupança\n[2]Conta-Corrente\n[3]Conta-Especial\n[4]Conta-Empresa\n[5]Conta-Universitária\n[0]Finalizar-Sessão\n")
			leia (opcao)
			//}
			
			
			se (opcao == '1')
			{
				matriz[i][x] = poupanca(saldo)
			}
			senao se (opcao == '2')
			{
				matriz[i][x] = corrente(saldo)	
			}
			senao se (opcao == '3')
			{
				matriz[i][x] = especial(saldo)
			}
			senao se (opcao == '4')
			{
				matriz[i][x] = empresa(saldo)            
			}
			senao se (opcao == '5')
			{
				matriz[i][x] = universitaria(saldo)
			}
			senao se (opcao == '0')
			{
				x = operacoes
			}
			se (opcao != '0')
			{

			saldo = matriz[i][x]
			
			}
			}
			
			}
			escreva("\n\n")

			para (inteiro i=0; i<dia; i++){
				para (inteiro j=0; j<operacoes; j++){
					escreva("Dia ", i+1, " operação ", j+1, " valor: R$", matriz[i][j], "\n")
				}
			}

			escreva ("\n\nOBRIGADO POR UTILIZAR O G7 BANK\n\n")
		
	}
		

               funcao real poupanca (real saldo)   
		        {
		        real movimentacoes 
		        real acrescimoRecebido = 0.00
		        caracter diaAniversario
		        caracter tipoTransacao
		
		      
		            escreva("\nQual transação deseja realizar [C]Credito ou D[Débito]: ")
		            leia (tipoTransacao)
		            se (tipoTransacao == 'C' ou tipoTransacao == 'c')
		            {
		                escreva("Informe o valor da transação: R$")
		                leia (movimentacoes)
		                saldo+=movimentacoes
		                escreva ("Transação Realizada com sucesso\n")
		                escreva ("Saldo atual: R$",saldo,"\n")
		            }
		            senao se (tipoTransacao == 'D' ou tipoTransacao == 'd')
		            {
		                escreva("Informe o valor da transação: R$")
		                    leia (movimentacoes)
		                     se (saldo-movimentacoes >= 0)
		                {
		                saldo-=movimentacoes
		                escreva ("Transação Realizada com sucesso\n")
		                escreva ("Saldo atual: R$",saldo,"\n")
		                }
		                   senao se (saldo-movimentacoes < 0)
		                {
		                    escreva ("Você nao possui saldo suficiente \n")
		                    escreva ("Saldo atual: R$",saldo,"\n")
		                }
		            }
		        
					escreva("É aniversario desta conta? Sim[S] Nao[N]\n")
		                leia(diaAniversario)
		                
		                se(diaAniversario == 'S' ou diaAniversario == 's'){
		                acrescimoRecebido = saldo * 0.005
		                saldo += acrescimoRecebido 
		                
		          	escreva ("\nHoje é o aniversário da sua conta\nVocê recebeu uma rentabilidade extra de: R$",acrescimoRecebido)
		                }
		        
		          	escreva ("\nSaldo atual: R$",mat.arredondar(saldo,2))
		       
		
		        		retorne saldo
		               }

			funcao real corrente (real saldo)
					{
			   real movimentacoes                           // - SOLICITAR NOVO TALÃO E ALTERAR A NUMERAÇÃO
		        cadeia talaoCheque = "T-0" 
		        caracter tipoTransicao, aceiteTalaoCheque
		        inteiro codigoTalao = 0
		
		      
		            escreva("\nQual transação deseja realizar [C]Credito ou D[Débito]: ")
		            leia (tipoTransicao)
		                se (tipoTransicao == 'C' ou tipoTransicao=='c')
		                {
		                    escreva("Informe o valor da transação: R$")
		                    leia (movimentacoes)
		                    saldo+=movimentacoes
		                }
		                senao se (tipoTransicao =='D' ou tipoTransicao =='d')
		                {
		                    escreva("Informe o valor da transação: R$")
		                    leia (movimentacoes)
		                    saldo-=movimentacoes
		                    
		                }  se (saldo <= 0)
		                 {
		                	escreva ("Você nao possui saldo suficiente!! \n")
		                }
		         
		        	 escreva ("Você possui talão de cheque disponivel : ",talaoCheque,codigoTalao,"\nDeseja solicitar [S]Sim ou [N]Não: ")
		        leia (aceiteTalaoCheque)
		        se (aceiteTalaoCheque == 'S' ou aceiteTalaoCheque == 's')
		        {
		        
		        	escreva("Seu novo codigo de talao de cheque é :", talaoCheque,codigoTalao++, "\n")
		        }
		
		
		      retorne saldo
					}

               funcao real especial(real saldo)
               {
		        real movimentacoes 
		        real valorLimite = 5000.0, valorEmprestimo = 0.0
		        caracter tipoTransacao, aceiteEmprestimo
		
		   
		            escreva("\nQual transação deseja realizar [C]Credito ou D[Débito]: ")
		            leia (tipoTransacao)
		            se (tipoTransacao == 'C' ou tipoTransacao=='c')
		            {
		                escreva("Informe o valor da transação: R$")
		                leia (movimentacoes)
		                escreva ("Transação Realizada com sucesso.")
		                saldo+=movimentacoes
		            }
		            senao se (tipoTransacao =='D' ou tipoTransacao =='d')
		            {
		                escreva("Informe o valor da transação: R$")
		                leia (movimentacoes)
		                escreva ("Transação Realizada com sucesso.")
		                saldo-=movimentacoes
		            }
		
		            escreva ("\nSaldo atual: R$",saldo,"\n\n")
		            escreva ("Valor do Limite: R$",valorLimite,"\nDeseja solicitar [S]Sim ou [N]Não: ")
		            leia (aceiteEmprestimo)
		
		            se (aceiteEmprestimo == 'S' ou aceiteEmprestimo == 's')
		            {
		                escreva ("Digite o valor que deseja solicitar: R$")
		                leia (valorEmprestimo)
		            }
				  se (valorEmprestimo > 0 e valorEmprestimo <=valorLimite)
		            {
		                saldo+=valorEmprestimo
		                valorLimite-=valorEmprestimo
		                escreva ("Solicitação realizada com sucesso\n")
		                escreva ("Saldo Atual: R$",saldo,"\n")
		                escreva ("Limite de Empréstimo: R$",valorLimite,"\n")
		            }
		            senao se (valorEmprestimo > 0 e valorEmprestimo > valorLimite)
		            {
		                escreva ("\n\nValor solicitado não autorizado\n\n")
		            }
		        

		       	 retorne saldo
		               }

			funcao real empresa (real saldo)
			{
				 real movimentacoes
        			 real limiteEmprestimo = 5000.0, valorEmprestimo = 0.0
        			 caracter tipoTransacao, aceiteEmprestimo

		            escreva("\nQual transação deseja realizar [C]Credito ou D[Débito]: ")
		            leia (tipoTransacao)
		            se (tipoTransacao == 'C' ou tipoTransacao=='c')
		            {
		                escreva("Informe o valor da transação: R$")
		                leia (movimentacoes)
		                escreva ("Transação Realizada com sucesso.")
		                saldo+=movimentacoes
		            }
		            senao se (tipoTransacao =='D' ou tipoTransacao =='d')
		            {
		                escreva("Informe o valor da transação: R$")
		                leia (movimentacoes)
		                escreva ("Transação Realizada com sucesso.")
		                saldo-=movimentacoes
		            }
		
		            escreva ("\nSaldo atual: R$",saldo,"\n\n")
		            escreva ("Limite de Empréstimo: R$",limiteEmprestimo,"\nDeseja solicitar [S]Sim ou [N]Não: ")
		            leia (aceiteEmprestimo)
		
		            se (aceiteEmprestimo == 'S' ou aceiteEmprestimo == 's')
		            {
		                escreva ("Digite o valor que deseja solicitar: R$")
		                leia (valorEmprestimo)
		            }
				  se (valorEmprestimo > 0 e valorEmprestimo <= limiteEmprestimo)
		            {
		                saldo+=valorEmprestimo
		                limiteEmprestimo-=valorEmprestimo
		                escreva ("Solicitação realizada com sucesso\n")
		                escreva ("Saldo Atual: R$",saldo,"\n")
		                escreva ("Limite de Empréstimo: R$",limiteEmprestimo,"\n")
		            }
		            senao se (valorEmprestimo > 0 e valorEmprestimo > limiteEmprestimo)
		            {
		                escreva ("Valor solicitado não autorizado\n\n")
		            }
		       

		       	   retorne saldo
			}

               funcao real universitaria(real saldo)
               {
               	real movimentacoes 
        			real limiteEmprestimo = 1000.0, valorEmprestimo = 0.0
       			caracter tipoTransicao, aceiteEmprestimo
      	 
		      	 	escreva("\n")
		      	 	escreva("Qual transação deseja realizar [C]Credito ou D[Débito]: ")
		      	 	leia(tipoTransicao)
		      	 		se (tipoTransicao == 'C' ou tipoTransicao == 'c'){
		      	 			escreva("Informe o valor da transação: R$")
		      	 			leia(movimentacoes)
		      	 			saldo = saldo + movimentacoes 	 			
		      	 		}
		
		      	 		senao se (tipoTransicao == 'D' ou tipoTransicao == 'd'){
		      	 			escreva("Informe o valor da transação: R$")
		      	 			leia(movimentacoes)
		      	 			saldo = saldo - movimentacoes
		      	 		}
		      	 		senao{
		      	 			escreva("\n")
		      	 			escreva("ERRO! Por favor, digite novamente!")
		      	 			escreva("\n")
		      	 		}	
		
		      	 		escreva ("Saldo atual: R$",saldo,"\n\n")
		      	 	
					
					escreva("\n")
		      		escreva("Saldo atual: R$", saldo)
		      		escreva("\n")
		      		escreva("Limite de Empréstimo: R$", limiteEmprestimo)
		      		escreva("\n")
		      		escreva("\n")
		      		escreva("Deseja solicitar [S]Sim ou [N]Não: ")
		       		leia (aceiteEmprestimo)
		
		         		   se (aceiteEmprestimo == 'S' ou aceiteEmprestimo == 's')
		         		   {
		               		escreva ("Digite o valor que deseja solicitar: R$")
		               	 	leia (valorEmprestimo)
		               	 	 se (valorEmprestimo > 0 e valorEmprestimo <= limiteEmprestimo){
				                saldo = saldo + valorEmprestimo
				                limiteEmprestimo = limiteEmprestimo - valorEmprestimo             
		           		 }
		           		 senao 
		           		 {
		           		 	escreva("\nTransação não autorizada\n")
		           		 }
		
		           		}
		              		 	senao se (aceiteEmprestimo == 'N' ou aceiteEmprestimo == 'n'){
		               		escreva("\n")
		               		escreva ("OBRIGADO POR UTILIZAR O G7 BANK")
		           			 }
		           		 
		         			escreva("\n")
		         		  	escreva("Saldo atual: R$", saldo)
		      			escreva("\n")
		      			escreva("Limite de Empréstimo: R$", limiteEmprestimo)
		      			escreva("\n")
		      			escreva("\n")
		
		      			retorne saldo
		               }  
		                       
              
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2454; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */