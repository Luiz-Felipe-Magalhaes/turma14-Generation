package listaExercicios2;

import java.util.Scanner;

public class exercicio5_indicaIndicePoluicao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double indicePoluicao;

		System.out.print("Digite o �ndice de polui��o atual: ");
		indicePoluicao = leia.nextDouble();

		if (indicePoluicao >= 0.5) {
			System.out.printf("O �ndice de polui��o � de " + indicePoluicao
					+ ". Todas as ind�strias do 1�, 2� e 3� grupo devem suspender suas atividades.\n");
		} else if (indicePoluicao >= 0.4) {
			System.out.printf("O �ndice de polui��o � de " + indicePoluicao
					+ ". Todas as ind�strias do 1� e 2� grupo devem suspender suas atividades.\n");
		} else if (indicePoluicao >= 0.3) {
			System.out.printf("O �ndice de polui��o � de " + indicePoluicao
					+ ". Todas as ind�strias do 1� grupo devem suspender suas atividades.\n");
		} else if (indicePoluicao <= 0.25) {
			System.out.printf("O �ndice de polui��o est� dentro dos limites aceitos.\n");
		}

	}

}
