package listaExercicios4;

import java.util.Random;

public class exercicio2_vetorLancamentoDado 
{

	public static void main(String[] args) 
	{
		Random sorteio = new Random();
		
		int valorLancamento[] = new int [10];
		int maiorLancamento=0, contaMaiorLancamento=0, numeroLancamentos=10;
		double somaLancamentos=0, media=0;
		
		System.out.println("LAN�AMENTOS: ");
		for (int i=0; i < numeroLancamentos; i++)
		{
			valorLancamento[i] =  sorteio.nextInt(6)+1;
			System.out.printf("|  %d  |  ",valorLancamento[i]);
			
			somaLancamentos+=valorLancamento[i];
			media = (somaLancamentos/numeroLancamentos);
			
			if (valorLancamento[i] > maiorLancamento)
			{
				maiorLancamento=valorLancamento[i];					
			}
		}	
		for (int i=0; i < numeroLancamentos; i++)
		{
		if (maiorLancamento == valorLancamento[i])
			{
				contaMaiorLancamento++;
			}
			
		}
		System.out.println("\n\nA soma dos lan�amentos �: "+somaLancamentos);	
		System.out.println("A m�dia dos valores lan�ados �: "+media);
		System.out.printf("O maior valor lan�ado foi %d, e ele foi sorteado %d vezes.",maiorLancamento, contaMaiorLancamento);
	}
}