package listaExercicios8;

public class Cavalo extends Animal
{
	//Atributos:
	public boolean correr;
		
	//Construtores:
	public Cavalo(String nome, int idade, boolean correr) 
	{
		super(nome, idade);
		this.correr = correr;
	}
	
	//Métodos:
	@Override
	public void AnimalFaz() 
	{
		System.out.printf("Nome: %s - Relincho: hinn in in - Tradução: Vamos pastar!!!\n",super.getNome());
	}
	
}
