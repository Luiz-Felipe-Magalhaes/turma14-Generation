programa
{
	inclua biblioteca Matematica
	//Conversor de temperatura - Fahrenheit para Celsius
	
	funcao inicio()
	{
		real temperaturaFahrenheit
						
		escreva ("Hi! How many Fahrenheit degree are you doing now? ")
		leia (temperaturaFahrenheit)

		real temperaturaCelsius = (temperaturaFahrenheit-32)/1.8  //Formula de conversão °C = (°F - 32)/1,8

		escreva ("The temperature in Celsius is: "+Matematica.arredondar(temperaturaCelsius, 2)+"°C\n"))

		se (temperaturaFahrenheit>=77) {
			escreva ("Today is a pool day!\n") 
		}
		se (temperaturaFahrenheit<=59) {
		escreva ("It's a great day for hot coffee and Netflix!\n") 
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 145; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */