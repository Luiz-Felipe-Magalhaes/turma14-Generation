package listaExercicios6;

public class exercicio2_aviao {

	public static void main(String[] args) 
	{
		Aviao aviao1 = new Aviao("Airbus","A320",336);
		Aviao aviao2 = new Aviao("Boeing","737",215);
		
		System.out.println("Lista de avi�es: ");
		
		//chamando m�todo void:
		aviao1.StatusAviao(0, 321);
		
		//chamando m�todo return:		
		System.out.printf("\n%s",aviao2.getStatusAviao(785.37,191));
	
	}

}
