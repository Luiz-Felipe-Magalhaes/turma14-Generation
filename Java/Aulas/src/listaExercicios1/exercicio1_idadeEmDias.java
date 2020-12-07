package listaExercicios1;
import java.util.Scanner;

public class exercicio1_idadeEmDias 
{
	public static void main (String args[])
	{
		int idadeAnos, idadeMeses, idadeDias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Sua idade em anos, meses e dia\nAnos:");
		idadeAnos = leia.nextInt();
		System.out.println("Meses:");
		idadeMeses = leia.nextInt();
		System.out.println("Dias:");
		idadeDias = leia.nextInt();
		
		System.out.println("Sua idade em dias é: "+((idadeAnos*365)+(idadeMeses*30)+(idadeDias))+" dias");
		
		
	}

}
