package Exemplos;

import java.util.Scanner;

public class Funcao_anoNascimentoIdade 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento;	
		
		System.out.print("Digite o seu ano de nascimento: ");
		anoNascimento = leia.nextInt();	
		
		System.out.println("A idade é "+calculaIdade(anoNascimento)+" anos.");
		
		if (calculaIdade(anoNascimento) < 18)
		{
			System.out.println("Você é infanto-juvenil.");
		}else if (calculaIdade(anoNascimento) >= 60)
		{
			System.out.println("Você é idoso.");
		}else 
		{
			System.out.println("Você é adulto.");
		}
					
	}

	public static int calculaIdade(int anoNascimento2)
	{
		int idade;
		idade = 2020 - anoNascimento2;
		return idade;		
	}
}
