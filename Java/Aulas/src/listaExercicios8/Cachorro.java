package listaExercicios8;

public class Cachorro extends Animal
{
	//Atributos:
	public boolean correr;
	
	//Construtores:
	public Cachorro(String nome, int idade, boolean correr) 
	{
		super(nome, idade);
		this.correr = correr;
	}
	
	//M�todos:
	@Override
	public void AnimalFaz() 
	{
		System.out.printf("Nome: %s - Latido: AuAuAuAuAu - Tradu��o: Vamos passear!!!\n",super.getNome());
	}
		
	
}
