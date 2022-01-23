package ribeiro.lucas.models;

import java.time.LocalDateTime;

public class ContaPoupanca extends Conta{
    /**
     * Cria uma conta com um saldo existente
     *
     * @param agencia número da agência
     * @param numero  número da conta
     * @param titular cliente titular
     * @param saldo   saldo da conta
     */
    public ContaPoupanca(int agencia, int numero, Cliente titular, double saldo) {
        super(agencia, numero, titular, saldo);
    }

    /**
     * Cria uma conta
     *
     * @param agencia número da agência
     * @param numero  número da conta
     * @param titular cliente titular
     */
    public ContaPoupanca(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    /**
     * Faz o rendimento da conta mensalmente dia 1
     * @param rendimento valor do rendimento da conta
     */
    public void render(double rendimento) {
        if (this.saldo > 0.00 && LocalDateTime.now().getDayOfMonth() == 1) {
            this.saldo *= (1+rendimento);
        }
    }
}
