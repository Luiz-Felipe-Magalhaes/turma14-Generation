package Objetos_Exemplos;

public class ContaCorrenteEd extends ContaEd
{
	protected int numeroTalaoCheque;
	
		
		//construtor
		public ContaCorrenteEd(int numeroConta) {
			super(numeroConta);
		}
		public ContaCorrenteEd(int numeroConta, String cpf) {
			super(numeroConta, cpf);
		}
	
		//ENCAPSULAMENTO
		
		public int getNumeroTalaoCheque() {
			return numeroTalaoCheque;
		}
	
		public void setNumeroTalaoCheque(int numeroTalaoCheque) {
			this.numeroTalaoCheque = numeroTalaoCheque;
		}
	
}
