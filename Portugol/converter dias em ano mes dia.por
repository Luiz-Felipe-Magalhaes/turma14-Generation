programa
{
	
	funcao inicio()
	{
		inteiro idadeTotalDias
		escreva ("Olá, qual a sua idade em dias? ")
		leia (idadeTotalDias)

		inteiro idadeAnos = idadeTotalDias/365

		inteiro idadeMeses = (idadeTotalDias%365)/30
	
		inteiro idadeDias= (idadeTotalDias%365)%30

		escreva ("Você tem ",idadeAnos," ano(s) ",idadeMeses," mes(es) e ",idadeDias," dia(s)")
			
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