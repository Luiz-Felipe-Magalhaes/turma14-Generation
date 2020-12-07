programa
{
	
	funcao inicio()
	{
		real numeros[5] = {-1.0, -0.5, 0.0, 1.0,1.5}
		caracter codigo

		escreva ("Digite um código: [0] ou [1] ou [2]\n")
		leia (codigo)

		se (codigo=='0')
		{
			escreva ("Programa Finalizado")
		}
		senao se (codigo!='0' e codigo!='1' e codigo!='2')
		{
			escreva ("Código Inválido")
		}

		para (inteiro i=0; i<5; i++)
		{
			se(codigo == '1')
			{
				escreva (numeros[i]," | ")
			}	
		}
		para (inteiro i=4; i>=0; i--)
		{
			se(codigo == '2')
			{
				escreva (numeros[i]," | ")
			}	
		}			
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 6, 7, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */