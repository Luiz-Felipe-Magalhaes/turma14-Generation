package listaExercicios2;

import java.util.Scanner;

public class exercicio3_potenciaNumeroLido {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Double primeiroNumero, segundoNumero, terceiroNumero, quartoNumero, primeiroQuadrado, segundoQuadrado,
				terceiroQuadrado, quartoQuadrado;

		System.out.print("Digite um valor para o primeiro numero: ");
		primeiroNumero = leia.nextDouble();
		System.out.print("Digite um valor para o segundo numero: ");
		segundoNumero = leia.nextDouble();
		System.out.print("Digite um valor para o terceiro numero: ");
		terceiroNumero = leia.nextDouble();
		System.out.print("Digite um valor para o quarto numero: ");
		quartoNumero = leia.nextDouble();

		primeiroQuadrado = Math.pow(primeiroNumero, 2);
		segundoQuadrado = Math.pow(segundoNumero, 2);
		terceiroQuadrado = Math.pow(terceiroNumero, 2);
		quartoQuadrado = Math.pow(quartoNumero, 2);

		if (terceiroQuadrado >= 1000) {
			System.out.print(terceiroNumero + "² = " + terceiroQuadrado);
		} else {
			System.out.printf("O resultado dos numeros digitados ao quadrado é:\n" + primeiroNumero + "² = "
					+ primeiroQuadrado + "\n" + segundoNumero + "² = " + segundoQuadrado + "\n" + terceiroNumero
					+ "² = " + terceiroQuadrado + "\n" + quartoNumero + "² = " + quartoQuadrado + "\n");
		}

	}

}
