package listaExericicos8_parte2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		Collection<String> produtosEstoque = new ArrayList();
		Collection<String> produtosAdicionadosEstoque = new ArrayList();
		Collection<String> produtosRemovidosEstoque = new ArrayList();
		
		char opcaoAdicionar, opcaoContinuar, opcaoRemover;
		
		produtosEstoque.add("Balde");
		produtosEstoque.add("Desinfetante");
		produtosEstoque.add("Detergente");
		produtosEstoque.add("Esponja");
		produtosEstoque.add("Sabão neutro");
		produtosEstoque.add("Vassoura");

		System.out.printf("Lista de produtos: %s",produtosEstoque);
		System.out.print("\n\nDeseja adicionar produtos ao estoque S/N: ");
		opcaoAdicionar = leia.next().toUpperCase().charAt(0);
		if (opcaoAdicionar == 'S')
		{
			do 
			{
				System.out.print("Digite o nome do produto que deseja adicionar: ");
				produtosAdicionadosEstoque.add(leia.next());
			
				System.out.print("\nDeseja adicionar mais produtos S/N: ");
				opcaoContinuar = leia.next().toUpperCase().charAt(0);
			}
			while (opcaoContinuar == 'S');
		}
		System.out.printf("\nLista de produtos Adicionados: %s",produtosAdicionadosEstoque);
		produtosEstoque.addAll(produtosAdicionadosEstoque);
		System.out.printf("\nLista de produtos Atualizada: %s",produtosEstoque);
		
		produtosEstoque.remove("Sabão neutro");
		
		System.out.print("\n\nDeseja remover produtos do estoque S/N: ");
		opcaoRemover = leia.next().toUpperCase().charAt(0);
		if (opcaoRemover == 'S')
		{
			do 
			{
				System.out.print("Digite o nome do produto que deseja remover: ");
				produtosRemovidosEstoque.add(leia.next());
			
				System.out.print("\nDeseja remover mais produtos S/N: ");
				opcaoContinuar = leia.next().toUpperCase().charAt(0);
			}
			while (opcaoContinuar == 'S');
		}
		System.out.printf("\nLista de produtos Removidos: %s",produtosRemovidosEstoque);
		produtosEstoque.removeAll(produtosRemovidosEstoque);
				
		System.out.println("\nLista de produtos Atualizada:");
		for (String produto : produtosEstoque)
		{
			System.out.printf("%s\n",produto);
		}
	}
}
