package listaExercicios6;

public class exercicio1_cliente 
{

	public static void main(String[] args) 
	{
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Felipe";
		cliente1.sobrenome = "Magahães";
		cliente1.genero='M';
		cliente1.anoNascimento = 1994;
		cliente1.anoAtual = 2020;
		cliente1.valorDevedor = 535.50;
		cliente1.telefone = "(11) 99999-9999";
		
		cliente1.cadastroCliente();
	}

}
