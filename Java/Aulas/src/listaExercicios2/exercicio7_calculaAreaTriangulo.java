package listaExercicios2;

import java.util.Scanner;

public class exercicio7_calculaAreaTriangulo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		double baseTriangulo, alturaTriangulo, areaTriangulo;
		
		System.out.print("Digite o valor da altura do triângulo: ");
		alturaTriangulo = leia.nextDouble();
		System.out.print("Digite o valor da base do triângulo: ");
		baseTriangulo = leia.nextDouble();
		
		if (baseTriangulo > 0 && alturaTriangulo > 0)
		{
			areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
			System.out.printf("Área do triangulo = %.2f",areaTriangulo);
		}
		else 
			System.out.println("Os valores digitados não são válidos.");	
	}
}
