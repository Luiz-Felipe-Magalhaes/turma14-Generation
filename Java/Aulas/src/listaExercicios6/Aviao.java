package listaExercicios6;

public class Aviao 
{
	String fabricante, modelo;
	int numeroAssentos;
	
	// CONSTRUTOR COM DADOS BASICOS
	public Aviao (String fabricanteAviao, String modeloAviao, int totalAssentos)
	{
		this.fabricante = fabricanteAviao;
		this.modelo = modeloAviao;
		this.numeroAssentos = totalAssentos;
	}
	
	// M�TODO DO TIPO VOID
	public void StatusAviao(double velocidadeAtual, int assentosOcupados)
	{
		String dadosAviao;
		double taxaOcupacao;
		
		dadosAviao = fabricante + " " + modelo;
		taxaOcupacao = (assentosOcupados*100)/numeroAssentos;
		
				
		if (velocidadeAtual > 0 )
		{	
			System.out.printf("Avi�o: %s - Status: Em v�o com velocidade de %.2f Km/h - Taxa de ocupa��o: %.2f%%",dadosAviao, velocidadeAtual, taxaOcupacao);
		}
		else
		{
			System.out.printf("Avi�o: %s - Status: Pronto para decolar - Taxa de ocupa��o: %.2f%%",dadosAviao, taxaOcupacao);
		}
		
	}
	// M�TODO DO TIPO RETURN
	public String getStatusAviao(double velocidadeAtual, int assentosOcupados)
	{
		String dadosAviao, statusAviao;
		double taxaOcupacao;
		taxaOcupacao = (assentosOcupados*100)/numeroAssentos;
		
		dadosAviao = fabricante + " " + modelo;
		
		if (velocidadeAtual > 0 )
		{
			statusAviao = ("Avi�o: "+dadosAviao+" - Status: Em v�o com velocidade de "+velocidadeAtual+"Km/h - Taxa de ocupa��o: "+taxaOcupacao+"%");
		}
		else
		{
			statusAviao = ("Avi�o: "+dadosAviao+" - Status: Pronto para decolar - Taxa de ocupa��o: "+taxaOcupacao+"%");
		}
		
		return statusAviao;
	}
	
	
}
