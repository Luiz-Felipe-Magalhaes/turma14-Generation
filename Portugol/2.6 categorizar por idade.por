programa
{

	funcao inicio()
	{
		inteiro idadeNadador
		escreva ("Digite a idade do nadador: ")
		leia (idadeNadador)

		se = (idadeNadador>=18)
		{
			escreva ("Categoria: Adultos\n")
		}
		senao se = (idadeNadador>=14)
		{
		 	escreva ("Categoria: Juvenil B\n")
		}
		senao se = (idadeNadador>=12)
		{
		 	escreva ("Categoria: Juvenil A\n")
		}
		senao se = (idadeNadador>=8)
		{
		 	escreva ("Categoria: Infantil B\n")
		}
		senao se = (idadeNadador>=5)
		{
		 	escreva ("Categoria: Infantil A\n")
		}
		senao 
		{
			escreva ("O nadador não se encaixa em nenhuma categoria, portante não poderá entrar.\n")
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 11; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */