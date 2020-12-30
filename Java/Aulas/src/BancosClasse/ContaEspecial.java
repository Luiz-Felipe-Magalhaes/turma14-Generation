package BancosClasse;

public class ContaEspecial extends ContaCorrente {
	private double valorLimite;
	private double valorCadastroLimite = -1000;

	public ContaEspecial(int numeroConta, String cpf, double valorLimite, double valorCadastroLimite) {
		super(numeroConta, cpf);
		this.valorLimite = valorLimite;
		this.valorCadastroLimite = valorCadastroLimite;
	}

	public ContaEspecial(int numeroConta, String nome, String cpf, double valorLimite) {
		super(numeroConta, nome, cpf);
		this.valorLimite = valorLimite;
		super.tipoConta = 3;
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
		if (valor <= super.getSaldoConta()) {
			teste = true;
		} else if (valor <= (this.valorLimite + super.getSaldoConta())) {
			// 100 saldo 1000 limite valor pedido: 200 reais
			// 1000 + (200)
			double valorCredito = valor - super.getSaldoConta();
			super.FazerCredito(valorCredito);
			this.valorLimite = this.valorLimite - valorCredito;
			teste = true;
		} else {
			teste = false;
		}

		return teste;
	}

	// METODO

	// DÉBITO
	public void Debito(double valor) {

		if (valor <= super.saldoConta)
			super.saldoConta -= valor;
		else if (valor <= (super.saldoConta + this.valorLimite)) {
			valor -= super.saldoConta;
			super.saldoConta = 0;
			this.valorLimite -= valor;

		} else
			System.out.println("\nTransação Não autorizada. Limite indisponivel.");

	}

	// CRÉDITO
	public void Credito(double valor) {

		if (this.valorLimite < this.valorCadastroLimite) {

			if (valor <= this.valorCadastroLimite - this.valorLimite) {
				this.valorLimite += valor;
				valor = 0;
			} else {
				valor -= (this.valorCadastroLimite - this.valorLimite);
				this.valorLimite = this.valorCadastroLimite;
			}
		}

		saldoConta += valor;

	}

}
