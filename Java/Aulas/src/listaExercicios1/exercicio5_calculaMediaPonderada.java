package listaExercicios1;
import java.util.Scanner;

public class exercicio5_calculaMediaPonderada 
{
	public static void main (String args[])
	{
		Scanner leia = new Scanner (System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextDouble();
		
		media = ((nota1*0.2)+(nota2*0.3)+(nota3*0.5));
		System.out.printf("A média do aluno foi: %.2f", media);
				
	}
}
