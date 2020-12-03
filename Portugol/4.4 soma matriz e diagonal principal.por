programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3], soma=0, somaDiagonal=0
		
		escreva ("Digite os valores da matriz\n")
		
		para (inteiro linha = 0; linha < 3; linha++)
		{
			para (inteiro coluna = 0; coluna < 3; coluna++)
			{
				escreva ("Posição - ",linha," ",coluna,": ")
				leia (matriz[linha][coluna])

				soma = soma+(matriz[linha][coluna])

				se (matriz[linha][coluna]==matriz[coluna][linha])
					{
						somaDiagonal = somaDiagonal+matriz[linha][coluna]
					}
			}
			
		}
		
		escreva ("\nSoma dos valores da matriz = ",soma)	
		escreva ("\nSoma dos valores da diagonal principal da matriz = ",somaDiagonal,"\n")		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 126; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */