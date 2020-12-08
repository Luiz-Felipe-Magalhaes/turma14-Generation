package listaExercicios2;

import java.util.Scanner;

public class exercicio8_imprimeMaiorQueCem {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double numero;

		System.out.printf("Digite um número: ");
		numero = leia.nextDouble();

		if (numero > 100) {
			System.out.printf("Numéro = %.2f", numero);
		} else {
			System.out.println("0");
		}

	}

}
