programa
{
	
	funcao inicio()
	{
		inteiro tempoTotalSeg
		
		escreva ("Quantos segundos foram necessarios para fabricar essa peça? ")
		leia (tempoTotalSeg)

		inteiro tempoHoras =  tempoTotalSeg/3600

		inteiro tempoMinutos = (tempoTotalSeg%3600)/60

		inteiro tempoSegundos = (tempoTotalSeg%3600)%60

			
		escreva ("A peça foi fabricada em "+tempoHoras+"h"+tempoMinutos+"min"+tempoSegundos+"s\n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */