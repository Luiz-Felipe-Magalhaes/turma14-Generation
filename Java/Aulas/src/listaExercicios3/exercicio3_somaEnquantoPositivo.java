package listaExercicios3;

import java.util.Scanner;

public class exercicio3_somaEnquantoPositivo 
{
	public static void main (String[] args)
	{
		Scanner leia = new Scanner (System.in);
		int numero=0, soma=0, contaNumeros =0, media=0;
		
		
		while (numero >= 0)
		{
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
			if (numero > 0)
			{
			soma+=numero;
			contaNumeros++;
			media = soma/contaNumeros;
			}
		}
		System.out.printf("Foram digitados %d n�meros positivos\n",contaNumeros);
		System.out.printf("A soma desses valores � = %d\n",soma);
		System.out.printf("A m�dia desses valores � = %d\n",media);
		
	}
}
