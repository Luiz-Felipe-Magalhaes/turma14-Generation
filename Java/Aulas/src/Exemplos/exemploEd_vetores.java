package Exemplos;

import java.util.Random;

public class exemploEd_vetores 
{

	public static void main(String[] args)
	{
		String clientes[] = {"ED", "GEANDRO", "JESSICA", "FATIMA"};
		int controle[] = new int[4];
		int tipo[] = new int[4];
		Random randomico = new Random(); //objeto randomico
		double valor[] = new double[4];
		
		
		for (int x=0; x<4; x++)
		{
			controle[x] = (x+1);
			tipo[x]=randomico.nextInt(3)+1;
			
		}
		
		for (int x=0; x<4;x++)
		{
			System.out.println("NUMERO: "+controle[x]+" NOME DA PESSOA: "+clientes[x]+" numero randomico: " + tipo[x]+" valor: "+valor[x]);
		}
	}
}

	


