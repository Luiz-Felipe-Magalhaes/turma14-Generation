package BancosClasse;

import java.util.Scanner;

public class ContaCorrente extends Conta {
	private int qtdTalao;
	private int talao = 3;
	private int totalTalao;

	public ContaCorrente(int numeroConta, String cpf) {
		super(numeroConta, cpf);
	}

	public ContaCorrente(int numeroConta, String nome, String cpf) {
		super(numeroConta, nome, cpf);
		super.tipoConta = 2;
	}

	public int getQtdTalao() {
		return qtdTalao;
	}

	public void setQtdTalao(int qtdTalao) {
		this.qtdTalao = qtdTalao;
	}

	public int getTalao() {
		return talao;
	}

	public int getTotalTalao() {
		return totalTalao;
	}

	public int talao(int qtdTalao) {
		char opcao;
		int comparaTalao;

		Scanner leia = new Scanner(System.in);
		System.out.print("\nVocê deseja imprimir talão S/N: ");
		opcao = leia.next().toUpperCase().charAt(0);
		// while (opcao != 'S' && opcao != 'N') {
		// System.out.println("\nOpção inválida. Deseja continuar? S/N");
		// opcao = leia.next().toUpperCase().charAt(0);
		// }
		if (opcao == 'S') {
			if (qtdTalao == talao) {
				System.out.println("Você atingiu o limite de talões do dia!");
			} else {
				System.out.println("Digite a quantidade que deseja: (Até 3 talões por dia)");
				comparaTalao = leia.nextInt();
				while (comparaTalao < 0 || comparaTalao > talao - qtdTalao) {
					System.out.printf("\nQuantidade inválida. Você pode resgatar até %d talões\nDigite a quantidade:",
							talao - qtdTalao);
					comparaTalao = leia.nextInt();
				}

				totalTalao = totalTalao + comparaTalao;
				qtdTalao += comparaTalao;

				System.out.printf("Quantidade solicitada impressa: %d\n", comparaTalao);
				System.out.printf("Quantidade total impressa: %d\n", totalTalao);
				// System.out.println("Deseja continuar? \n[S]-Sim \n[N]-Não");
				// opcao = leia.next().toUpperCase().charAt(0);
			}

		}
		return qtdTalao;

	}
}