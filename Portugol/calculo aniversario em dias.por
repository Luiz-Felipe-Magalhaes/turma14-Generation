programa
{
	//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
	
	funcao inicio()
	{
		inteiro diaNascimento,mesNascimento,anoNascimento
		
		escreva ("Olá, qual o dia do seu nascimento? [d] ")
		leia (diaNascimento)

		escreva ("Agora o mês? [mm] ")
		leia (mesNascimento)

		escreva ("Por último, em que ano você nasceu? [aaaa] ")
		leia (anoNascimento)

		escreva ("Ótimo, você ilumina a terra desde " +diaNascimento+"/"+mesNascimento+"/"+anoNascimento+".\n\n")

		inteiro diaAtual, mesAtual, anoAtual
		
		escreva ("Agora, me diga em que dia estamos? [d] ")
		leia (diaAtual)

		escreva ("Qual o mês atual? [mm] ")
		leia (mesAtual)

		escreva ("Por último, estamos no ano dê: [aaaa] ")
		leia (anoAtual)

		inteiro idadeDias = (((anoNascimento-anoAtual)*365)+((mesNascimento-mesAtual)*30)+(diaNascimento-diaAtual))
		se (idadeDias <= 0) {
			idadeDias = idadeDias*-1
		}
		escreva("Hoje é seu 'diaversario' de numero: "+idadeDias+". Parabéns por mais um dia de vida!\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 775; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */