programa
{
	inclua biblioteca Matematica --> mat
		
	funcao inicio()
	{
		real divisao, resultado, dividendo=1, divisor=1
	
		resultado = mat.arredondar((dividendo/divisor),2)
		escreva (dividendo,"/",divisor,"=",resultado)
		escreva ("\n")
		para (real i=1; i<50;i++)
		{	
			dividendo = dividendo + 2
			divisor++
			resultado = mat.arredondar((dividendo/divisor), 2)
			escreva (dividendo,"/",divisor," = ",resultado)
			escreva ("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 121; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */