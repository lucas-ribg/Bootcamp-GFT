package ribeiro.lucas.models;

/**
 * Representa o cliente
 */
public class Cliente {

    private final String nome;
    private final int idade;
    private final int cpf;
    private final int rg;

    /**
     * Cadastra um novo cliente
     * @param nome      nome do cliente
     * @param idade     idade do cliente
     * @param cpf       cpf do cliente
     * @param rg        rg dp cliente
     */
    public Cliente(String nome, int idade, int cpf, int rg) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
    }

    /**
     * @return nome do cliente
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return idade do cliente
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @return cpf do cliente
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @return rg do cliente
     */
    public int getRg() {
        return rg;
    }
}