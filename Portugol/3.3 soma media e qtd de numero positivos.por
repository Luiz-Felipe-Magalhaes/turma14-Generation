programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real numero=0.0, soma=0.0, quantidade=0.0, media=0.0

		enquanto (numero>=0)
		{	
			escreva ("Digite um número: ")
			leia (numero)
			se (numero>=0)
			{
			soma+=numero
			quantidade++
			media=soma/quantidade	
			}		
		}

		escreva ("Soma = ",mat.arredondar(soma, 2),"\n")
		escreva ("Média = ",mat.arredondar(media, 2),"\n")
		escreva ("Quantidade de valores inseridos = ",quantidade,"\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 286; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */