programa
{
	inclua biblioteca Matematica
	//Um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
	
	funcao inicio()
	{

		real x1,y1,x2,y2

		escreva ("Para P1: \n")
		
		escreva ("valor de x1= ")
		leia (x1)

		escreva ("valor de y1= ")
		leia (y1)

		escreva ("Para P2: \n")

		escreva ("valor de x2= ")
		leia (x2)

		escreva ("valor de y2= ")
		leia (y2)
		
		real d = Matematica.arredondar(Matematica.raiz(Matematica.potencia((x2-x1),2)+Matematica.potencia((y2-y1),2),2),2)
		escreva ("d = "+d)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 562; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */