programa
{
	
	funcao inicio()
	{
		escreva("Olá Mundo")
	}

	funcao cadeia situacao(caracter genero, real nota){
		cadeia retorno

		se ((genero == 'M' ou genero == 'm')  e nota > 5)
		{
			retorno = "aprovado"	
		}
		senao se  ((genero == 'M' ou genero == 'm')  e nota <= 5)
		{
			retorno = "reprovado"	
		}
		senao se ((genero == 'F' ou genero == 'f')  e nota > 5)
		{
			retorno = "aprovada"	
		}
		senao se  ((genero == 'F' ou genero == 'f')  e nota <= 5)
		{
			retorno = "reprovada"	
		} senao {
			retorno = "indefinido"
		}
		
		retorne retorno
	}

	

	funcao pula() 
	{
		escreva("\n")
	}

	funcao linha()
	{
		para (inteiro x = 1; x <= 60; x++)
		{
			escreva("═")	
		}
		escreva("\n")
	}
	funcao linhaTamanho( inteiro tamanho)
	{
		para (inteiro x = 1; x <= tamanho; x++)
		{
			escreva("═")	
		}
		escreva("\n")
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 838; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */