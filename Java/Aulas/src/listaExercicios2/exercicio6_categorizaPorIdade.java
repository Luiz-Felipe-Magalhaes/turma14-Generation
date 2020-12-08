package listaExercicios2;

import java.util.Scanner;

public class exercicio6_categorizaPorIdade {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idadeNadador;

		System.out.print("Digite a idade do nadador: ");
		idadeNadador = leia.nextInt();

		if (idadeNadador >= 18) {
			System.out.println("Categoria: Adultos");
		} else if (idadeNadador >= 14) {
			System.out.println("Categoria: Juvenil B");
		} else if (idadeNadador >= 12) {
			System.out.println("Categoria: Juvenil A");
		} else if (idadeNadador >= 8) {
			System.out.println("Categoria: Infantil B");
		} else if (idadeNadador >= 5) {
			System.out.println("Categoria: Infantil A");
		} else {
			System.out.println("O nadador não se encaixa em nenhuma categoria, portante não poderá entrar.");
		}

	}

}
