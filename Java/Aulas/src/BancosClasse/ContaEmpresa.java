package BancosClasse;

import java.util.Scanner;

public class ContaEmpresa extends Conta {
	Scanner leia = new Scanner(System.in);

	// Atributos
	private double emprestimoEmpresa;

	// Construtores
	public ContaEmpresa(int numeroConta, String cpf, double emprestimoEmpresa) {
		super(numeroConta, cpf);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	public ContaEmpresa(String nome, int numeroConta, String cpf, double emprestimoEmpresa) {
		super(numeroConta, nome, cpf);
		this.emprestimoEmpresa = emprestimoEmpresa;
		super.tipoConta = 4;
	}

	// Getters and Setters
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	// Metodos
	public void FazerEmprestimo(double valorEmprestimo) {
		if (valorEmprestimo <= this.emprestimoEmpresa) {
			this.emprestimoEmpresa -= valorEmprestimo;
			this.saldoConta += valorEmprestimo;
			System.out.printf(
					"\nEmprestimo realizado com sucesso.\nSaldo atual: R$%.2f\nLimite de Emprestimo: R$%.2f\n",
					getSaldoConta(), getEmprestimoEmpresa());
		} else {
			System.out.println("\nSolicitação não aprovada. Fale com seu gerente.");
		}
	}

	public void close() {

	}

}
