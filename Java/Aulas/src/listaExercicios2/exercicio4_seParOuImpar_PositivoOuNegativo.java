package listaExercicios2;

import java.util.Scanner;

public class exercicio4_seParOuImpar_PositivoOuNegativo {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numeroDeclarado;

		System.out.print("Digite um n�mero inteiro: ");
		numeroDeclarado = leia.nextInt();

		if (numeroDeclarado == 0) {
			System.out.printf("0 � um n�mero neutro, escolha outra n�mero.\n");
		} else if (numeroDeclarado > 0) {
			if (numeroDeclarado % 2 == 0) {
				System.out.printf("O n�mero � positivo e par.\n");
			} else {
				System.out.printf("O n�mero � positivo e impar.\n");
			}
		} else if (numeroDeclarado < 0) {
			if (numeroDeclarado % 2 == 0) {
				System.out.printf("O n�mero � negativo e par.\n");
			} else {
				System.out.printf("O n�mero � negativo e impar.\n");
			}
		}

	}
}
