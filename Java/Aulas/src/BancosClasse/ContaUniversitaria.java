package BancosClasse;

public class ContaUniversitaria extends Conta
{
	private double valorLimite;
	private double limiteUniversitario;
	
	private double valorLimiteMax;
	private double limiteUniversitarioMax;


	//CONSTRUTOR
	public ContaUniversitaria(double valorLimite, double limiteUniversitario) {
		super();
		this.valorLimite = valorLimite;
		this.limiteUniversitario = limiteUniversitario;
		this.valorLimiteMax = valorLimite;
		this.limiteUniversitarioMax = limiteUniversitario;
	}
	
	
	public ContaUniversitaria(int numeroConta, String cpf, double valorLimite, double limiteUniversitario) {
		super(numeroConta, cpf);
		this.valorLimite = valorLimite;
		this.limiteUniversitario = limiteUniversitario;
		this.valorLimiteMax = valorLimite;
		this.limiteUniversitarioMax = limiteUniversitario;
	}

	//GET AND SET
	public double getLimite() {
		return valorLimite;
	}

	public void setLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	public double getLimiteUniversitario() {
		return limiteUniversitario;
	}

	public void setLimiteUniversitario(double limiteUniversitario) {
		this.limiteUniversitario = limiteUniversitario;
	}
	//METODO
	
	//DÉBITO
	public void Debito(double valor) 
	{

        if(valor <= super.saldoConta) 
        {
        	super.saldoConta -= valor; 
        }
        
       
        else if(valor <= (super.saldoConta + this.valorLimite)) 
        {
            valor -= super.saldoConta;
            super.saldoConta = 0;
            this.valorLimite -= valor;
        }
       
        else if(valor <= this.limiteUniversitario + this.valorLimite + super.saldoConta){
            valor -= super.saldoConta; 
            super.saldoConta = 0;

            valor -= this.valorLimite;
            this.valorLimite = 0;

            this.limiteUniversitario -= valor;
        
        }
        else if ((super.saldoConta - valor) < 0 && (super.saldoConta - valor) >= (-1000+limiteUniversitario*-1)
        		&& (limiteUniversitario - valor) <= 0)
        {
        	super.saldoConta-=valor-limiteUniversitario;
        	limiteUniversitario=0;
			System.out.printf("\nTransação realizada com sucesso. Você está negativado.");
			//System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteUniversitario, saldoConta);
        }
        else if ((super.saldoConta - valor) < 0 && (saldoConta - valor) < -1000) 
		{	
			System.out.println("\nTransação Não autorizada. Limite indisponivel.");
			//System.out.printf("\nLimite Atual: R$%.2f\nSaldo Atual: R$%.2f\n", limiteUniversitario, saldoConta); //incluir limite disponivel		
		}        
    }
	
	//CRÉDITO
	public void Credito(double valor) {
	      								
        if(super.saldoConta < 0 && (valor*-1) < super.saldoConta) 
        {
        	valor += super.saldoConta;
        	super.saldoConta = 0;  	
        }
        else 
        {
        	super.saldoConta+=valor;
        	valor = 0;
        }
        
        if(this.limiteUniversitario < this.limiteUniversitarioMax) {
        	
        	if(valor <= this.limiteUniversitarioMax - this.limiteUniversitario) 
        	{
        		this.limiteUniversitario += valor;
        		valor = 0;
        	}
        	
        	else {
        		valor -= (this.limiteUniversitarioMax - this.limiteUniversitario);
        		this.limiteUniversitario = this.limiteUniversitarioMax;
        	}
        }
        
        if(this.valorLimite < this.valorLimiteMax) {
        	
        	if(valor <= this.valorLimiteMax - this.valorLimite) {
        		this.valorLimite += valor;
        		valor = 0;
        	}
        	
        	else {
        		valor -= (this.valorLimiteMax - this.valorLimite);
        		this.valorLimite = this.valorLimiteMax;
        	}
        }
        saldoConta += valor;
              
    }
}
