programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a,b,c,d,i,f

		escreva ("o valor de a: ")
		leia (a)
		
		escreva ("o valor de b: ")
		leia (b)
		escreva ("o valor de c: ")
		leia (c)
		escreva ("o valor de d: ")
		leia (d)
		escreva ("o valor de i: ")
		leia (i)
		escreva ("o valor de f: ")
		leia (f)

		real x = mat.arredondar(((c*i)-(b*f))/((a*i-b*d)),2)
		real y = mat.arredondar(((a*f)-(c*d))/((a*i)-(b*d)),2)

		escreva ("x= ",x," y= ",y)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 476; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */