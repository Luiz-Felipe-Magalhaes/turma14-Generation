package listaExercicios7;

public class Operario extends Pessoa
{
	private double valorProducao;
	private double salario;
	private double comissao;
	
	//Getters and Setters:
	public double getValorProducao() 
	{
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) 
	{
		this.valorProducao = valorProducao;
	}
	public double getSalario()
	{
		return salario;
	}
	public void setSalario(double salario)
	{
		this.salario = salario;
	}	
	public double getComissao() 
	{
		return comissao;
	}
	public void setComissao(double comissao) 
	{
		this.comissao = comissao;
	}
	
	//Construtores:
	public Operario() 
	{
		
	}
	//Métodos:
	public double calcularSalarioComComissao()
	{
		comissao = valorProducao*0.10;
		salario+=comissao;
		
		return salario;	
	}

}
