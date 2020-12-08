package listaExercicios2;

import java.util.Scanner;

public class exercicio4_seParOuImpar_PositivoOuNegativo {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numeroDeclarado;

		System.out.print("Digite um número inteiro: ");
		numeroDeclarado = leia.nextInt();

		if (numeroDeclarado == 0) {
			System.out.printf("0 é um número neutro, escolha outra número.\n");
		} else if (numeroDeclarado > 0) {
			if (numeroDeclarado % 2 == 0) {
				System.out.printf("O número é positivo e par.\n");
			} else {
				System.out.printf("O número é positivo e impar.\n");
			}
		} else if (numeroDeclarado < 0) {
			if (numeroDeclarado % 2 == 0) {
				System.out.printf("O número é negativo e par.\n");
			} else {
				System.out.printf("O número é negativo e impar.\n");
			}
		}

	}
}
