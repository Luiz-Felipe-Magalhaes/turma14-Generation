package Objetos_Exemplos;

public class ContaPoupancaEd extends ContaEd
{
	//atributo
		private int dataAniversarioConta;
		
		
		//construtor
		public ContaPoupancaEd(int numeroConta, String cpf, int dataAniversarioConta) {
			super(numeroConta, cpf);
			this.dataAniversarioConta = dataAniversarioConta;
		}
		
		
		//ENCAPSULAMENTO - GETTER AND SETTERS
		
		public int getDataAniversarioConta() {
			return dataAniversarioConta;
		}

		

		public void setDataAniversarioConta(int dataAniversarioConta) {
			this.dataAniversarioConta = dataAniversarioConta;
		}
		
}
