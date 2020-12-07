programa
{
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
		inteiro notas [39]
		
				
		escreva ("G7-BANK\n")
		enquanto (opcao != '0')
		{
		escreva ("\nNumero da conta: ")
		leia (numeroConta)

		para (inteiro i = 0; i < 39; i++)
		{
			se (i<9)
			{
			contas[i] = "0000"+(i+1)	
			}	
			senao
			{
			contas[i] = "000"+(i+1)
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
		escreva ("Escolha o tipo de conta\n")
		escreva ("[1]Conta-Poupança | [2]Conta-Corrente | [3]Conta-Especial | [4]Conta-Empresa | [5]Conta-Universitária")
		leia (opcao)
		}
		/*se (opcao == '1')
		{
			poupanca
		}
		senao se (opcao == '2')
		{
			corrente	
		}
		senao se (opcao == '3')
		{
			especial	
		}
		senao se (opcao == '4')
		{
			empresa
		}
		senao se (opcao == '5')
		{
			universitaria
		}
	}

		funcao empresa (
			{
				para (inteiro i = 0; i < 3; i++)
				{
					escreva("\nQual transação deseja realizar [C]Credito ou D[Débito]: ")
					leia (tipoTransacao)
					se (tipoTransacao == 'C' ou tipoTransacao=='c')
					{
						escreva("Informe o valor da transação: R$")
						leia (movimentacoes[i])
						escreva ("Transação Realizada com sucesso.")
						saldo+=movimentacoes[i]
					}
					senao se (tipoTransacao =='D' ou tipoTransacao =='d')
					{
						escreva("Informe o valor da transação: R$")
						leia (movimentacoes[i])
						escreva ("Transação Realizada com sucesso.")
						saldo-=movimentacoes[i]
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
				}*/
			}
}		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3817; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */