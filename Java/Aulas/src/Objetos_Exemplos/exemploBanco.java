package Objetos_Exemplos;

import java.util.Scanner;

public class exemploBanco 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		System.out.println("BANCO TESTE PARA USO");
		int conta;
		
		System.out.println("Digite o numero da conta: ");
		conta = leia.nextInt();
		
		Conta processo1 = new Conta(conta);
		
		System.out.println("Digite o numero da conta de novo: ");
		conta = leia.nextInt();
		
		ContaEspecial processo2 = new ContaEspecial();
		
		processo2.numeroConta = conta;
		
		System.out.printf("a conta 1 é %d, e a conta 2 é %d\n", processo1.numeroConta, processo2.numeroConta);
		
		conta = 0;
		
		System.out.println(processo1.numeroConta);
		System.out.println(processo2.numeroConta);
		System.out.println(conta);

	}

}
