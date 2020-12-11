package listaExercicios5;

import java.util.Scanner;

public class exercicio2_calculaIMC 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.print("Digite seu peso em Kg: ");
		peso = leia.nextDouble();
		System.out.print("Digite sua altura em metros: ");
		altura = leia.nextDouble();
		
		imc = peso/(altura*2);
		System.out.printf("\nIMC = %.2f",imc);
		
		if (imc < 18.5)
		{
			System.out.println("\nSegundo os critérios da OMS você está Abaixo do Peso ideal.");
		}
		if (imc >= 18.5 && imc <= 25)
		{
			System.out.println("\nSegundo os critérios da OMS você está no Peso Normal.");
		}
		if (imc > 25 && imc <=30)
		{
			System.out.println("\nSegundo os critérios da OMS você está Acima do Peso ideal.");
		}
		if (imc > 30)
		{
			System.out.println ("\nSegundo os critérios da OMS você é considerado Obeso.");
		}
			
	}
	
	
}
