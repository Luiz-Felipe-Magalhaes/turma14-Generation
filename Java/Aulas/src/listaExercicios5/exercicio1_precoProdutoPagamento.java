package listaExercicios5;

import java.util.Scanner;

public class exercicio1_precoProdutoPagamento 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		double precoProduto, precoFinal, valorParcelas;
		char opcaoPagamento;
		
		System.out.printf("Digite o pre�o do produto: R$");
		precoProduto = leia.nextDouble();
		
		System.out.print("\nCondi��es de pagamento:\n[1] - A Vista (Dinheiro ou cheque) - 20% Desconto\n[2] - A Vista (Cart�o de cr�dito) - 15% Desconto\n[3] - 2x (Sem Juros)"
				+ "\n[4] - 3x (Juros 10%)\n\nEscolha a condi��o desejada: ");
		opcaoPagamento = leia.next().toUpperCase().charAt(0);
		
		if (opcaoPagamento == '1')
		{
			precoFinal = precoProduto*0.80;
			System.out.printf("\nPagamento A Vista (Dinheiro ou cheque) - 20%% Desconto\nValor total: R$%.2f",precoFinal);
		}
		else if (opcaoPagamento == '2')
		{
			precoFinal = precoProduto*0.85;
			System.out.printf("\nPagamento A Vista (Cart�o de cr�dito) - 15%% Desconto\nValor total: R$%.2f",precoFinal);
		}
		else if (opcaoPagamento == '3')
		{
			valorParcelas = precoProduto/2;
			precoFinal = valorParcelas*2;
			System.out.printf("\nPagamento em 2x (Sem Juros)\nValor das Parcelas: R$%.2f\nValor total: R$%.2f",valorParcelas,precoFinal);
		}
		else if (opcaoPagamento == '4')
		{
			valorParcelas = (precoProduto*1.1)/3;
			precoFinal = valorParcelas*3;
			System.out.printf("\nPagamento em 3x (10%% Juros)\nValor das Parcelas: R$%.2f\nValor total: R$%.2f",valorParcelas,precoFinal);
		}
	}
	
	
	
	/*Elabore um programa que calcule o que deve ser pago por um produto, considerando o pre�o normal de etiqueta e a escolha da condi��o de pagamento. 
	 * Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento escolhida e efetuar o c�lculo adequado. 
	 *C�digo Condi��o de pagamento 
	 *1 � vista em dinheiro ou cheque, recebe 20% de desconto 
	 *2 � vista no cart�o de cr�dito, recebe 15% de desconto 
	 *3 Em duas vezes, pre�o normal de etiqueta sem juros 
	 *4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%
	 * 
	 */
}
