package listaExercicios7;

import java.util.Scanner;

public class testaVendedor 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		Vendedor vendedorTeste = new Vendedor("Luiz Felipe Magalhães");
		vendedorTeste.setSalario(4500);
		
		System.out.printf("Vendedor: %s\nDigite o valor de vendas do vendedor: R$",vendedorTeste.getNome());
		vendedorTeste.setValorVendas(leia.nextDouble());;
			
		vendedorTeste.calcularSalarioComComissao();		
	}

}
