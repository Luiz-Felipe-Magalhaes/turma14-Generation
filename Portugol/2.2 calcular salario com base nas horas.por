programa
{
	
	funcao inicio()
	{
		cadeia codigoFuncionario
		escreva ("Digite o código do funcionário: ")
		leia (codigoFuncionario)

		real horasTrabalhadas, horasExcedentes, salarioBase,salarioExcedente,salarioTotal
		escreva ("Digite a quantidade de horas trabalhadas: ")
		leia (horasTrabalhadas)
		
		se = (horasTrabalhadas <=50)
		{
			salarioBase = horasTrabalhadas*10
			escreva ("Funcionário cod.",codigoFuncionario,":\nSálario Base R$500.00\nSálario Excedente R$0.0\nSálario Total R$",salarioBase,"\n")
		}
		senao se = (horasTrabalhadas >50)
		{
			horasExcedentes = horasTrabalhadas - 50
			salarioBase = ((horasTrabalhadas-horasExcedentes)*10)
			salarioExcedente = horasExcedentes*20
			salarioTotal = (salarioExcedente + ((horasTrabalhadas-horasExcedentes)*10))
			escreva ("Funcionário cod.",codigoFuncionario,":\nSálario Base R$",salarioBase,"\nSálario Excedente R$",salarioExcedente,
			"\nSálario Total R$",salarioTotal,"\n")
					
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 517; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */