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
			System.out.println("\nSegundo os crit�rios da OMS voc� est� Abaixo do Peso ideal.");
		}
		if (imc >= 18.5 && imc <= 25)
		{
			System.out.println("\nSegundo os crit�rios da OMS voc� est� no Peso Normal.");
		}
		if (imc > 25 && imc <=30)
		{
			System.out.println("\nSegundo os crit�rios da OMS voc� est� Acima do Peso ideal.");
		}
		if (imc > 30)
		{
			System.out.println ("\nSegundo os crit�rios da OMS voc� � considerado Obeso.");
		}
			
	}
	
	
}
