programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		caracter tipo
				
		escreva ("1 para Circulo | 2 para Triângulo | 3 para Retângulo\nEscolhe o tipo de figura que deseja calcular: ")
		leia (tipo)
		
		se = (tipo=='1') //Calcula a área do Circulo
		{		
			real raioCirculo,areaCirculo
		
			escreva ("Digite o raio do círculo: ")
			leia (raioCirculo)

			areaCirculo = mat.arredondar(((mat.potencia(raioCirculo,2)*mat.PI)),2)) //(D² * π)/4
			escreva ("A área do circulo é = ",areaCirculo)
		}		
		senao se = (tipo=='2') //Calcula a área do Triângulo
		{
			real alturaTriangulo, baseTriangulo, areaTriangulo

			escreva ("Digite a altura de um triângulo: ")
			leia(alturaTriangulo)
			
			escreva ("Digite a base de um triângulo: ")
			leia(baseTriangulo)
			
			areaTriangulo = mat.arredondar(((alturaTriangulo*baseTriangulo)/2),2) //(b * h)/2
			escreva("A área do triângulo é = "+areaTriangulo)		
		}
		senao se = (tipo=='3')	//Calcula a área do Retangulo
		{	
			real baseRetangulo, alturaRetangulo, areaRetangulo
			
			escreva ("Digite a altura de um retângulo: ")
			leia(alturaRetangulo)
			
			escreva ("Digite a base de um retângulo: ")
			leia(baseRetangulo)
			
			areaRetangulo = mat.arredondar((baseRetangulo*alturaRetangulo),2) //(b * h)/2
			escreva("Area do retângulo é = ",areaRetangulo)
		}
		senao
		{
			escreva ("A opção é inválida")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 456; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */