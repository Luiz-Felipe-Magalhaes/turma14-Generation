package Loja;

public abstract class Pessoa 
{	
	//Atributos:
	private String nome;
	private char genero;
	private int anoNascimento;
	
	//Construtores:
	public Pessoa(String nome, char genero, int anoNascimento) 
	{
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}
		
	public Pessoa(String nome) 
	{
		super();
		this.nome = nome;
	}



	//Getters and Setters:
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public char getGenero() 
	{
		return genero;
	}

	public void setGenero(char genero) 
	{
		this.genero = genero;
	}

	public int getAnoNascimento() 
	{
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) 
	{
		this.anoNascimento = anoNascimento;
	}
	
	//Métodos:
	public void voltaIdade(int anoAtual, int anoNascimento)
	{
		if (this.anoNascimento == 0 || this.anoNascimento <=1900)
		{
			System.out.println("Idade não pode ser calculada. Dados inválidos.");
		}
		else
		{
		int idade = anoAtual - anoNascimento;
		System.out.printf("Idade: %d anos",idade);
		}
	}
	
	
}
