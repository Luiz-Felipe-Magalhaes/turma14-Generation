programa
{
	
	funcao inicio()
	{
		cadeia nome
		caracter opcao
		inteiro nota
		escreva ("Digite seu nome: ")
		leia (nome)
		escreva("[M]Masculino, [F] feminino e [O] outros: ")
		leia(opcao)
		escreva ("Digite a nota: ")
		leia (nota)

		se (nota <= 5)
		{
			se (opcao == 'M' ou opcao == 'm')
			{
			escreva (nome,"\nGênero: Masculino\nReprovado")
			}
			senao se (opcao =='F' ou opcao == 'f') 
			{
			escreva (nome,"\nGênero: Feminino\nReprovada")
			}
			senao se (opcao =='O' ou opcao =='o')
			{
			escreva (nome,"\nGênero: Outro\nReprovade")	
			}
			senao
			{
			escreva("Caractere inválido")	
			}
		}
		se (nota > 5)
		{
			se (opcao == 'M' ou opcao == 'm')
			{
			escreva (nome,"\nGênero: Masculino\nAprovado")
			}		
			senao se (opcao =='F' ou opcao == 'f') 
			{
			escreva (nome,"\nGênero: Feminino\nAprovada")
			}
			senao se (opcao =='O' ou opcao =='o')
			{
			escreva (nome,"\nGênero: Outro\nAprovade")	
			}
			senao
			{
			escreva("Caractere inválido")	
			}
		}
			
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 733; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */