package listaExercicios1;
import java.util.Scanner;

public class exercicio6_calculaExpressao 
{
	public static void main (String args[])
	{
		Scanner leia = new Scanner (System.in);
		
		double x1,y1,x2,y2;
		
		System.out.println("Para P1:");
		System.out.print("Valor de x1 = ");
		x1 = leia.nextDouble();
		System.out.print("Valor de y1 = ");
		y1 = leia.nextDouble();
		System.out.println("Para P2:");
		System.out.print("Valor de x2 = ");
		x2 = leia.nextDouble();
		System.out.print("Valor de y2 = ");
		y2 = leia.nextDouble();
		
		double d = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));	
		System.out.printf("d = %.2f", d);
		
	}

}
