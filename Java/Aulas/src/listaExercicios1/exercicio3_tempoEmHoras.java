package listaExercicios1;
import java.util.Scanner;

public class exercicio3_tempoEmHoras {
	
	public static void main (String args[])
	{
		Scanner leia = new Scanner (System.in);
		
		int tempoTotal, tempoHoras, tempoMinutos, tempoSegundos;
		
		System.out.print("Digite quantos segundos foram necessarios para fabricar essa peça:  ");
		tempoTotal = leia.nextInt();
		
		tempoHoras =  tempoTotal/3600;
		tempoMinutos = (tempoTotal%3600)/60;
		tempoSegundos = (tempoTotal%3600)%60;
		
		System.out.println("A peça foi fabricada em: "+tempoHoras+"h "+tempoMinutos+"min "+tempoSegundos+"s");

	}

}
