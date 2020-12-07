programa
{
	inclua biblioteca Matematica --> mat
	/*Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta 
	 * e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento 
	 * escolhida e efetuar o cálculo adequado. 
	*Código Condição de pagamento 
	*1 À vista em dinheiro ou cheque, recebe 20% de desconto 
	*2 À vista no cartão de crédito, recebe 15% de desconto 
	*3 Em duas vezes, preço normal de etiqueta sem juros 
	*4 Em três vezes, preço normal de etiqueta mais juros de 10%
	 */
	
	funcao inicio()
	{
		real precoProduto = 0, valorCompra = 0
		caracter condicaoPagamento

		escreva ("Digite o preço do produto: R$")
		leia (precoProduto)
	
		escreva ("\n[1]A Vista (Dinheiro ou cheque) | [2]A Vista (Cartão de crédito) | [3] 2x (Sem Juros) | [4] 3x (Juros 10%)")
		escreva ("\nEscolha uma condição de pagamento: ")
		leia (condicaoPagamento)

		se (condicaoPagamento == '1')
		{
			valorCompra = mat.arredondar(precoProduto*0.8, 2)
			escreva ("\nDesconto de 20%\nValor Total: R$",valorCompra)
		}
		senao se (condicaoPagamento == '2')
		{
			valorCompra = mat.arredondar(precoProduto*0.85, 2)
			escreva ("\nDesconto de 15%\nValor Total: R$",valorCompra)
		}
		senao se (condicaoPagamento == '3')
		{
			valorCompra = mat.arredondar((precoProduto/2),2)
			escreva ("\nPagamento em 2x sem juros.\nValor das parcelas: R$",valorCompra,"\nValor Total: R$",valorCompra*2)
		}
		senao se (condicaoPagamento == '4')
		{
			valorCompra = mat.arredondar((precoProduto*1.1/3),2)
			escreva ("\nPagamento em 3x com 10% de juros.\nValor das parcelas: R$",valorCompra,"\nValor Total: R$",valorCompra*3)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1483; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */