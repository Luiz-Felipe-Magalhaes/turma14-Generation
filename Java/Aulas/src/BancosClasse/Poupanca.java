package BancosClasse;

public class Poupanca extends Conta {
	private int dataAniversario;

	public Poupanca(int numeroConta, String nome, int dataAniversario) {
		super(numeroConta, nome);
		this.dataAniversario = dataAniversario;
	}

	public Poupanca(int numeroConta, String nome, String cpf, int dataAniversario) {
		super(numeroConta, nome, cpf);
		this.dataAniversario = dataAniversario;
		super.tipoConta = 1;
	}

	public int getDataAniversario() {
		return dataAniversario;
	}

	public void bonusPoupanca(int dataAtual) {
		if (dataAtual == this.dataAniversario) {
			System.out.println("Acrescido 0,5% ao seu saldo atual");
			super.FazerCredito((super.getSaldoConta() * 0.005));
		}
	}

}