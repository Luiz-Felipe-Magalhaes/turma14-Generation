programa
{
	
	funcao inicio()
	{
		inteiro idadeAnos, idadeMeses, idadeDias
	 
	 	escreva ("Sua idade em anos, meses e dia\nAnos:")
		leia (idadeAnos)

		escreva ("Meses:")
		leia (idadeMeses)

		escreva ("Dias:")
		leia (idadeDias)

		inteiro idadeDiasTotal = (idadeAnos*365+idadeMeses*30+idadeDias)
		escreva ("Sua idade em dias é de: ",idadeDiasTotal)	 		
	 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 300; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */