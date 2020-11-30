programa
{
	inclua biblioteca Matematica
	//Conversor de temperatura - Celsius para Fahrenheit
	
	funcao inicio()
	{
		real temperaturaCelsius
						
		escreva ("Hi! How many Celsius degree are you doing now? ")
		leia (temperaturaCelsius)

		real temperaturaFahrenheit = temperaturaCelsius*1.8+32   //Formula de conversão °F = °C × 1, 8 + 32

		escreva ("The temperature in Fahrenheit is: ",temperaturaFahrenheit,"°F\n")
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */