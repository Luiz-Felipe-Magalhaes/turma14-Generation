package banco;

import java.util.*;

public class banco_contasComVetor 
{

	public static void main(String[] args) 
	{
		Random sorteia = new Random();
		Scanner leia= new Scanner(System.in);
		
		
		String nomeClientes[] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins",
				"Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira",
				"Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima",
				"Fernanda Agapito","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Enrique Cabral Silva","Gabriel Sérgio Nascimento Santos Gonçalves",
				"Gideão da Silva Idelfonso","Gilson Amorim De Matos","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
				"Heloisa Beatriz De Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura",
				"José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni Barros",
				"Lucas Gonçalves da Silva","Luis Felipe da Silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves",
				"Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almena","Vinicius Alves Miranda"};
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
			System.out.printf("\nQual transação deseja realizar [C]Credito ou D[Débito]: ");
			tipoTransacao[i]= leia.next().toUpperCase().charAt(0);
			
			System.out.printf("Informe o valor da transação: R$");
			valorTransacao[i] = leia.nextDouble();
			
		}
		
		
		
		
		
	
		//QUAL O VALOR DO MOVIMENTO: R$ XX.XX
		//[D]DÉBITO OU [C] CRÉDITO: _

		
		
		
		
		
		
		
		

	}

}
