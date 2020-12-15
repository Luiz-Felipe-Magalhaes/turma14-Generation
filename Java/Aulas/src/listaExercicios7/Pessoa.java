package listaExercicios7;

public class Pessoa 
{
	//Atributos: 
	private String nome;
	private String endere�o;
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
	//Get endere�o:
	public String getEndere�o() 
	{
		return endere�o;
	}
	//Set endere�o:
	public void setEndere�o(String endere�o) 
	{
		this.endere�o = endere�o;
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
	
	//Construtor Padr�o:
	public Pessoa ()
	{
			
	}	
	
	//Construtor 1:
	public Pessoa(String nome, String endere�o, String telefone) 
	{
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}
	
	//Construtor 2:
	public Pessoa (String nome)
	{
		this.nome = nome;
	}
	
}
