programa
{
	
	funcao inicio()
	{
		inteiro numeros=0, contadorAte25=0, contadorAte50=0, contadorAte75=0, contadorAte100=0
		
		enquanto (numeros >=0)
		{
			escreva ("Digite um número: ")
			leia (numeros)
			se (numeros >= 0 e numeros <= 25)
			{
				contadorAte25++
			}
			se (numeros >= 26 e numeros <= 50)
			{
				contadorAte50++
			}
			se (numeros >= 51 e numeros <= 75)
			{
				contadorAte75++
			}
			se (numeros >= 76 e numeros <= 100)
			{
				contadorAte100++
			} 
		}
		escreva ("\nNumeros entre 0 e 25 digitados: ",contadorAte25)
		escreva ("\nNumeros entre 26 e 50 digitados: ",contadorAte50)
		escreva ("\nNumeros entre 51 e 75 digitados: ",contadorAte75)
		escreva ("\nNumeros entre 76 e 100 digitados: ",contadorAte100)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 483; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */