programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real movimentacoes[10] 
		cadeia numeroConta = "00001", cpf = "12345"
		real saldo = 0.0, acrescimoRecebido
		inteiro diaAniversario = 10, diaAtual
		caracter tipoTransacao
		

		escreva ("BEM-VINDO AO G7 BANK\n\n")
		escreva ("Conta-Poupança:",numeroConta,"\nCPF do Titular:",cpf,"\nSaldo: R$:",saldo,"\n")

		para (inteiro i=0; i<3; i++)
		{
			escreva("\nQual transação deseja realizar [C]Credito ou D[Débito]: ")
			leia (tipoTransacao)
			se (tipoTransacao == 'C' ou tipoTransacao == 'c')
			{
				escreva("Informe o valor da transação: R$")
				leia (movimentacoes[i])
				saldo+=movimentacoes[i]
				escreva ("Transação Realizada com sucesso\n")
				escreva ("Saldo atual: R$",saldo,"\n")
			}
			senao se (tipoTransacao == 'D' ou tipoTransacao == 'd')
			{
				escreva("Informe o valor da transação: R$")
                    leia (movimentacoes[i])
                 	se (saldo-movimentacoes[i] >= 0)
				{
				saldo-=movimentacoes[i]
				escreva ("Transação Realizada com sucesso\n")
				escreva ("Saldo atual: R$",saldo,"\n")
				}
				   senao se (saldo-movimentacoes[i] < 0)
				{
					escreva ("Você nao possui saldo suficiente \n")
					escreva ("Saldo atual: R$",saldo,"\n")
				}
			}
		}
		escreva ("\nDigite o dia atual[dd]: ")
		leia (diaAtual)
		se (diaAtual==diaAniversario)
		{	
			acrescimoRecebido = mat.arredondar((saldo*0.005),2)
			escreva ("\nHoje é o aniversário da sua conta\nVocê recebeu uma rentabilidade extra de: R$",acrescimoRecebido)
			escreva ("\nSaldo atual: R$",saldo+acrescimoRecebido)
		}
		escreva ("\nOBRIGADO POR UTILIZAR O G7 BANK\n\n")
	}
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1654; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */