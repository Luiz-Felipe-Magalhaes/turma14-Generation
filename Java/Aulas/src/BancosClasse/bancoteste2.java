package BancosClasse;

import java.util.Scanner;

public class bancoteste2 
{

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		char opcao, saida, tipoTransacao, aceiteEmprestimo,opconta;
		int numeroConta = 0, numOperacoes = 10, i = 0;
		Conta conta_pessoa1 = null;
		double valorTransacao = 0,valorEmprestimo=0.0;
		int qtdeTalao=0;
		String nome="",cpfConta="";
		
		System.out.println("BANCO CENTRAL");
		do{
			System.out.println("[1] - Abertura de conta: ");
			System.out.println("[2] - Acessar a uma conta existente: ");
			System.out.println("[3] - Excluir conta: ");
			System.out.println("[4] - Sair: ");
			System.out.print("Digite o numero de sua opção: ");
			opcao = leia.next().charAt(0);
			System.out.println();
			if (opcao == '1'){
				if(conta_pessoa1 != null) {
					System.out.println("VOCE JÁ POSSUI UMA CONTA. DESEJA EXCLUI-LA? SIM[S] NAO[N]");
					opconta = leia.next().toUpperCase().charAt(0);
					if(opconta == 'S'){
						conta_pessoa1 = null;
						System.out.println("CONTA EXCLUIDA COM SUCESSO\n");
					}
				}
				
				if(conta_pessoa1 == null) {
					System.out.println("[1] - Conta Poupança");
					System.out.println("[2] - Conta Corrente");
					System.out.println("[3] - Conta Especial");
					System.out.println("[4] - Conta Empresa");
					System.out.println("[5] - Conta Universitaria");
					System.out.print("Digite o numero de sua opção: ");
					opconta = leia.next().toUpperCase().charAt(0);
					if (opconta >48 && opconta<54)
					{
					System.out.println();
					numeroConta++;
					System.out.println("Digite seu nome:");
					leia.nextLine();
					nome = leia.nextLine();
					System.out.println("Digite o seu CPF:");
					cpfConta = leia.next();
					
					}
					switch (opconta){
						case '1':{
							conta_pessoa1 = novaPoupanca(numeroConta, nome, cpfConta);
							System.out.printf("Conta aberta com sucesso. Bem-vindo ao G7-Bank.\n");
						}
						break;	
						case '2':{
						
							conta_pessoa1 = novaCorrente(numeroConta, nome, cpfConta);
							System.out.printf("Conta aberta com sucesso. Bem-vindo ao G7-Bank.\n");
						}
						break;
						
						
						case '3':{
							conta_pessoa1 = novaEspecial(numeroConta, nome, cpfConta);
							System.out.printf("Conta aberta com sucesso. Bem-vindo ao G7-Bank.\n");
						}
						break;
						
						
						case '4':{
							conta_pessoa1 = novaEmpresa(numeroConta, nome, cpfConta);
							System.out.printf("Conta aberta com sucesso. Bem-vindo ao G7-Bank.\n");
						}
						break;
						case '5':{
							conta_pessoa1 = novaUniversitaria(numeroConta, nome, cpfConta);
							System.out.printf("Conta aberta com sucesso. Bem-vindo ao G7-Bank.\n");
						}
						break;
						default:
							System.out.println("\nOPCAO INVALIDA");
					}
				}
			}
			else if (opcao == '2'){
				if(conta_pessoa1 == null)
					System.out.println("VOCE AINDA NAO POSSUI UMA CONTA\n");
				else {
					System.out.println("Digite o numero da conta");
					int numConta = leia.nextInt();
					if(numConta == conta_pessoa1.getNumeroConta()) {
						if(conta_pessoa1.getTipoConta() == 1)
						{
						//	System.out.println("Seu saldo atual é "+conta_pessoa1.getSaldoConta()+" reais");
							do{
								System.out.println("Qual operacao deseja realizar? Credito ou Debito ou consultar saldo[C/D/S]");
								tipoTransacao = leia.next().toUpperCase().charAt(0);
								if(tipoTransacao != 'S') {
									System.out.printf("Informe o valor da transação: R$");
									valorTransacao = leia.nextDouble();
								}
								if(tipoTransacao == 'C')
									conta_pessoa1.FazerCredito(valorTransacao);
								else if(tipoTransacao == 'D')
									conta_pessoa1.FazerDebito(valorTransacao);
								else if(opcao == 'S')
									System.out.println("Seu saldo atual é "+conta_pessoa1.getSaldoConta()+" reais");
								else
									System.out.println("OPCAO INVALIDA");
							
								System.out.println("Continua S/N");
								saida = leia.next().toUpperCase().charAt(0);
								i++;
							}while(saida == 'S' && i < numOperacoes);
				
							System.out.println("Digite a data de hoje");
							int data = leia.nextInt();
							((Poupanca) conta_pessoa1).bonusPoupanca(data);
						}else if (conta_pessoa1.getTipoConta() == 2) {
							
							System.out.println("Seu saldo atual é "+conta_pessoa1.getSaldoConta()+" reais");
							do{
								
		                		System.out.printf("\nQual transação deseja realizar [C]Credito ou D[Débito]: ");
								tipoTransacao = leia.next().toUpperCase().charAt(0);
								System.out.printf("Informe o valor da transação: R$");
								valorTransacao = leia.nextDouble();
								
								if (tipoTransacao == 'C')
								{
									conta_pessoa1.FazerCredito(valorTransacao);
									
								}
								else if (tipoTransacao == 'D')
								{
									conta_pessoa1.FazerDebito(valorTransacao);
								}
								
								
								qtdeTalao = ((ContaCorrente) conta_pessoa1).talao(qtdeTalao);
											
								System.out.println("Continua S/N");
								saida = leia.next().toUpperCase().charAt(0);
								i++;
							}while(saida == 'S' && i < numOperacoes);

						}
						else if(conta_pessoa1.getTipoConta() == 3) {
							
																	
							do
							{	
								System.out.printf("Qual transação deseja realizar [C]Credito ou D[Débito]: ");
								tipoTransacao = leia.next().toUpperCase().charAt(0);
								System.out.printf("Informe o valor da transação: R$");
								valorTransacao = leia.nextDouble();
								
								if (tipoTransacao == 'C')
								{
									((ContaEspecial) conta_pessoa1).Credito(valorTransacao);
								}
								else if (tipoTransacao == 'D')
								{
									((ContaEspecial) conta_pessoa1).Debito(valorTransacao);
								}
								System.out.printf("Saldo Atual: R$%.2f\n",conta_pessoa1.getSaldoConta());
								System.out.printf("limite Atual: R$%.2f\n",((ContaEspecial) conta_pessoa1).getValorLimite());
								System.out.println("Continua S/N");
								saida = leia.next().toUpperCase().charAt(0);
								i++;
							}while(saida == 'S' && i < numOperacoes);
								
							
							
						//}
						
				
						}
						
						
						else if(conta_pessoa1.getTipoConta() == 4) {
							
							System.out.printf("\nSaldo atual: %.2f\n",conta_pessoa1.getSaldoConta());					
														
							do
							{	
								System.out.printf("Qual transação deseja realizar [C]Credito ou D[Débito]: ");
								tipoTransacao = leia.next().toUpperCase().charAt(0);
								System.out.printf("Informe o valor da transação: R$");
								valorTransacao = leia.nextDouble();
								
								if (tipoTransacao == 'C')
								{
									conta_pessoa1.FazerCredito(valorTransacao);
								}
								else if (tipoTransacao == 'D')
								{
									conta_pessoa1.FazerDebito(valorTransacao);
								}
								System.out.printf("\nVocê tem um limite de Emprestimo de: R$%.2f\nDeseja Solicitar S/N: ",((ContaEmpresa) conta_pessoa1).getEmprestimoEmpresa());
								aceiteEmprestimo = leia.next().toUpperCase().charAt(0);
								
								if (aceiteEmprestimo == 'S')
								{
									System.out.print("Digite o valor que deseja solicitar: R$");
									valorEmprestimo = leia.nextDouble();
									
									((ContaEmpresa) conta_pessoa1).FazerEmprestimo(valorEmprestimo);
								}
								System.out.println("Continua S/N");
								saida = leia.next().toUpperCase().charAt(0);
								i++;
							}while(saida == 'S' && i < numOperacoes);
							
							
						}
						
						
						else if(conta_pessoa1.getTipoConta() == 5) {
							
							//System.out.println("Seu saldo atual é "+conta_pessoa1.getSaldoConta()+" reais");
							do{
								System.out.printf("Saldo Atual: R$%.2f\n",conta_pessoa1.getSaldoConta());
								System.out.println("Qual operacao deseja realizar? Credito ou Debito ou consultar saldo[C/D/S]");
								tipoTransacao = leia.next().toUpperCase().charAt(0);
								if(tipoTransacao != 'S') {
									System.out.printf("Informe o valor da transação: R$");
									valorTransacao = leia.nextDouble();
								}
									
								if (tipoTransacao == 'C')
									((ContaUniversitaria) conta_pessoa1).Credito(valorTransacao);
								else if (tipoTransacao == 'D')
									((ContaUniversitaria) conta_pessoa1).Debito(valorTransacao);
								else if (tipoTransacao == 'S') {
									System.out.println("\nSaldo atual: " + conta_pessoa1.getSaldoConta() + 
											"\nValor Limite Disponível: " + ((ContaUniversitaria) conta_pessoa1).getLimite()
											+ "\nValor Limite Universitário Disponível: " + ((ContaUniversitaria) conta_pessoa1).getLimiteUniversitario());
								}else {
									System.out.println("OPCAO INVALIDA");
								}
								
								System.out.println("Continua S/N");
								saida = leia.next().toUpperCase().charAt(0);
								i++;
							}while(saida == 'S' && i < numOperacoes);
						}
						
					}else
						System.out.println("CONTA INEXISTENTE");
				}
			}else if (opcao == '3'){
				conta_pessoa1 = null;
				System.out.println("CONTA EXCLUIDA COM SUCESSO");
			}else if (opcao == '4'){
				System.out.println("OBRIGADO PELA PREFERENCIA. VOLTE SEMPRE");
			}
				
		} while(opcao != '4');

	}

	public static Poupanca novaPoupanca(int numeroConta, String nome, String cpf) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a data de aniversario da conta: ");
		int dataAniversario = leia.nextInt();
		
		Poupanca contaNova = new Poupanca(numeroConta, nome, cpf, dataAniversario);
		System.out.printf("\nTITULAR: %s\nCONTA: %d\nCPF: %s\nANIVERSARIO %d\n", contaNova.getNome(),numeroConta, contaNova.getCpf(),
				contaNova.getDataAniversario());
		return contaNova;
	}

	public static ContaCorrente novaCorrente(int numeroConta, String nome, String cpf) {
		Scanner leia = new Scanner(System.in);
		ContaCorrente contaNova = new ContaCorrente(numeroConta, nome, cpf);
		System.out.printf("\nTITULAR: %s\nCONTA: %d\nCPF: %s\nNUMERO DE TALÕES DISPONIVEIS %d\n", contaNova.getNome(), numeroConta,
				contaNova.getCpf(), contaNova.getTalao());
		return contaNova;
	}

	public static ContaEspecial novaEspecial(int numeroConta, String nome, String cpf) {
		Scanner leia = new Scanner(System.in);
		ContaEspecial contaNova = new ContaEspecial(numeroConta, nome, cpf, 1000);
		System.out.printf("\nTITULAR: %s\nCONTA: %d\nCPF: %s\nLIMITE  %.2f\n", contaNova.getNome(), numeroConta, contaNova.getCpf(),
				contaNova.getValorLimite());
		return contaNova;
	}

	public static ContaEmpresa novaEmpresa(int numeroConta, String nome, String cpf) {
		Scanner leia = new Scanner(System.in);
		ContaEmpresa contaNova = new ContaEmpresa(nome, numeroConta, cpf, 10000.00);
		System.out.printf("\nTITULAR: %s\nCONTA: %d\nCPF: %s\nLIMITE DE EMPRÉSTIMO %.2f\n", contaNova.getNome(), numeroConta,
				contaNova.getCpf(), contaNova.getEmprestimoEmpresa());
		return contaNova;
	}

	public static ContaUniversitaria novaUniversitaria(int numeroConta, String nome, String cpf) {

		ContaUniversitaria contaNova = new ContaUniversitaria(numeroConta, nome, cpf, 1000, 1000);
		System.out.printf("\nTITULAR: %s\nCONTA: %d\nCPF: %s\nLIMITE: %.2f\nLIMITE UNIVERSITARIO: %.2f\n\n", contaNova.getNome(), numeroConta,
				contaNova.getCpf(), contaNova.getLimite(), contaNova.getLimiteUniversitario());

		return contaNova;
	}

}
