package listaExercicios2;

import java.util.Scanner;

public class exercicio2_calculaSalario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String codigoOperario;
		int horasTrabalhadas;
		double salarioPadrao, salarioExcedente, salarioTotal;

		System.out.print("Digite o código do colaborador: ");
		codigoOperario = leia.next();
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horasTrabalhadas = leia.nextInt();

		if (horasTrabalhadas <= 50) {
			salarioTotal = 10 * horasTrabalhadas;
			System.out.printf("Funcionario cod.%s:\nSalario Base: R$500,00\nHoras Trabalhadas no mês:%dh\nSalario Total:R$%2f",
					codigoOperario, horasTrabalhadas, salarioTotal);
		} else {
			salarioExcedente = (horasTrabalhadas - 50) * 20;
			salarioTotal = salarioExcedente + (50 * 10);
			System.out.printf("Funcionario cod.%s:\nSalario Base: R$500,00\nHoras Trabalhadas no mês: %dh\nSalario Total: R$%.2f",
					codigoOperario, horasTrabalhadas, salarioTotal);
		}

	}

}
