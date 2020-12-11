package listaExercicios5;

import java.util.Scanner;

public class exercicio3_leNumeroNumIntervalo 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int numeros=0, contadorAte25=0, contadorAte50=0, contadorAte75=0, contadorAte100=0;
		
		while (numeros >=0)
		{
			System.out.print("Digite um número: ");
			numeros = leia.nextInt();
			
			if (numeros >= 0 && numeros <= 25)
			{
				contadorAte25++;
			}
			else if (numeros >= 26 && numeros <= 50)
			{
				contadorAte50++;
			}
			else if (numeros >= 51 && numeros <= 75)
			{
				contadorAte75++;
			}
			else if (numeros >= 76 && numeros <= 100)
			{
				contadorAte100++;
			}
						
		}
		
		System.out.printf("\nNumeros entre 0 e 25 digitados: %d",contadorAte25);
		System.out.printf("\nNumeros entre 26 e 50 digitados: %d",contadorAte50);
		System.out.printf("\nNumeros entre 51 e 75 digitados: %d",contadorAte75);
		System.out.printf("\nNumeros entre 76 e 100 digitados: %d",contadorAte100);
		
	}
	

}
