package listaExercicios7;

public class Empregado extends Pessoa
{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	// Getters and Setters: 
	public int getCodigoSetor() 
	{
		return codigoSetor;
	
	}
	public void setCodigoSetor(int codigoSetor) 
	{
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() 
	{
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) 
	{
		this.salarioBase = salarioBase;
	}
	public double getImpost() 
	{
		return imposto;
	}
	public void setImpost(double imposto) 
	{
		this.imposto = imposto;
	}
	
	//Construtor:
	public Empregado(String nome, int codigoSetor) 
	{
		super(nome);
		this.codigoSetor = codigoSetor;
	}
	
	//Métodos:
	public double calcularSalario()
	{
		double salarioLiquido;
		
		salarioLiquido = salarioBase - (salarioBase*imposto/100);
		
		return salarioLiquido;
	}
		
}
