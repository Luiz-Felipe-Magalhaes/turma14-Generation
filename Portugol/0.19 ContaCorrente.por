programa
{

    funcao inicio()
    {
        real movimentacoes[10]                           
        cadeia numeroConta = "00001", cpf = "12345" ,talaoCheque = "T-00" 
        real saldo = 0.0
        caracter tipoTransicao, aceiteTalaoCheque
        inteiro codigoTalao = 0

        escreva ("BEM-VINDO AO G7 BANK\n\n")

        escreva ("Conta-Corrente:",numeroConta,"\nCPF do Titular:",cpf,"\nSaldo: R$:",saldo,"\n\n")
        para (inteiro i = 0; i < 2; i++)
        {
            escreva("\nQual transação deseja realizar [C]Credito ou D[Débito]: ")
            leia (tipoTransicao)
                se (tipoTransicao == 'C' ou tipoTransicao=='c')
                {
                    escreva("Informe o valor da transação: R$")
                    leia (movimentacoes[i])
                    saldo+=movimentacoes[i]
                }
                senao se (tipoTransicao =='D' ou tipoTransicao =='d')
                {
                    escreva("Informe o valor da transação: R$")
                    leia (movimentacoes[i])
                    saldo-=movimentacoes[i]
                    

                }  se (saldo < = 0)
                 {
                    escreva ("Você nao possui saldo suficiente \n")
                }
      
             escreva ("Você possui talão de cheque disponivel : ",talaoCheque,codigoTalao,"\nDeseja solicitar [S]Sim ou [N]Não: ")
        leia (aceiteTalaoCheque)
        se (aceiteTalaoCheque == 'S' ou aceiteTalaoCheque == 's')
        {

            escreva("Seu novo codigo de talao de cheque é :", talaoCheque,codigoTalao++, "\n")
        }




    }
      escreva("\nOBRIGADO POR UTILIZAR O G7 BANK")
}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1140; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */