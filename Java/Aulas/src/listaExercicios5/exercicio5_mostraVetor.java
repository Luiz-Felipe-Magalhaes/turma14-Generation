package listaExercicios5;

import java.util.Scanner;

public class exercicio5_mostraVetor 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		double numeros[] = new double [5];
		char opcao;
		
		for (int i=0; i<5; i++)
		{
			System.out.print("Digite um número: ");
			numeros[i] = leia.nextDouble();
		}
		
		System.out.print("[0]Finalizar\n[1]Mostrar na ordem direta\n[2]Mostrar na ordem inversa\nEscolha uma opção: ");
		opcao = leia.next().toUpperCase().charAt(0);
		
		if (opcao!='0' && opcao!='1' && opcao!='2')
		{
			System.out.println("Opção Inválida");
		}
		else if (opcao == '0')
		{
			System.out.println("Programa Finalizado");
		}
		else if (opcao == '1')
		{
			for (int i=0; i<5; i++)
			{
				System.out.printf("| %.2f |",numeros[i]);
			}
		}
		else if (opcao == '2')
		{
			for (int i=4; i>=0; i--)
			{
				System.out.printf("| %.2f |",numeros[i]);
			}
		}
	}
}
