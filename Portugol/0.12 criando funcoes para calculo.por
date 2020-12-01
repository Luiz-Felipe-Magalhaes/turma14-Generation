programa
{
	inclua biblioteca Matematica --> mat

	funcao inicio()
	{
		linha ()
		escreva ("CÁLCULO DE ÁREA DE FIGURAS")
		linha ()
		pula() pula()
		caracter tipo
				
		escreva ("1 para Circulo | 2 para Triângulo | 3 para Retângulo\nEscolhe o tipo de figura que deseja calcular: ")
		leia (tipo)

		se = (tipo=='1') //Calcula a área do Circulo
		{
		calculoAreaCirculo()
		}
		senao se = (tipo=='2')
		{
		calculoAreaTriangulo()
		}
		senao se = (tipo=='3')
		{
		calculoAreaRetangulo()
		}
		senao
		{
		escreva ("A opção é inválida")
		}
		pula()
		linha()
	}
		
	
	//FUNÇÕES FORA DO PRINCIPAL
	funcao calculoAreaCirculo() //calcula a área de um circulo, a partir do seu raio
	{
		real raioCirculo,areaCirculo
		
		escreva ("Digite o raio do círculo: ")
		leia (raioCirculo)

		areaCirculo = mat.arredondar(((mat.potencia(raioCirculo,2)*mat.PI)),2)) //(D² * π)/4
		escreva ("A área do circulo é = ",areaCirculo)
	}

	funcao calculoAreaTriangulo() //calculo a área de um triângulo, a partir da base e altura
	{
		real alturaTriangulo, baseTriangulo, areaTriangulo
	
		escreva ("Digite a altura de um triângulo: ")
		leia(alturaTriangulo)
			
		escreva ("Digite a base de um triângulo: ")
		leia(baseTriangulo)
			
		areaTriangulo = mat.arredondar(((alturaTriangulo*baseTriangulo)/2),2) //(b * h)/2
		escreva("A área do triângulo é = "+areaTriangulo)	
	}

	funcao calculoAreaRetangulo() //calcula a área de um retângulo, a partir da base e altura
	{
		real baseRetangulo, alturaRetangulo, areaRetangulo
			
		escreva ("Digite a altura de um retângulo: ")
		leia(alturaRetangulo)
			
		escreva ("Digite a base de um retângulo: ")
		leia(baseRetangulo)
			
		areaRetangulo = mat.arredondar((baseRetangulo*alturaRetangulo),2) //(b * h)/2
		escreva("Area do retângulo é = ",areaRetangulo)
	}

	funcao linha() //desenha linha tracejada
	{
		escreva("----------------------------")
	}
	funcao pula()//pula uma linha
	{
		escreva("\n")
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1865; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */