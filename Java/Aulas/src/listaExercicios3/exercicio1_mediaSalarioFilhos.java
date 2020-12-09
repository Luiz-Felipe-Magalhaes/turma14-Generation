package listaExercicios3;

import java.util.Scanner;

public class exercicio1_mediaSalarioFilhos 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		double salario, mediaSalario=0, maiorSalario=0, contaSalarioAteCem=0, percentualSalarioAteCem=0, filhos, 
				mediaFilhos=0;
		int numeroHabitantes=20;
		
		for (int i = 1; i <= numeroHabitantes; i++)
		{
			System.out.printf("Digite o salário do habitante %d: R$",i);
			salario = leia.nextDouble();
			System.out.printf("Digite o número de filhos do habitante %d: ",i);
			filhos = leia.nextInt();
			System.out.println();
			
			mediaSalario+=salario/numeroHabitantes;
			mediaFilhos+=filhos/numeroHabitantes;
			
			if (salario > maiorSalario)
			{
				maiorSalario = salario;
			}
			if (salario <= 100)
			{
				contaSalarioAteCem++;
			}
			percentualSalarioAteCem = contaSalarioAteCem*100/numeroHabitantes;
		}
		
		System.out.printf("Média Salarial: R$%.2f\n",mediaSalario);
		System.out.printf("Média de Filhos: %.2f\n",mediaFilhos);
		System.out.printf("Maior salario: R$%.2f\n",maiorSalario);
		System.out.printf("Habitantes com sálario até R$100: %.2f%%\n",percentualSalarioAteCem);
	}
}
