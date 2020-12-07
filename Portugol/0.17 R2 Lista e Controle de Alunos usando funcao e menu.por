programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		caracter opcao
		
		escreva ("GENERATION BRASIL\n")
		escreva ("[1] Listar todos os alunos | [2] Listar alunos do gênero Masculino | [3] Listar alunos do gênero Feminino \n[4] Listar alunos aprovados | [5] Listar alunos reprovados | [6] Listar por uma nota desejada")
		escreva ("\nESCOLHA A OPÇÃO DESEJADA: ")
		leia (opcao)

		se (opcao == '1')
		{
			lista()
		}		
	}

	funcao lista ()
	{
		cadeia alunos[39] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins",
		"Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira",
		"Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima",
		"Fernanda Agapito","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves",
		"Gideão da Silva Idelfonso","Gilson Amorim De Matos","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
		"Heloisa Beatriz De Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura",
		"José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni Barros",
		"Lucas Gonçalves da Silva","Luis felipe da Silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves",
		"Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almena","Vinicius Alves Miranda"}
 		cadeia matriculas[39]
		caracter generos[39]={'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F',
		'M','F','M','M','M','M','M','F','F','M','F','M'}
		inteiro notas [39]
		cadeia codigoAluno

		para (inteiro i = 0; i < 39; i++)
		{
			se (i<9)
			{
			matriculas[i] = "G7-0"+(i+1)	
			}	
			senao
			{
			matriculas[i] = "G7-"+(i+1)
			}
		}
		para (inteiro i = 0; i < 39; i++)
		{
		notas[i] = Util.sorteia(0,10)
		}
		para (inteiro i = 0; i < 39; i++)
		{
			escreva (matriculas[i]," - ",alunos[i]," - Genêro: ",generos[i]," - Nota: ",notas[i],"\n")					
		}
		escreva ("\nEscolha um aluno pela matricula:")
		leia (codigoAluno)
		
		para (inteiro i = 0; i < 39; i++)
		{
			se (codigoAluno == matriculas[i])
			{
				escreva("\nAluno Escolhido: ",alunos[i]," - Genêro: ",generos[i]," - Nota: ",notas[i],"\n")
			}
		}	
		escreva("\n")
		
	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 424; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */