package BancosClasse;

public class ContaEspecial extends ContaCorrente
{
	private double valorLimite;

	public double getValorLimite() 
	{
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) 
	{
		this.valorLimite = valorLimite;
	}

	public ContaEspecial(int numeroConta, String cpf, double valorLimite) 
	{
		super(numeroConta, cpf);
		this.valorLimite = valorLimite;
	}
	
	
}
