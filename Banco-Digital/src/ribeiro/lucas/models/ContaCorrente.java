package ribeiro.lucas.models;

public class ContaCorrente extends Conta {

    /**
     * Cria uma conta com um saldo existente
     *
     * @param agencia número da agência
     * @param numero  número da conta
     * @param titular cliente titular
     * @param saldo   saldo da conta
     */
    public ContaCorrente(int agencia, int numero, Cliente titular, double saldo) {
        super(agencia, numero, titular, saldo);
    }

    /**
     * Cria uma conta
     *
     * @param agencia número da agência
     * @param numero  número da conta
     * @param titular cliente titular
     */
    public ContaCorrente(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }
}
