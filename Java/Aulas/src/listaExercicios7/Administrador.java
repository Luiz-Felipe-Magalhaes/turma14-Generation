package listaExercicios7;

public class Administrador extends Pessoa
{
	private double ajudaDeCusto;
	private double salario;

	//Getters and Setters:
	public double getAjudaDeCusto() 
	{
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) 
	{
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	//Construtores:
	public Administrador (String nome)
	{
		super(nome);
	}
	
	//Métodos:
	public void calcularAjudaCusto ()
	{
		double ajudaCusto=0;
		
		if (this.salario < 9000)
		{
			ajudaCusto = this.salario*0.10;
		}
		
		else if (this.salario >= 9000)
		{
			ajudaCusto = this.salario*0.09;
		}
		
		if (ajudaCusto <= 700)
		{
			ajudaCusto = 700;
		}
		
		
		System.out.printf("Ajuda de custo: R$%.2f",ajudaCusto);
		
	}
	
	
}
