package banco;

import java.util.*;

public class banco_contasComVetor 
{

	public static void main(String[] args) 
	{
		Random sorteia = new Random();
		Scanner leia= new Scanner(System.in);
		
		
		String nomeClientes[] = {"Allen de Lima Vieira","Andr� de Brito Silva da Costa","B�rbara Liboni Guerra","Beatriz Martins",
				"Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira",
				"Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima",
				"Fernanda Agapito","Fernanda Barbosa Ferraz","Francisco Jos� Pires","Gabriel Enrique Cabral Silva","Gabriel S�rgio Nascimento Santos Gon�alves",
				"Gide�o da Silva Idelfonso","Gilson Amorim De Matos","Guilherme Gon�alves da Silva","Gustavo Rabelo Teles",
				"Heloisa Beatriz De Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura",
				"Jos� Jorge Hauck J�nior","Juliana Santos Andr�","K�lven Cleiton de Ara�jo Brand�o","La�s Lima Santos","Lucas anseloni Barros",
				"Lucas Gon�alves da Silva","Luis Felipe da Silva","Luiz Felipe da Silva Magalh�es","Marcos Eduardo Gomes Gon�alves",
				"Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Ver�nica Navarro Almena","Vinicius Alves Miranda"};
		char genero[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F',
					'M','F','M','M','M','M','M','F','F','M','F','M'};
		int numeroConta[] = new int [40];
		int tipoConta[] = new int [40];
		double saldoConta[] = new double [40];
		double valorTransacao[] = new double [10];
		char tipoTransacao [] = new char [10];
		int limiteTransacoes = 3;
		
		
		for (int i=0; i<limiteTransacoes; i++)
		{
			System.out.printf("\nQual transa��o deseja realizar [C]Credito ou D[D�bito]: ");
			tipoTransacao[i]= leia.next().toUpperCase().charAt(0);
			
			System.out.printf("Informe o valor da transa��o: R$");
			valorTransacao[i] = leia.nextDouble();
			
		}
		
		
		
		
		
	
		//QUAL O VALOR DO MOVIMENTO: R$ XX.XX
		//[D]D�BITO OU [C] CR�DITO: _

		
		
		
		
		
		
		
		

	}

}
