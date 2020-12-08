package listaExercicios2;

import java.util.Scanner;

public class exercicio5_indicaIndicePoluicao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double indicePoluicao;

		System.out.print("Digite o índice de poluição atual: ");
		indicePoluicao = leia.nextDouble();

		if (indicePoluicao >= 0.5) {
			System.out.printf("O índice de poluição é de " + indicePoluicao
					+ ". Todas as indústrias do 1º, 2º e 3º grupo devem suspender suas atividades.\n");
		} else if (indicePoluicao >= 0.4) {
			System.out.printf("O índice de poluição é de " + indicePoluicao
					+ ". Todas as indústrias do 1º e 2º grupo devem suspender suas atividades.\n");
		} else if (indicePoluicao >= 0.3) {
			System.out.printf("O índice de poluição é de " + indicePoluicao
					+ ". Todas as indústrias do 1º grupo devem suspender suas atividades.\n");
		} else if (indicePoluicao <= 0.25) {
			System.out.printf("O índice de poluição está dentro dos limites aceitos.\n");
		}

	}

}
