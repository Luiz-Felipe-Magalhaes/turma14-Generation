package BancosClasse;

import java.util.Scanner;

public class ContaCorrente extends Conta
{
	private int qtdTalao;
    private int talao = 3;
    private int totalTalao;
    public ContaCorrente(int numeroConta, String cpf) {
        super(numeroConta, cpf);
    }
    public int getQtdTalao() {
        return qtdTalao;
    }
    public void setQtdTalao(int qtdTalao) {
        this.qtdTalao = qtdTalao;
    }
    public int getTalao() {
        return talao;
    }
    public int getTotalTalao() {
        return totalTalao;
    }
    public void talao(int talao, int qtdTalao) {
        char opcao;
        
            Scanner leia = new Scanner(System.in);
            System.out.print("Voc� deseja imprimir tal�o S/N: ");
            opcao = leia.next().toUpperCase().charAt(0);
            //while (opcao != 'S' && opcao != 'N') {
              //  System.out.println("\nOp��o inv�lida. Deseja continuar? S/N");
               // opcao = leia.next().toUpperCase().charAt(0);
           // }
            if (opcao == 'S') {
                System.out.println("Digite a quantidade que deseja: (At� 3 tal�es por m�s)");
                qtdTalao = leia.nextInt();
                while (qtdTalao < 0 || qtdTalao > 3) {
                    System.out.printf("\nQuantidade inv�lida. Voc� pode resgatar at� %d tal�es\nDigite a quantidade:", talao);
                    qtdTalao = leia.nextInt();
                }
                while (qtdTalao > talao) {
                    System.out.printf("Erro! Quantidade dispon�vel: %d. Digite a quantidade:", talao);
                    qtdTalao = leia.nextInt();
                }
                talao = talao - qtdTalao;
                totalTalao = totalTalao + qtdTalao;
                if (talao == 0) {
                    talao = 3;
                }
                System.out.printf("Quantidade di�ria impressa: %d\n", qtdTalao);
                System.out.printf("Quantidade total impressa: %d\n", totalTalao);
               // System.out.println("Deseja continuar? \n[S]-Sim \n[N]-N�o");
              //  opcao = leia.next().toUpperCase().charAt(0);
            }
      
    }
}
