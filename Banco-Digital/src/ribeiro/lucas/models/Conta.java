package ribeiro.lucas.models;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

/**
 * Classe que representa o modelo básico de uma conta
 */
public abstract class Conta {

    protected final int agencia;
    protected final int numero;
    protected final Cliente titular;
    protected final LocalDateTime dataDeAbertura;
    protected double saldo;
    protected List operacoes = new ArrayList();

    //Construtores

    /**
     * Cria uma conta com um saldo existente
     * @param agencia   número da agência
     * @param numero    número da conta
     * @param titular   cliente titular
     * @param saldo     saldo da conta
     */
    public Conta(int agencia, int numero, Cliente titular, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.dataDeAbertura = LocalDateTime.now();
    }

    /**
     * Cria uma conta
     * @param agencia   número da agência
     * @param numero    número da conta
     * @param titular   cliente titular
     */
    public Conta(int agencia, int numero, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.dataDeAbertura = LocalDateTime.now();
    }

    //Ações

    /**
     * Realiza um depósito na conta
     * @param valor     valor do depósito
     * @return          retorna true se realizado e false se não realizado
     */
    public boolean depositar(double valor) {
        this.saldo += valor;
        this.operacoes.add("Depósito de R$ "+valor+" - "+LocalDateTime.now());
        return true;
    }

    /**
     * Realiza um saque da conta
     * @param valor  valor do saque
     * @return       retorna true se realizado e false se não realizado
     */
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            this.operacoes.add("Saque de R$ "+valor+" - "+LocalDateTime.now());
            return true;
        } else {
            return false;
        }
    }

    /**
     * Transferi um valor de uma conta para outra
     * @param conta conta para qual o valor será transferido
     * @param valor valor da transferência
     * @return      retorna true se realizado e false se não realizado
     */
    public boolean transferir(Conta conta, double valor) {
        if (this.sacar(valor)) {
            conta.depositar(valor);
            this.operacoes.add("^ Transferência para "+conta.titular.getNome());
            return true;
        } else {
            return false;
        }
    }

    //Getters

    /**
     * Retorna o saldo
     * @return saldo da conta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @return agencia da conta
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @return número da conta
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return titular da conta
     */
    public Cliente getTitular() {
        return titular;
    }

    /**
     * @return operações realizadas na conta
     */
    public List getOperacoes() {
        return operacoes;
    }

    /**
     * @return data de abertura da conta
     */
    public LocalDateTime getDataDeAbertura() {
        return dataDeAbertura;
    }
}
