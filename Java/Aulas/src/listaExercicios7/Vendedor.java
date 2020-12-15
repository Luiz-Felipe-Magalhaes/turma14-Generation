package listaExercicios7;

public class Vendedor extends Pessoa
{
	private double valorVendas;
	private double comissao;
	private double salario;
	
	//Getters and Setters:
	public double getValorVendas() 
	{
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) 
	{
		this.valorVendas = valorVendas;
	}
	public double getComissao() 
	{
		return comissao;
	}
	public void setComissao(double comissao) 
	{
		this.comissao = comissao;
	}
	public double getSalario() 
	{
		return salario;
	}
	public void setSalario(double salarioVendedor) 
	{
		this.salario = salarioVendedor;
	}
	
	//Construtores:
	public Vendedor(String nome) 
	{
		super(nome);
	}

	//Métodos:
	public void calcularSalarioComComissao()
	{
		comissao = valorVendas*0.10;
		salario+=comissao;
		
		System.out.printf("Salario Total: R$%.2f",salario);
	}
	
}
