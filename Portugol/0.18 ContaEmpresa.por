programa
{
	
	funcao inicio()
	{
		real movimentacoes[10] 
		cadeia numeroConta = "00001", cpf = "12345"
		real saldo = 0.0, limiteEmprestimo = 5000.0, valorEmprestimo = 0.0
		caracter tipoTransacao, aceiteEmprestimo

		escreva ("BEM-VINDO AO G7 BANK\n\n")
		escreva ("Conta-Empresa:",numeroConta,"\nCPF do Titular:",cpf,"\nSaldo: R$:",saldo,"\n")
		
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
		}
		escreva ("\nOBRIGADO POR UTILIZAR O G7 BANK\n\n")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 655; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */