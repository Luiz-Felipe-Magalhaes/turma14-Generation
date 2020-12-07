package listaExercicios1;
import java.util.Scanner;

public class exercicio8_calculaPrecoCarroConsumidor 
{
	public static void main (String main[])
	{
		Scanner leia = new Scanner (System.in);
		
		double custoFabrica, custoConsumidor;
		
		System.out.print("Digite o custo de fábrica do carro: R$");
		custoFabrica = leia.nextDouble();
		
		custoConsumidor = custoFabrica+(custoFabrica*0.28)+(custoFabrica*0.45);
		System.out.printf("O custo do carro ao consumidor é: R$ %.2f", custoConsumidor);
	}
}
