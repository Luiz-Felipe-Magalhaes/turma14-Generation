package Exemplos;

import java.util.*;

public class ddp_listaAlunosNotasGenero 
{

	public static void main(String[] args) 
	{
		String nomes[] = {"Allen de Lima Vieira","Andr� de Brito Silva da Costa","B�rbara Liboni Guerra","Beatriz Martins",
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
		int matricula[] = new int[40];
		double notas [] = new double [40];
		
		for (int i=0; i<40; i++)
		{
									
			if (genero[i]=='M')
			{
				System.out.printf("Aluno \t %d \t %c \t %s\n",i+1401,genero[i],nomes[i]);
			}
			else if (genero[i]=='F')
			{
				System.out.printf("Aluna \t %d \t %c \t %s\n",i+1401,genero[i],nomes[i]);
			}
		
		}

	}
}
