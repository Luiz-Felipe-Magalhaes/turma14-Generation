package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int tamanhoLinha = 80;
		String nome;
		char genero, opcaoMenuInicial, opcaoMenu2;

		linha(tamanhoLinha);
		System.out.println("\n\t\t\t\tMcFly Vinis");
		linha(tamanhoLinha);

		System.out.println("\n[1] - COMPRAR PRODUTOS\r\n[2] - GERENCIAR ESTOQUE\r\n[3] - SAIR\r\n");
		System.out.print("Digite a opção desejada: ");
		opcaoMenuInicial = leia.next().charAt(0);

		if (opcaoMenuInicial == '1') {
			System.out.print("\nDigite seu nome: ");
			nome = leia.next().toUpperCase();

			System.out.print("Qual seu Gênero - Digite [F] para Feminino ou [M] para Masculino: ");
			genero = leia.next().toUpperCase().charAt(0);
			if (voltaGenero(genero) == "Masculino") {
				System.out.printf("\nSeja bem-vindo Sr. %s.\n", nome);
			} else if (voltaGenero(genero) == "Feminino") {
				System.out.printf("\nSeja bem-vinda Sra. %s.", nome);
			} else if (voltaGenero(genero) == "*") {
				System.out.printf("\nSeja bem-vindo Srx. %s.", nome);
			}

		} else if (opcaoMenuInicial == '2') {
			System.out.println("WIP");
		} else if (opcaoMenuInicial == '3') {
			System.out.println("Obrigado pela visita. Volte Sempre!");
		}
	}

	static void linha(int tamanhoLinha) {

		for (int x = 1; x <= tamanhoLinha; x++) {
			System.out.print("—");
		}
	}

	public static String voltaGenero(char genero) {
		String tipo;

		if (genero == 'M') {
			tipo = "Masculino";
		} else if (genero == 'F') {
			tipo = "Feminino";
		} else {
			tipo = "*";
		}
		return tipo;
	}
}
