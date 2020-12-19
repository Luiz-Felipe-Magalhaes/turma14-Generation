package BancosClasse;

public class ContaEspecial extends ContaCorrente {
	
	private double valorLimite;
	private double valorCadastroLimite;
	
	public ContaEspecial(int numeroConta, String cpf, double valorLimite, double valorCadastroLimite) {
		super(numeroConta, cpf);
		this.valorLimite = valorLimite;
		this.valorCadastroLimite = valorCadastroLimite;
	}

	
	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}

	public double getValorCadastroLimite() {
		return valorCadastroLimite;
	}

	public void setValorCadastroLimite(double valorCadastroLimite) {
		this.valorCadastroLimite = valorCadastroLimite;
	}
	@Override
        public boolean testarSaldo(double valor) {
		
		boolean teste;
		if (valor <= super.getSaldoConta()) 
		{
			teste = true;
		} 
		else if (valor <= (this.valorLimite+super.getSaldoConta()))
		{
			// 100 saldo 1000 limite  valor pedido: 200 reais
			//1000 + (200)
			double valorCredito = valor - super.getSaldoConta();
			super.FazerCredito(valorCredito);
			this.valorLimite = this.valorLimite - valorCredito;
			teste = true;
		}
		else
		{
			teste = false;
		}
		
		return teste;
	}public void registraLimite() 
	 {
		if (valorLimite<=0) {
			System.out.println("Valor zerado, impossivel realizar!!!");
		}
		else {
			this.valorCadastroLimite = this.valorLimite;
		}
		
	}
	
	public void devolverLimite() {
		if (this.valorLimite < this.valorCadastroLimite) 
		{
			double diferenca;
			diferenca = this.valorCadastroLimite - this.valorLimite;
			super.FazerDebito(diferenca);
			this.valorLimite += diferenca;
			
		}
	}
	@Override
	public void FazerCredito (double valorTransacao)
	{	
		if(this.valorCadastroLimite <1000) 
		{
			this.valorCadastroLimite+=valorTransacao;
			if(this.valorCadastroLimite >1000) 
			{
				super.FazerCredito(this.valorCadastroLimite-1000);
				this.valorCadastroLimite=1000;
				
			}
		}
		this.saldoConta+=valorTransacao;
		System.out.printf("\nTransação realizada com sucesso.\nSaldo atual: R$%.2f\n",getSaldoConta());			
	}
}
