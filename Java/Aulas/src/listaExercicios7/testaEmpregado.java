package listaExercicios7;

import java.util.Scanner;

public class testaEmpregado 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		Empregado empregadoTeste = new Empregado("Luiz Felipe Magalh�es", 1014);
		
		System.out.printf("Colaborador: %s  - Setor: %d",empregadoTeste.getNome(),empregadoTeste.getCodigoSetor());
		System.out.print("\nDigite o sal�rio base do funcion�rio: R$");
		empregadoTeste.setSalarioBase(leia.nextDouble());
		System.out.print("Digite a taxa de impostos que recorrem sobre o sal�rio base:");
		empregadoTeste.setImpost(leia.nextDouble());
		System.out.printf("Valor de impostos recolhidos na fonte: R$%.2f",(empregadoTeste.getImpost()*empregadoTeste.getSalarioBase()/100));
		System.out.printf("\nSal�rio liquido do funcion�rio: R$%.2f",empregadoTeste.calcularSalario());

	}

}
