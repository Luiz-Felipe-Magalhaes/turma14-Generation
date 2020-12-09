package listaExercicios3;

public class exercicio5_separaNumerosPorIntervalo 
{

	public static void main(String[] args) 
	{
		int numero=233;
		System.out.printf(" %d",numero);
		
		do 
		{
			numero+=5;
			System.out.printf(" %d",numero);
		}
		while (numero < 298);
		{
			System.out.println();
		}
		do 
		{
			numero+=3;
			System.out.printf(" %d",numero);
		}
		while (numero >= 300 && numero <= 399);
		{
			System.out.println();
		}
		do 
		{
			numero+=5;
			System.out.printf(" %d",numero);
		}
		while (numero >= 400 && numero <= 456);
		{
			System.out.println();
		}		
	}
}
