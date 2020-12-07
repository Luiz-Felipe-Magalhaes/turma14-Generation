programa
{
	
	funcao inicio()
	{	
		inteiro primeiroNumero, segundoNumero
		escreva("\nDigite o primeiro numero: ")
		leia (primeiroNumero)
		escreva("\nDigite o segundo numero: ")
		leia (segundoNumero)

		multiplicar (primeiroNumero, segundoNumero)

	}

	funcao multiplicar(inteiro x, inteiro y)
	{
		inteiro soma
		soma = x*y
		escreva ("\n",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 355; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */