package listaExercicios6;

import java.util.Scanner;

public class exercicio4_funcionario 
{

	public static void main(String[] args) 
	{
		int ultimasFerias;
		Scanner leia = new Scanner(System.in);
		Funcionario funcionario1 = new Funcionario("Felipe","Magalhães","GEN-0034","Desenvolvimento");
		
		System.out.printf(funcionario1.getDadosFuncionario());
		
		System.out.print("\n\nA quantos meses o funcionario tirou a ultima férias: ");
		ultimasFerias = leia.nextInt();
		
		funcionario1.getFeriasFuncionario(ultimasFerias);

	}

}
