programa
{
	inclua biblioteca Matematica -->mat

	funcao inicio()
	{
		real primeiroNumero,segundoNumero,terceiroNumero,quartoNumero,primeiroQuadrado,segundoQuadrado,terceiroQuadrado,quartoQuadrado
		escreva ("Digite um valor para o primeiro numero: ")
		leia (primeiroNumero)

		escreva ("Digite um valor para o segundo numero: ")
		leia (segundoNumero)

		escreva ("Digite um valor para o terceiro numero: ")
		leia (terceiroNumero)

		escreva ("Digite um valor para o quarto numero: ")
		leia (quartoNumero)

		primeiroQuadrado = mat.arredondar(mat.potencia(primeiroNumero, 2), 2)
		segundoQuadrado = mat.arredondar(mat.potencia(segundoNumero, 2), 2)
		terceiroQuadrado = mat.arredondar(mat.potencia(terceiroNumero, 2), 2)
		quartoQuadrado = mat.arredondar(mat.potencia(quartoNumero, 2), 2)
		
			se (terceiroQuadrado >= 1000)
			{
				escreva ("\n",terceiroQuadrado)
			}
			senao 
			escreva ("O resultado dos numeros digitados ao quadrado é:\n",primeiroNumero," = ",primeiroQuadrado,"\n",
			segundoNumero," = ",segundoQuadrado,"\n",terceiroNumero," = ",terceiroQuadrado,"\n",quartoNumero," = ",quartoQuadrado,"\n")			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 853; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */