package listaExercicios1;
import java.util.Scanner;

public class exercicio2_idadeEmAnos 
{
	public static void main (String args[])
	{
		int idadeDias, idadeMeses, idadeAnos, idadeTotal;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Escreva sua idade em dias:");
		idadeTotal = leia.nextInt();
		
		idadeAnos = (idadeTotal/365);
		idadeMeses = (idadeTotal%365)/30;
		idadeDias = (idadeTotal%365)%30;
						
		System.out.println("Sua idade é: "+idadeAnos+" anos "+idadeMeses+" meses e "+idadeDias+" dias");		
	}
}
