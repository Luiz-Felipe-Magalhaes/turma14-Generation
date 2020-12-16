package listaExercicios8;

public class testaAnimais 
{
	public static void main (String args[])
	{
		Cachorro cachorroTeste = new Cachorro("Spike", 3, true);
		cachorroTeste.AnimalFaz();
		
		Cavalo cavaloTeste = new Cavalo("Pé de Pano",5, true);
		cavaloTeste.AnimalFaz();
		
		Preguica preguicaTeste = new Preguica("Boltz",3, true);
		preguicaTeste.AnimalFaz();
		
	}
}
