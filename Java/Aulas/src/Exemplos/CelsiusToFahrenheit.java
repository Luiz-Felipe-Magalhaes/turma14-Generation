package Exemplos;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double temperaturaCelsius, temperaturaFahrenheit;
		char opcao;
		
		//ch = input.next().charAt(0);
		
		System.out.println("Escolha uma opção para converter\nCelsius para Fahrenheit[F] ou Fahrenheit para Celsius[C]");
		opcao = leia.next().toUpperCase().charAt(0);
				
		if (opcao == 'C')
		{
			System.out.print("Digite a temperatura em Celsius: ");
			temperaturaCelsius = leia.nextDouble();
			
			temperaturaFahrenheit = Math.ceil(temperaturaCelsius*1.8+32);
			System.out.print(temperaturaCelsius+"°C em Fahrenheit é: "+temperaturaFahrenheit+"°F");
		}
		else if (opcao == 'F')
		{
			System.out.print("Digite a temperatura em Fahrenheit: ");
			temperaturaFahrenheit = leia.nextDouble();
			
			temperaturaCelsius = Math.ceil((temperaturaFahrenheit-32)/1.8);
			System.out.print(temperaturaFahrenheit+"°F em Celsius é:  "+temperaturaCelsius+"°C");
		}		
	}
}
