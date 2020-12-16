package Objetos_Exemplos;

import java.util.Scanner;

public class BancoTesteEd 
{

	public static void main(String[] args) 
	{
		ContaEmpresaEd lojaBabi = new ContaEmpresaEd(500, 15000);
		ContaCorrenteEd babi = new ContaCorrenteEd(15);
		
		System.out.println("Saldo da Loja: "+ lojaBabi.getSaldo());
		System.out.println("Saldo da conta corrente:"+ babi.getSaldo());
		
		lojaBabi.credito(1000);
		babi.credito(500);
		
		System.out.println("Novo Saldo da Loja: "+ lojaBabi.getSaldo());
		System.out.println("Saldo da conta corrente:"+ babi.getSaldo());
		//lojaBabi.pediEmprestimo(200);
		lojaBabi.debito(1200);
		babi.debito(550);
		System.out.println("Novo Saldo apos a conta de luz da Loja: "+ lojaBabi.getSaldo());
		System.out.println("Valor disponivel ainda para emprestimo: "+lojaBabi.getEmprestimoEmpresa());
		System.out.println("Saldo conta corrente Babi: "+babi.getSaldo());
		

	}

}
