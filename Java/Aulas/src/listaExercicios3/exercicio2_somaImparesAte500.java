package listaExercicios3;

public class exercicio2_somaImparesAte500 
{
	public static void main(String[] args) 
	{

		int soma = 0;

		for (int numero = 1; numero <= 500; numero++) 
		{
			if (numero % 3 == 0 && numero % 2 != 0) 
			{
				soma += numero;
			}
		}
		System.out.printf("A soma dos numaros ímpares e multiplos de 3 no intervalo de 1 a 500 é = %d", soma);

	}
}
