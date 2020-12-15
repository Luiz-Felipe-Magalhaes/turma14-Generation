package listaExercicios7;

public class Pessoa 
{
	//Atributos: 
	private String nome;
	private String endereço;
	private String telefone;
	
	//Get nome:
	public String getNome() 
	{
		return nome;
	}
	//Set nome:
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	//Get endereço:
	public String getEndereço() 
	{
		return endereço;
	}
	//Set endereço:
	public void setEndereço(String endereço) 
	{
		this.endereço = endereço;
	}
	//Get telegone:
	public String getTelefone() 
	{
		return telefone;
	}
	//Set telefone:
	public void setTelefone(String telefone) 
	{
		this.telefone = telefone;
	}
	
	//Construtor Padrão:
	public Pessoa ()
	{
			
	}	
	
	//Construtor 1:
	public Pessoa(String nome, String endereço, String telefone) 
	{
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
	}
	
	//Construtor 2:
	public Pessoa (String nome)
	{
		this.nome = nome;
	}
	
}
