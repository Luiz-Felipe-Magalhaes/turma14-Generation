programa
{
	inclua biblioteca Util	
	/*Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. 
	 * Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.
	 * 
	 */
	
	funcao inicio()
	{
		inteiro vetor[3], matriz [3][3], valor

		para (inteiro linha=0; linha<3; linha++)
		{
			vetor[linha]=Util.sorteia(0,9)
			escreva (vetor[linha]," ")
		}
		escreva ("\n")
		para (inteiro linha=0; linha<3; linha++)
		{	
			escreva (" \n")
			para (inteiro coluna=0; coluna<3; coluna++)
			{
				matriz[linha][coluna]=Util.sorteia(0,9)
				escreva (matriz[linha][coluna]," ")
			}
		}
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 632; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */