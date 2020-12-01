programa
{
	 
	funcao inicio()
	{
		inteiro soma = 0
		const inteiro intervaloTotal = 500

		para (inteiro intervalo=1; intervalo<=intervaloTotal; intervalo++)
		{
			se(intervalo % 2!=0 e intervalo % 3 == 0)
			{
			soma += intervalo
			}
		}
		escreva ("A soma dos numeros impares e multiplos de 3, no intervalo de 1 a 500 é: ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */