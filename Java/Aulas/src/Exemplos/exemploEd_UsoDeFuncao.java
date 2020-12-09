package Exemplos;
import java.util.Scanner;
public class exemploEd_UsoDeFuncao
{
	
	public static void main(String[] args) // esse é o programa principal
	
	{
		
		// o programa mesmo roda aqui dentro
		//variaveis
		Scanner teclado = new Scanner(System.in);
		int tamanho;
		
		
		System.out.println("Digite o tamanho da linha:");
		tamanho = teclado.nextInt();
		linhaTamanho(tamanho);
		pula();
		linhaTamanho(tamanho-10);
		pula();
		System.out.println("Digite M masculino ou F feminino");
		char sexo = teclado.next().charAt(0); //no clean code não é legal
		
		System.out.println(minoMina(sexo));
		if (minoMina(sexo) == "Mino")
		{
			System.out.println("EScolheu um menino");
		}
		
		System.out.println("Fim de programa!!!");
		
		
		
		
	}
	
	
	//aqui é uma função/metodo fora do programa principal
	static void pula()
	{
		System.out.println();
		
		
	}
	
	static void linha() {
		System.out.println("____________________________________________________");
	}
	
	static void linhaTamanho(int tamanho) {
		
		for (int x = 1; x <= tamanho; x++) {
			System.out.print("-");
		}
	}
	
	static String minoMina(char sexo)
	{
		String saida;
		if (sexo == 'M') {
			saida = "Mino";
		}
		else {
			saida = "Mina";
		}
		
		return saida;
	}
	
	
}