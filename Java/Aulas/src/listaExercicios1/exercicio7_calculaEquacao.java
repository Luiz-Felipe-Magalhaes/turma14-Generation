package listaExercicios1;
import java.util.Scanner;

public class exercicio7_calculaEquacao 
{
	public static void main (String args[])
	{
		
		Scanner leia = new Scanner (System.in);
		
		double a,b,c,d,e,f,x,y;
		
				
		System.out.print("O valor de a: ");
		a = leia.nextDouble();
		System.out.print("O valor de b: ");
		b = leia.nextDouble();
		System.out.print("O valor de c: ");
		c = leia.nextDouble();
		System.out.print("O valor de d: ");
		d = leia.nextDouble();
		System.out.print("O valor de e: ");
		e = leia.nextDouble();
		System.out.print("O valor de f: ");
		f = leia.nextDouble();
		
		x = Math.ceil(((c*e)-(b*f))/((a*e)-(b*d)));
		y = Math.ceil(((a*f)-(c*d))/((a*e)-(b*d)));
		
		System.out.print("x = "+x+" y = "+y);
	
	}

}
