package Objetos_Exemplos;

import java.util.Scanner;

public class exemplo_LojaLoka 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		Pessoa cliente = new Pessoa();
		Pessoa clienteAvulso = new Pessoa();
		
		clienteAvulso.nome = "EDNILSON";
		clienteAvulso.genero = 'M';
		clienteAvulso.anoNascimento = 1974;
		
		
		
		
		//String produto = "Vestido";
		//int qtde = 10;
		//double valorProduto = 100.00;
		
		// a classe se chamar Produto
		//nomeProduto
		//qtdeEstoque
		//valorUnitario
		
		//tres produtos no programa
		// vestido - 100,00 - 3 estoque
		// blusa - 50,00 - 1 estoque
		// camise - 20,00 - 20 em estoque
		// escolhe, dizer a quantidade  e  vai mostrar o total a pagar
		
		
		System.out.println("Bom dia, digite o seu nome: ");
		cliente.nome = leia.next().toUpperCase();
		System.out.println("Vc é Masculuno, Feminino ou Outros: [M/F/O");
		cliente.genero = leia.next().toUpperCase().charAt(0);
		
		System.out.printf("Bom dia %s !!!\n", cliente.nome);
		//System.out.println("PRODUTO DISPONIVEL NO MOMENTO:");
		//System.out.printf("PRODUTO: %s, qtde: %d, valor R$: %.2f\n", produto, qtde, valorProduto);
		
		System.out.println(cliente.nome);
		System.out.println(clienteAvulso.nome);

	}

}
