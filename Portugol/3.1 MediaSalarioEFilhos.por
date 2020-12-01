programa
{
	inclua biblioteca Matematica --> mat
		
	funcao inicio()
	{
		real salarioHabitante=0, mediaSalario=0, filhoHabitante=0, mediaFilho=0, maiorSalario=0, habitanteSalarioAte100=0
		real somaSalario=0, somaFilho=0, percentualSalarioAte100=0
		
		const inteiro numeroHabitantes = 2

		para (inteiro habitante = 1; habitante <= numeroHabitantes;habitante++)
			{
				escreva ("Digite o sálario do habitante ",habitante,": R$")
				leia (salarioHabitante) 
				escreva ("Digite a quantidade de filhos do habitante ",habitante,": ")
				leia (filhoHabitante)

				somaSalario+=salarioHabitante
				somaFilho+=filhoHabitante		

				se (salarioHabitante > maiorSalario)
				{
					maiorSalario = salarioHabitante
				}
				se (salarioHabitante <= 100)
				{
					habitanteSalarioAte100++
				}
					
			}
		mediaSalario = mat.arredondar((somaSalario/numeroHabitantes),2)
		mediaFilho = mat.arredondar((somaFilho/numeroHabitantes),2)
		percentualSalarioAte100 = mat.arredondar((habitanteSalarioAte100*100/numeroHabitantes),2)

		escreva ("\nMédia Salarial: R$",mediaSalario)
		escreva ("\nMédia de filhos: ",mediaFilho)
		escreva ("\nMaior sálario: R$",maiorSalario)
		escreva ("\nPercentual de habitantes que recebem até R$100: ",percentualSalarioAte100,"%\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 288; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */