package listaExercicios7;

import java.util.Scanner;

public class testaOperario 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		Operario operarioTeste = new Operario();
		
		operarioTeste.setNome("Luiz Felipe Magalh�es");
		operarioTeste.setSalario(4500);
		
		System.out.printf("Operario: %s  -  Sal�rio Base:R$%.2f\nDigite o valor de Produ��o do oper�rio: R$",operarioTeste.getNome(),operarioTeste.getSalario());
		operarioTeste.setValorProducao(leia.nextDouble());
		
		System.out.printf("Salario Total: R$%.2f",operarioTeste.calcularSalarioComComissao());
		

	}

}
