package listaExercicios7;

import java.util.Scanner;

public class testaOperario 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		Operario operarioTeste = new Operario();
		
		operarioTeste.setNome("Luiz Felipe Magalhães");
		operarioTeste.setSalario(4500);
		
		System.out.printf("Operario: %s  -  Salário Base:R$%.2f\nDigite o valor de Produção do operário: R$",operarioTeste.getNome(),operarioTeste.getSalario());
		operarioTeste.setValorProducao(leia.nextDouble());
		
		System.out.printf("Salario Total: R$%.2f",operarioTeste.calcularSalarioComComissao());
		

	}

}
