programa
{
	
	funcao inicio()
	{
		cadeia nomePessoa
		inteiro anoNascimento, anoAtual
						
		escreva("Olá! Escreva seu nome: ")
		leia (nomePessoa)

		escreva("Em que ano estamos: ")
		leia (anoAtual)

		escreva("Em qual ano você nasceu: ")
		leia (anoNascimento)

		inteiro idade = anoAtual - anoNascimento

		escreva ("Seja bem-vindo " +nomePessoa+ " você tem " +idade+ " anos. Estamos na Generation!")
		
					
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */