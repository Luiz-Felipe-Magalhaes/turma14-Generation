package Loja;

import java.util.Scanner;

public class Cliente extends Pessoa
{
	Scanner leia = new Scanner(System.in);
	//Atributos:
	private String cpfCliente;

	//Construtores:
	public Cliente(String nome, char genero, int anoNascimento, String cpfCliente) 
	{
		super(nome, genero, anoNascimento);
		this.cpfCliente = cpfCliente;
	}
	
	//Getters and Setters:

	public String getCpfCliente() 
	{
		return cpfCliente;
	}

	//Métodos:
	public void corrigirCpf ()
	{
		System.out.print("Digite o CPF Correto:");
		cpfCliente = leia.next();
	}
	
	
}
