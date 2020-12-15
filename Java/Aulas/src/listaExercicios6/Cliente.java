package listaExercicios6;

public class Cliente 
{
	String nome, sobrenome,telefone;
	char genero;
	int anoAtual, anoNascimento;
	double valorDevedor;
			
	public void cadastroCliente ()
	{	
		String nomeCliente, generoCliente="x";
		int idade = 0;
				
		nomeCliente = this.nome + " " + this.sobrenome;
	
		if (this.genero == 'M')
		{
			generoCliente = "Masculino";
		}
		else if (this.genero == 'F')
		{
			generoCliente = "Feminino";
		}
		else if (this.genero == 'O')
		{
			generoCliente = "Outro";
		}
		
		idade = this.anoAtual - this.anoNascimento;
				
		System.out.printf("Dados do cliente: \nNome: %s - Genêro: %s - Idade:%d anos - Telefone: %s\nValor Devedor: R$%.2f"
				,nomeCliente, generoCliente, idade, this.telefone, this.valorDevedor);
		
	}
	
}
