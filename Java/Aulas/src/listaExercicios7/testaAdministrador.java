package listaExercicios7;

import java.util.Scanner;

public class testaAdministrador 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		Administrador administradorTeste = new Administrador("Luiz Felipe Magalhães");
		System.out.print("Digite o salário do Administrador: R$");
		administradorTeste.setSalario(leia.nextDouble());;
		
		administradorTeste.calcularAjudaCusto();
	}
}
