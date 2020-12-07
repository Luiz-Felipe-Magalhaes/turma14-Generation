package listaExercicios1;
import java.util.Scanner;

public class exercicio4_calculaExpressao 
{
	public static void main (String args[])
	{
		Scanner leia = new Scanner(System.in);
		
		double variavelA, variavelB, variavelC, resultadoAB, resultadoBC, resultadoFinal;
	
		
		System.out.println("Digite o valor de A: ");
		variavelA = leia.nextDouble();
		System.out.println("Digite o valor de B: ");
		variavelB = leia.nextDouble();
		System.out.println("Digite o valor de C: ");
		variavelC = leia.nextDouble();
		
		resultadoAB = Math.pow(variavelA+variavelB, 2);
		resultadoBC = Math.pow(variavelB+variavelC, 2);
		resultadoFinal = (resultadoAB+resultadoBC)/2;
		
		System.out.printf("D = %.2f", resultadoFinal);
		
	}
}
