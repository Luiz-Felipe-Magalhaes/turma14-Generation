package listaExercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio1_calculaExcessoMulta 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		double pesoTomates, pesoExcedente, multa;
			
		System.out.print("Digite o peso em Kg: ");
		pesoTomates = leia.nextDouble();
		
		pesoExcedente = pesoTomates - 50;
		multa = pesoExcedente*4;
				
		if (pesoTomates<=50)
		{
			System.out.println("O peso está dentro do limite. Não há multa a ser paga.");
		}
		else
		{
			System.out.printf("O peso limite foi excedido em %.2fKg. A multa a ser paga é de R$%.2f.",pesoExcedente,multa);
		}	

	}

}
