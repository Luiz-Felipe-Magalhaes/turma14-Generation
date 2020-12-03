programa
{
	
	funcao inicio()
	{
		inteiro valor[5]
		inteiro maiorValor=0

		para (inteiro i=0; i<5; i++)
		{
		escreva ("Digite a pontuação da atividade ",i+1," : ")
		leia (valor[i])

			se (valor[i] > maiorValor)
			{
				maiorValor = valor[i]
			}
		}
		escreva ("Pontuações: ")
		para (inteiro i=0; i<5; i++)
		{
			escreva (valor[i])
			escreva (" ")
		}
				
		escreva ("\nA maior pontuação foi: ",maiorValor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 364; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */