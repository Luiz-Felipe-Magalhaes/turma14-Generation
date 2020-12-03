programa
{
	/*portugues, matematica, ciencias, artes.
	 * nota de 0 a 10 - inteiro
	 * menor igual a 5 reprovado(a)
	 * pedir nome do aluno, e mostrar se esta reprovado ou aprovado
	 */
	funcao inicio()
	{
		cadeia materias[] = {"Português","Matemática","Ciências","Artes"}
		inteiro notas[4]
		cadeia nomeAluno
		caracter genero

		escreva ("Nome do Aluno(a): ")
		leia (nomeAluno)

		escreva ("Gênero que se identifica: [M]Masculino ou [F]Feminino: ")
		leia (genero)

		para (inteiro i = 0; i < 4; i++)
		{
			escreva ("Digite a nota em ",materias[i]," : ")
			leia (notas[i])			
		}
		se (genero == 'M' ou genero == 'm')
		{
			para (inteiro i = 0; i < 4; i++)
			{
				se (notas[i] > 5)
				{
					escreva ("Aluno ",nomeAluno," - Nota: ",notas[i]," - APROVADO em ",materias[i],"\n")
				}
				senao 
				{
					escreva ("Aluno ",nomeAluno," - Nota: ",notas[i]," - REPROVADO em ",materias[i],"\n")
				}
			}
		}
		se (genero == 'F' ou genero == 'f')
		{
			para (inteiro i = 0; i < 4; i++)
			{
				se (notas[i] > 5)
				{
					escreva ("Aluna ",nomeAluno," - Nota: ",notas[i]," - APROVADA em ",materias[i],"\n")
				}
				senao 
				{
					escreva ("Aluna ",nomeAluno," - Nota: ",notas[i]," - REPROVADA em ",materias[i],"\n")
				}
			}
		}		
			
	}
}	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 867; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {materias, 10, 9, 8}-{notas, 11, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */