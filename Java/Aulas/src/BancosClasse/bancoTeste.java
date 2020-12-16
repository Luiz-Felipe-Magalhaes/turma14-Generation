package BancosClasse;

import java.util.Scanner;

public class bancoTeste 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		ContaEmpresa contaTeste = new ContaEmpresa(34,10000);
		
		double valorTransacao, valorEmprestimo;
		char tipoTransacao, opcaoContinuar, aceiteEmprestimo;
		
		do
		{	
			System.out.printf("Qual transa��o deseja realizar [C]Credito ou D[D�bito]: ");
			tipoTransacao = leia.next().toUpperCase().charAt(0);
			System.out.printf("Informe o valor da transa��o: R$");
			valorTransacao = leia.nextDouble();
			
			if (tipoTransacao == 'C')
			{
				contaTeste.FazerCredito(valorTransacao);
			}
			else if (tipoTransacao == 'D')
			{
				contaTeste.FazerDebito(valorTransacao);
			}
			System.out.printf("\nVoc� tem um limite de Emprestimo de: R$%.2f\nDeseja Solicitar S/N: ",contaTeste.getEmprestimoEmpresa());
			aceiteEmprestimo = leia.next().toUpperCase().charAt(0);
			
			if (aceiteEmprestimo == 'S')
			{
				System.out.print("Digite o valor que deseja solicitar: R$");
				valorEmprestimo = leia.nextDouble();
				
				contaTeste.FazerEmprestimo(valorEmprestimo);
			}
			System.out.print("\nDeseja realizar mais transa��es S/N:");
			opcaoContinuar = leia.next().toUpperCase().charAt(0);
		}
		while (opcaoContinuar == 'S');
			
	}

}
