package listaExercicios7;

import java.util.Scanner;

public class testaAdministrador 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		Administrador administradorTeste = new Administrador("Luiz Felipe Magalh�es");
		System.out.print("Digite o sal�rio do Administrador: R$");
		administradorTeste.setSalario(leia.nextDouble());;
		
		administradorTeste.calcularAjudaCusto();
	}
}
