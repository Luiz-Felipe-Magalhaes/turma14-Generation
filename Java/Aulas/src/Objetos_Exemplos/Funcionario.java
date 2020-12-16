package Objetos_Exemplos;

public class Funcionario
{
	private String nome;
	private int horasMensais;
	private double salarioHora;
	
	//Getters and Setters:
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public int getHorasMensais() 
	{
		return horasMensais;
	}

	public void setHorasMensais(int horasMensais) 
	{
		this.horasMensais = horasMensais;
	}

	public double getSalarioHora() 
	{
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora)
	{
		this.salarioHora = salarioHora;
	}
	
	//Construtores:
	public Funcionario(String nome, int horasMensais, double salarioHora) 
	{
		super();
		this.nome = nome;
		this.horasMensais = horasMensais;
		this.salarioHora = salarioHora;
	}

	//Métodos:
	public double PagamentoSalario()
	{
		return (this.salarioHora*horasMensais);

	}
	

}
