package listaExercicios4;

import java.util.Scanner;

public class exercicio1_vetorMaiorPontuacao 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		double valores[]=new double[5];
		double maiorValor=0;
		
		for (int  i=0; i<5; i++)
		{
			System.out.printf("Digite a pontua��o da atividade %d:  ",i+1);
			valores[i] = leia.nextDouble();		
			
			if (valores[i] > maiorValor)
			{
				maiorValor = valores[i];
			}
		}
		System.out.printf("\nPontua��es: ");
		for (int  i=0; i<5; i++)
		{
			System.out.printf(valores[i]+"  |  ");
		}
			
		System.out.printf("\n\nA maior pontua��o foi: %.2f",maiorValor);
	}
}	
