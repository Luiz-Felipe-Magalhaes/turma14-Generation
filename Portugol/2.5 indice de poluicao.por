programa
{
	
	funcao inicio()
	{
		real indicePoluicao
		escreva("Digite o índice de poluição atual: ")
		leia (indicePoluicao)

		se = (indicePoluicao >= 0.5)
		{
			escreva ("O índice de poluição é de ",indicePoluicao,". Todas as indústrias do 1º, 2º e 3º grupo devem suspender suas atividades.")
		}
		senao se = (indicePoluicao >= 0.4)
		{
			escreva ("O índice de poluição é de ",indicePoluicao,". Todas as indústrias do 1º e 2º grupo devem suspender suas atividades.")
		}
		senao se = (indicePoluicao >= 0.3)
		{
			escreva ("O índice de poluição é de ",indicePoluicao,". Todas as indústrias do 1º grupo devem suspender suas atividades.") 		
		}
		senao se= (indicePoluicao <=0.25) 
		{
			escreva ("O índice de poluição está dentro dos limites aceitos.\n")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 697; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */