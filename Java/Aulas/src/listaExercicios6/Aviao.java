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
	
	// MÉTODO DO TIPO VOID
	public void StatusAviao(double velocidadeAtual, int assentosOcupados)
	{
		String dadosAviao;
		double taxaOcupacao;
		
		dadosAviao = fabricante + " " + modelo;
		taxaOcupacao = (assentosOcupados*100)/numeroAssentos;
		
				
		if (velocidadeAtual > 0 )
		{	
			System.out.printf("Avião: %s - Status: Em vôo com velocidade de %.2f Km/h - Taxa de ocupação: %.2f%%",dadosAviao, velocidadeAtual, taxaOcupacao);
		}
		else
		{
			System.out.printf("Avião: %s - Status: Pronto para decolar - Taxa de ocupação: %.2f%%",dadosAviao, taxaOcupacao);
		}
		
	}
	// MÉTODO DO TIPO RETURN
	public String getStatusAviao(double velocidadeAtual, int assentosOcupados)
	{
		String dadosAviao, statusAviao;
		double taxaOcupacao;
		taxaOcupacao = (assentosOcupados*100)/numeroAssentos;
		
		dadosAviao = fabricante + " " + modelo;
		
		if (velocidadeAtual > 0 )
		{
			statusAviao = ("Avião: "+dadosAviao+" - Status: Em vôo com velocidade de "+velocidadeAtual+"Km/h - Taxa de ocupação: "+taxaOcupacao+"%");
		}
		else
		{
			statusAviao = ("Avião: "+dadosAviao+" - Status: Pronto para decolar - Taxa de ocupação: "+taxaOcupacao+"%");
		}
		
		return statusAviao;
	}
	
	
}
