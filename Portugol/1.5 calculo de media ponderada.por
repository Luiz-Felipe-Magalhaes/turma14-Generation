programa
{ 
	//Um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. A nota1 tem peso 2, nota2 peso 3 e nota3 peso 5.
	
	funcao inicio()
	{
		real nota1,nota2,nota3
		escreva ("A nota 1 foi de: ")
		leia (nota1)
		
		escreva ("A nota 2 foi de: ")
		leia (nota2)

		escreva ("A nota 3 foi de: ")
		leia (nota3)

		real mediaPonderada = ((nota1*0.2)+(nota2*0.3)+(nota3*0.5))
		escreva ("A média do aluno foi de "+mediaPonderada)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 272; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */