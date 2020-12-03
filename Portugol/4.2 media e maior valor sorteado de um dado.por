programa
{
	inclua biblioteca Util

	funcao inicio()
	{
		inteiro lancamentos [10]
		inteiro valorDado, somaValor=0, maiorValor=0, ocorrenciasMaior=0

			para (inteiro i = 0; i < 10; i++)
			{
				lancamentos[i] = Util.sorteia(1,6)
				escreva ("Valor sorteado no lançamento ",i+1,": ",lancamentos[i],"\n")

				somaValor = somaValor+lancamentos[i]

				se (lancamentos[i] > maiorValor)
				{
					maiorValor = lancamentos[i]
				}
			}	
			para (inteiro i = 0; i < 10; i++)
			{
				se (lancamentos[i] == maiorValor)
				{
					ocorrenciasMaior++
				}
			}
		escreva ("\nA soma dos valor é: ",somaValor)	
		escreva ("\nA média dos valores lançados é: ",somaValor/10)
		escreva ("\nO maior valor lançado é ",maiorValor, " e ele foi sorteado ",ocorrenciasMaior," vezes.\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */