package Objetos_Exemplos;

public class Terceiro extends Funcionario
{	
	//Atributos:
	private double valorTerceiro;
	
	//Gettes and 
	public double getValorTerceiro() 
	{
		return valorTerceiro;
	}
	
	public Terceiro(String nome, int horasTrabalhadas, double salarioHora, double valorTerceiro) 
	{
		super(nome, horasTrabalhadas, salarioHora);
		this.valorTerceiro = valorTerceiro;
	}

	public void setValorTerceiro(double valorTerceiro) 
	{
		this.valorTerceiro = valorTerceiro;
	}

	@Override
	public double PagamentoSalario()
	{
		return ((super.getSalarioHora()*super.getHorasMensais())+this.valorTerceiro);
	}
	
}
