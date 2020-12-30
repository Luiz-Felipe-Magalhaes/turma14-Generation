package BancosClasse;

public class ContaUniversitaria extends Conta {
	private double valorLimite;
	private double limiteUniversitario;
	private double valorLimiteMax;
	private double limiteUniversitarioMax;
	private double limiteNegativo = 1000;

	// CONSTRUTOR

	public ContaUniversitaria(int numeroConta, String nome, String cpf, double valorLimite,
			double limiteUniversitario) {
		super(numeroConta, nome, cpf);
		this.valorLimite = valorLimite;
		this.limiteUniversitario = limiteUniversitario;
		this.valorLimiteMax = valorLimite;
		this.limiteUniversitarioMax = limiteUniversitario;
		super.tipoConta = 5;
	}

	public ContaUniversitaria(int numeroConta, String cpfConta, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	// GET AND SET
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
	// METODO

	// DÉBITO
	public void Debito(double valor) {

		if (valor <= super.saldoConta)
			super.saldoConta -= valor;
		else if (valor <= (super.saldoConta + this.valorLimite)) {
			valor -= super.saldoConta;
			super.saldoConta = 0;
			this.valorLimite -= valor;
		} else if (valor <= (this.limiteUniversitario + this.valorLimite + super.saldoConta)) {
			valor -= super.saldoConta;
			super.saldoConta = 0;

			valor -= this.valorLimite;
			this.valorLimite = 0;

			this.limiteUniversitario -= valor;
		} else if (valor <= (this.limiteUniversitario + this.valorLimite + super.saldoConta + limiteNegativo)) {
			valor -= super.saldoConta;
			super.saldoConta = 0;

			valor -= this.valorLimite;
			this.valorLimite = 0;

			valor -= this.limiteUniversitario;
			this.limiteUniversitario = 0;

			super.saldoConta -= valor;
			System.out.printf("\nTransação realizada com sucesso. Você está negativado.");
		} else
			System.out.println("\nTransação Não autorizada. Limite indisponivel.");

	}

	// CRÉDITO
	public void Credito(double valor) {

		if (super.saldoConta < 0) {
			if ((super.saldoConta * -1) < valor) {
				valor += super.saldoConta;
				super.saldoConta = 0;
			} else {
				super.saldoConta += valor;
				valor = 0;
			}
		}

		if (this.limiteUniversitario < this.limiteUniversitarioMax) {

			if (valor <= this.limiteUniversitarioMax - this.limiteUniversitario) {
				this.limiteUniversitario += valor;
				valor = 0;
			} else {
				valor -= (this.limiteUniversitarioMax - this.limiteUniversitario);
				this.limiteUniversitario = this.limiteUniversitarioMax;
			}
		}

		if (this.valorLimite < this.valorLimiteMax) {
			if (valor <= this.valorLimiteMax - this.valorLimite) {
				this.valorLimite += valor;
				valor = 0;
			} else {
				valor -= (this.valorLimiteMax - this.valorLimite);
				this.valorLimite = this.valorLimiteMax;
			}
		}

		saldoConta += valor;

	}
}