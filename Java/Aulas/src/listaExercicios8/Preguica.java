package listaExercicios8;

public class Preguica extends Animal
{
	//Atributos:
	public boolean subirEmArvores;

	//Construtores:
	public Preguica(String nome, int idade, boolean subirEmArvores) 
	{
		super(nome, idade);
		this.subirEmArvores = subirEmArvores;
	}
	
	//M�todos:
	@Override
	public void AnimalFaz() 
	{
		System.out.printf("Nome: %s - Grunhido: fiiiiiiifiiiiiiiii - Tradu��o: Estou muito cansado para correr, mas posso subir em arvores.\n",super.getNome());
	}
	
	
}
