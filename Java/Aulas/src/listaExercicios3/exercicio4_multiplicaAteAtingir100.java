package listaExercicios3;

import java.util.Scanner;

public class exercicio4_multiplicaAteAtingir100 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		double numero=0, soma=0;
		
		System.out.print("Digite um numero: ");
		numero = leia.nextDouble();
		System.out.printf("%.2f\n",numero);
		
		while (numero <= 100)
		{
			numero=numero*3;
			System.out.printf("%.2f\n",numero);
		}
	}
}
