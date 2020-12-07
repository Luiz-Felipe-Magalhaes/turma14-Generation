programa
{
	//ler numero inteiro positivo e dizer se é par ou impar
	funcao inicio()
	{
		inteiro numeroDeclarado

		escreva ("Olá, qual numero inteiro vôce deseja saber se é par ou impar? ")
		leia (numeroDeclarado)
		
		se  (numeroDeclarado<=0) 
		{
			escreva ("O seu numero não é um inteiro.\n")
		}
		senao se  (numeroDeclarado%2==0)
		{
			escreva ("O seu número é par.\n")
		}
		senao 
		{
			escreva ("O seu número é impar.\n")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */