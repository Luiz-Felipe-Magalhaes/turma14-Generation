package listaExercicios7;

import java.util.Scanner;

public class testaFornecedor 
{
	public static void main (String args[])
	{
		Scanner leia = new Scanner(System.in);
		Fornecedor fornecedorTeste = new Fornecedor("Developer Luiz Felipe");
		fornecedorTeste.setTelefone("11 98877-6655");
		
		System.out.printf("Fornecedor: %s  -  Telefone: %s\n",fornecedorTeste.getNome(),fornecedorTeste.getTelefone());
		System.out.print("Digite o crédito do Fornecedor: R$");
		fornecedorTeste.setValorCredito(leia.nextDouble());
		System.out.print("Digite a divida do Fornecedor: R$");
		fornecedorTeste.setValorDivida(leia.nextDouble());
		System.out.printf("\nSaldo Atual: R$%.2f",fornecedorTeste.obterSaldo());
	
	}
}
