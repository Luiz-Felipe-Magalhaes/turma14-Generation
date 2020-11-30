programa
{
	
	funcao inicio()
	{
		inteiro numeroDeclarado

		escreva ("Digite um número inteiro: ")
		leia (numeroDeclarado)
		
		se = (numeroDeclarado==0) 
		{
			escreva ("0 é um número neutro, escolha outra número.\n")
		
		}
		senao se = (numeroDeclarado>0)
		{
			se = (numeroDeclarado%2==0) 
			{
			escreva ("O número é positivo e par.\n")
			}
				senao 
				{
				escreva ("O número é positivo e impar.\n")
				}
		}
		senao se = (numeroDeclarado<0)
		{
			se = (numeroDeclarado%2==0) 
			{
			escreva ("O número é negativo e par.\n")
			}
				senao 
				{
				escreva ("O número é negativo e impar.\n")
				}
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */