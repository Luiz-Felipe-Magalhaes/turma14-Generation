package Objetos_Exemplos;

public class ContaEmpresaEd extends ContaEd
	{
		private double emprestimoEmpresa;
		
		//encapsulamento
		public ContaEmpresaEd(int numeroConta, double emprestimoEmpresa) {
			super(numeroConta);
			this.emprestimoEmpresa = emprestimoEmpresa;
		}

		
		public ContaEmpresaEd(int numeroConta, String cpf, double emprestimoEmpresa) {
			super(numeroConta, cpf);
			this.emprestimoEmpresa = emprestimoEmpresa;
		}



		//encapsulamento - getters and setters



		public double getEmprestimoEmpresa() {
			return emprestimoEmpresa;
		}

		
		public void setEmprestimoEmpresa(double emprestimoEmpresa) {
			this.emprestimoEmpresa = emprestimoEmpresa;
		}
}
