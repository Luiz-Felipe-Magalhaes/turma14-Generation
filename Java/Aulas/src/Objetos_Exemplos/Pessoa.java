package Objetos_Exemplos;

public class Pessoa 
{
	public String nome;
	public char genero;
	public int anoNascimento;
	public int idade;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome)
	{
		this.nome = nome;
	}
	public Pessoa(String nome, char genero)
	{
		this.nome= nome;
		this.genero = genero;
	}
	public Pessoa(String nome, char genero, int anoNascimento) {
		
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}
	
	//METODO
	public void retornaIidade() {
		
		this.idade = 2020 - this.anoNascimento;
	}
	
	public void retornaIidade(int anoAtual)
	{
		this.idade = anoAtual - this.anoNascimento;
	}
}
