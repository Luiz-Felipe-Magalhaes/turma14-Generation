package listaExercicios4;

import java.util.*;

public class exercicio4_somaDiagonalPrincipalMatriz 
{

	public static void main(String[] args) 
	{
		Random sorteiaValores = new Random();
		Scanner leia = new Scanner(System.in);
		
		int matriz[][] = new int [3][3];
		int soma=0, somaDiagonal=0;
		
		
		System.out.println("Digite os valores da Matriz: ");
		for (int linha=0; linha<3; linha++)
		{
			for (int coluna=0; coluna<3; coluna++)
			{
				System.out.printf("Posição - %d %d: ", coluna,linha);
				matriz[linha][coluna] = leia.nextInt();
				
				soma+=matriz[linha][coluna];
				
				if (linha==coluna)
				{
					somaDiagonal+=matriz[linha][coluna];
				}
			}
			System.out.println();
		}
		System.out.printf("Soma dos valores da matriz = %d", soma);		
		System.out.printf("\nSoma da diagonal principal = %d", somaDiagonal);
	}

}
