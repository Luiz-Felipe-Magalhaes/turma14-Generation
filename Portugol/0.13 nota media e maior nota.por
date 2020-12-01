programa
{
	
	funcao inicio()
	{
		//pega nome e nota de 4 alunos e colocar a media geral
		
		//varaveis
		cadeia nomeAluno
		real notaAluno=0.0, somaNota=0.0
		inteiro acimaCinco=0
		real maiorNota=0.0
		
		
		para (inteiro indice = 1; indice<=4; indice++) // indice 1
		{
			escreva("Digite o nome do alunx ",indice," : " )
			leia(nomeAluno)
			escreva("Nota do alunx: ")
			leia(notaAluno)
			somaNota = somaNota+notaAluno
			se (notaAluno >= 5) {
				//acimaCinco = acimaCinco + 1
				acimaCinco++
			}
			se (notaAluno > maiorNota)
			{
				maiorNota = notaAluno	
			}
			
			
		}
		
		escreva("\nQuantidade de alunos com nota acima de 5 :", acimaCinco)
		escreva("\nMedia de notas igual a :", (somaNota / 4))
		escreva("\nMaior nota digita é : ", maiorNota)
		escreva("\nFim de programa!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 803; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */