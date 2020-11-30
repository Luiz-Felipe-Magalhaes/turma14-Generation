programa
{
        funcao inicio()
        {
		caracter opcao // ASPAS SIMPLES - CADEIA QUE ASPA DUPLA
		cadeia vop
		// e e tb o ou
		escreva("digite o numero da opcao 1/2/3:")
		leia(vop)
		
		escreva("[M]Masculino, [F] feminino e [O] outros:")
		leia(opcao)
		se (opcao == 'M'){
			escreva("PESSOA É DO GENERO MASCULINO!")
		}
		senao se (opcao =='m'){
			escreva("PESSOA É DO GENERO MASCULINO!")
		}
		senao se (opcao =='F' ou opcao == 'f') {
			escreva("PESSOA É DO GÊNERO FEMININO!")	
		}
		senao se (opcao =='O' ou opcao =='o'){
			escreva("PESSOA É DO GÊNERO QUE QUISER!!!")	
		}
		senao {
			escreva("VC ESCOLHEU UMA TECLA ERRADA!!!")	
		}
		escreva("\nFim de programa")
					 
			
		}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 260; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */