package Objetos_Exemplos;

public class ContaUniversitariaEd extends ContaEspecialEd
{
	private double emprestimoUniversitario;
	
		
		//construtor
		public ContaUniversitariaEd(int numeroConta, double valorLimite, double emprestimoUniversitario) {
			super(numeroConta, valorLimite);
			this.emprestimoUniversitario = emprestimoUniversitario;
		}
	
		//encapsulamento - getters and setters
		
		public double getEmprestimoUniversitario() {
			return emprestimoUniversitario;
		}
	
		public void setEmprestimoUniversitario(double emprestimoUniversitario) {
			this.emprestimoUniversitario = emprestimoUniversitario;
		}
	
}
