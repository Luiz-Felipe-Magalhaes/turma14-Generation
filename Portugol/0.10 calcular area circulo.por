programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real raio,area
		
		escreva ("Digite o raio do circulo: ")
		leia (raio)

		area = mat.arredondar(((mat.potencia(raio,2)*mat.PI)),2)) //(D² * π)/4
		escreva ("A área do circulo é = ",area)		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 90; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */