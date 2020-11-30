programa
{
	
	funcao inicio()
	{
		real baseTriangulo, alturaTriangulo
		escreva ("Digite o valor da base do triângulo: ")
		leia (baseTriangulo)

		escreva ("Digite o valor da base do triângulo: ")
		leia (alturaTriangulo)

		se (baseTriangulo > 0 e alturaTriangulo >0)
		{
			real areaTriangulo = (baseTriangulo*alturaTriangulo)/2
			escreva ("Área do triangulo = ",areaTriangulo,"\n")
		}
		senao 
		escreva ("Os valores digitados não são válidos.\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */