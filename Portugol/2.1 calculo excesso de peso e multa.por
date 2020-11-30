programa
{
	inclua biblioteca Matematica --> mat
		
	funcao inicio()
	{
		real pesoTomates
		escreva ("O peso de tomates em Kg é de: ")
		leia (pesoTomates)
		
		real excessoPeso = 	mat.arredondar((pesoTomates-50), 2) 
		real multa = mat.arredondar((excessoPeso*4), 2)
	
		se = (pesoTomates > 50)
		{
			escreva ("O peso limite foi excedido em ",excessoPeso,"Kg. A multa a ser paga é de R$",multa,"\n")
		}
		senao 
		{
			escreva ("O peso está dentro do limite. Não há multa a ser paga.\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 270; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */