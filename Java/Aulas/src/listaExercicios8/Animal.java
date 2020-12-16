package listaExercicios8;

public abstract class Animal 
{	
	//Atributos:
	private String nome;
	private int idade;
	private String emitirSom;
	
	//Construtores:
	public Animal(String nome, int idade) 
	{
		super();
		this.nome = nome;
		this.idade = idade;
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
	public int getIdade() 
	{
		return idade;
	}
	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	public String getEmitirSom() 
	{
		return emitirSom;
	}
	public void setEmitirSom(String emitirSom) 
	{
		this.emitirSom = emitirSom;
	}
	
	//Métodos:
	public void AnimalFaz() 
	{
		System.out.println("Não sei que animal sou, logo não sei qual som emitir.\n");
	}
	
}
