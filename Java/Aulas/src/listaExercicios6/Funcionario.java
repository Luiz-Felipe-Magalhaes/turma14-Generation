package listaExercicios6;

public class Funcionario 
{
	String nome, sobrenome, codigo, setor;
	int idade, mesesSemFerias;
		
	public Funcionario (String nomeFuncionario, String sobrenomeFuncionario, String codigoFuncionario, String setor)
	{
		this.nome = nomeFuncionario;
		this.sobrenome = sobrenomeFuncionario;
		this.codigo = codigoFuncionario;
		this.setor = setor;
	}
	
	public String getDadosFuncionario()
	{
		String nomeCompleto, dadosFuncionario;
		nomeCompleto = (nome + " " + sobrenome);
		
		dadosFuncionario = ("Dados do colaborador\nNome: "+nomeCompleto+" | Cód.: "+this.codigo+" Setor: "+this.setor);
		
		return dadosFuncionario;
	}
	
	
	public void getFeriasFuncionario (int mesesSemFerias)
	{
		//String nomeCompleto ;
		int limiteParaTirarFerias;
		
		//nomeCompleto = (nome + " " + sobrenome);
		limiteParaTirarFerias = 12 - mesesSemFerias;
		
		//System.out.printf("Dados do colaborador\nNome: %s | Cód.: %s - Setor: %s",nomeCompleto, this.codigo, this.setor);
		System.out.printf("\nTempo para vencimento das proximas férias: %d meses",limiteParaTirarFerias);
	}
	
}
