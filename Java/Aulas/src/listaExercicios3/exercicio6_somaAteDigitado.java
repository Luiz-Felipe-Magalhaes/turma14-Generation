package listaExercicios3;

import java.util.Scanner;

public class exercicio6_somaAteDigitado 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int numero, acumulador=0, soma=0;
		
		System.out.print("Digite um numero: ");
		numero = leia.nextInt();
		
		do 
		{
			acumulador++;
			soma+=acumulador;
			if (acumulador < numero)
			{
				System.out.printf("%d + ", acumulador);	
			}
			else 
			{
				System.out.printf("%d ", acumulador);	
			}
		}
		while (acumulador < numero);
		System.out.printf("\nSoma = %d", soma);	
		
				
/*Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os n�meros  de 1 at� ele. 
 * Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
 * 
 */
		
		
	}

}
