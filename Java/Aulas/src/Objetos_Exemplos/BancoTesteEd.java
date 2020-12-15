package Objetos_Exemplos;

import java.util.Scanner;

public class BancoTesteEd 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		System.out.println("BANCO TESTE PARA USO");
		int conta;
		char op;
		double valor= 0.00;
		/*
		System.out.println("Digite o numero da conta: ");
		conta = leia.nextInt();
		*/
		
		ContaPoupancaEd contapop = new ContaPoupancaEd(2,"111.995.778-95", 25);
		
		System.out.println("Numero que abriu a conta/objeto: "+contapop.getNumeroConta()+" CPF NUMERO: "+contapop.getCpf());
		
		contapop.trocarNumero(113);
		System.out.println("Numero novo conta/objeto: "+contapop.getNumeroConta()+" CPF NUMERO: "+contapop.getCpf());
		
		
		ContaCorrenteEd contapobre = new ContaCorrenteEd(2);
		/*
		ContaEspecial contarico = new ContaEspecial();
		ContaUniversitaria contaFF = new ContaUniversitaria();
		*/
		contapobre.credito(300);
		contapop.credito(100);
		
		System.out.println("numero da conta: "+contapop.getNumeroConta()+" Saldo atual: "+contapop.getSaldo());
		System.out.println("Conta de pobre, qual o saldo: "+contapobre.getSaldo());
		
		/*
		
		ContaEspecial processo1 = new ContaEspecial(); //declarar o objeto e usar o construtor
		System.out.println("Saldo atual da conta é "+processo1.getSaldo());
		System.out.println("Desejar movimentar? S/N");
		op = leia.next().toUpperCase().charAt(0);
		
		
		while (op =='S') 
		{
			System.out.println("Movimento a credito ou debito? [C/D]:");
			op = leia.next().toUpperCase().charAt(0);
			System.out.println("Digite o valor: ");
			valor = leia.nextDouble();
			if (op=='D') 
			{
				processo1.debito(valor);
			} 
			else if (op=='C') 
			{
				processo1.credito(valor);
			}
			System.out.printf("Saldo atual: %.2f\n", processo1.saldo );
			System.out.println("Continua S/N:");
			op = leia.next().toUpperCase().charAt(0);
		}
		
		*/
		System.out.println("Fim do programa. Tks!!!");
		

	}

}
