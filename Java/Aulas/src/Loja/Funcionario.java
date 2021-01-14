package Loja;

public class Funcionario extends Pessoa
{
	//Atributos:
	private String codigoFuncionario;

	//Construtores:
	public Funcionario(String nome, String codigoFuncionario) 
	{
		super(nome);
		this.codigoFuncionario = codigoFuncionario;
	}

	//Getters and Setters:
	public String getCodigoFuncionario() 
	{
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(String codigoFuncionario) 
	{
		this.codigoFuncionario = codigoFuncionario;
	}

}
