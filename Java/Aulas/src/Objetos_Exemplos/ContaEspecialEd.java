package Objetos_Exemplos;

public class ContaEspecialEd extends ContaEd
{
private double valorLimite;

	
	//encapsulamento
	
	public ContaEspecialEd(int numeroConta, double valorLimite) {
		super(numeroConta);
		this.valorLimite = valorLimite;
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
}
