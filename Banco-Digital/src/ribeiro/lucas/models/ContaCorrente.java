package ribeiro.lucas.models;

public class ContaCorrente extends Conta {

    /**
     * Cria uma conta com um saldo existente
     *
     * @param titular cliente titular
     * @param saldo   saldo da conta
     */
    public ContaCorrente(Cliente titular, double saldo) {
        super(titular, saldo);
    }

    /**
     * Cria uma conta
     *
     * @param titular cliente titular
     */
    public ContaCorrente(Cliente titular) {
        super(titular);
    }
}
