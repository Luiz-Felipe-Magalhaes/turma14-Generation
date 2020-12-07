programa
{
	inclua biblioteca Matematica --> mat
	/*O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação 
	 * sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
	 *Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
	 *IMC em adultos Condição 
	 *Abaixo de 18,5 Abaixo do peso 
	 *Entre 18,5 e 25 Peso normal 
	 *Entre 25 e 30 Acima do peso 
	 *Acima de 30 obeso
	 */
	
	funcao inicio()
	{
		real peso, altura

	 	escreva ("Digite seu peso em Kg: ")
	 	leia (peso)
	 	escreva ("Digite sua altura em metros: ")
	 	leia (altura)

		real imc = mat.arredondar((peso/(altura*2)),2)
		escreva ("\nSeu IMC é: ",imc)

		se (imc < 18.5)
		{
		escreva ("\nSegundo os critérios da OMS você está Abaixo do Peso ideal.")
		}
		se (imc >= 18.5 e imc <= 25)
		{
		escreva ("\nSegundo os critérios da OMS você está no Peso Normal.")
		}
		se (imc > 25 e imc <=30)
		{
		escreva ("\nSegundo os critérios da OMS você está Acima do Peso ideal.")
		}
		se (imc > 30)
		{
		escreva ("\nSegundo os critérios da OMS você é considerado Obeso.")
		}
		escreva ("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1186; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */