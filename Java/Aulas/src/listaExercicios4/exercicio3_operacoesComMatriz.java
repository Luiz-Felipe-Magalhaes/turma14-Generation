package listaExercicios4;

import java.util.Random;

public class exercicio3_operacoesComMatriz 
{

	public static void main(String[] args) 
	{
		Random sorteiaValores = new Random();
		
		int matrizN1 [][]= new int [4][6];
		int matrizN2 [][]= new int [4][6];
		int matrizM1 [][]= new int [4][6];
		int matrizM2 [][]= new int [4][6];
		
		//MatrizN1:
		System.out.println("MATRIZ N1: ");
		for (int linhaN1=0; linhaN1<4; linhaN1++)
		{
			for (int colunaN1=0; colunaN1<6; colunaN1++)
			{
				matrizN1[linhaN1][colunaN1] = sorteiaValores.nextInt(10);
				System.out.printf("%d\t",matrizN1[linhaN1][colunaN1]);
			}
			System.out.println();
		}
		
		System.out.println("\nMATRIZ N2:");
		for (int linhaN2=0; linhaN2<4; linhaN2++)
		{
			for (int colunaN2=0; colunaN2<6; colunaN2++)
			{
				matrizN2[linhaN2][colunaN2] = sorteiaValores.nextInt(10);
				System.out.printf("%d\t",matrizN2[linhaN2][colunaN2]);
			}
			System.out.println();
		}
		
		System.out.println("\nMATRIZ M1 = N1 + N2");
		for (int linhaM1=0; linhaM1<4; linhaM1++)
		{
			for (int colunaM1=0; colunaM1<6; colunaM1++)
			{
				matrizM1[linhaM1][colunaM1]=matrizN1[linhaM1][colunaM1]+matrizN2[linhaM1][colunaM1];
				System.out.printf("%d\t",matrizM1[linhaM1][colunaM1]);
			}
			System.out.println();
		}
		System.out.println("\nMATRIZ M2 = N1 - N2");
		for (int linhaM2=0; linhaM2<4; linhaM2++)
		{
			for (int colunaM2=0; colunaM2<6; colunaM2++)
			{
				matrizM2[linhaM2][colunaM2]=matrizN1[linhaM2][colunaM2]-matrizN2[linhaM2][colunaM2];
				System.out.printf("%d\t",matrizM2[linhaM2][colunaM2]);
			}
			System.out.println();
		}
		
	}

}
