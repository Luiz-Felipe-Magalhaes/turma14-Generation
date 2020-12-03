programa
{

	funcao inicio()
	{
		caracter resultado
		inteiro pontosCorinthians = 0, pontosPalmeiras = 0, pontosSantos = 0, pontosSaopaulo = 0

		escreva ("Escolha uma letra para o resultado do time [V]Vitoria  | [D]Derrota| [E]Empate ")
				
			para (inteiro rodada = 1;rodada <=4 ; rodada++)
			{
				escreva ("\nDigite o resultado do Corinthians na rodada "+rodada+": ")
				leia (resultado)

				se (resultado=='V' ou resultado == 'v')
				{
					pontosCorinthians = pontosCorinthians+3
				}
				senao se (resultado == 'E' ou resultado == 'e')
				{
					pontosCorinthians = pontosCorinthians+1
				}
				senao se (resultado == 'D' ou resultado == 'd')
				{
					pontosCorinthians = pontosCorinthians+0
				}
		
				escreva ("\nDigite o resultado do Palmeiras na rodada "+rodada+": ")
				leia (resultado)
		
				se (resultado=='V' ou resultado == 'v')
				{
					pontosPalmeiras = pontosPalmeiras+3
				}
				senao se (resultado == 'E' ou resultado == 'e')
				{
					pontosPalmeiras = pontosPalmeiras+1
				}
				senao se (resultado == 'D' ou resultado == 'd')
				{
					pontosPalmeiras = pontosPalmeiras+0
				}
		
				escreva ("\nDigite o resultado do Santos na rodada "+rodada+": ")
				leia (resultado)
		
				se (resultado=='V' ou resultado == 'v')
				{
					pontosSantos = pontosSantos+3
				}
				senao se (resultado == 'E' ou resultado == 'e')
				{
					pontosSantos = pontosSantos+1
				}
				senao se (resultado == 'D' ou resultado == 'd')
				{
					pontosSantos = pontosSantos+0
				}
		
				escreva ("\nDigite o resultado do São Paulo na rodada "+rodada+": ")
				leia (resultado)
		
				se (resultado=='V' ou resultado == 'v')
				{
					pontosSaopaulo = pontosSaopaulo+3
				}
				senao se (resultado == 'E' ou resultado == 'e')
				{
					pontosSaopaulo = pontosSaopaulo+1
				}
				senao se (resultado == 'D' ou resultado == 'd')
				{
					pontosSaopaulo = pontosSaopaulo+0
				}
								
			}

			escreva ("Pontos Corinthians nas 4 rodadas: ",pontosCorinthians,"\n")
			escreva ("Pontos Palmeiras nas 4 rodadas: ",pontosPalmeiras,"\n")
			escreva ("Pontos Santos nas 4 rodadas: ",pontosSantos,"\n")
			escreva ("Pontos São Paulo nas 4 rodadas: ",pontosSaopaulo,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1511; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */