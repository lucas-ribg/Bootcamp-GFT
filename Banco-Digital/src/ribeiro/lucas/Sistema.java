package ribeiro.lucas;

public class Sistema {



    /**
     * Imprime na tela o valor do saldo
     */
    public void imprimirSaldo() {
        System.out.printf("\nSeu saldo é de: %d", this.saldo);
    }

    /**
     * Imprimi o extrato da conta do cliente
     */
    public void imprimirExtrato() {
        for (int i=0; i<this.operacoes.size(); i++){
            System.out.println(this.operacoes.get(i));
        }
    }
}
