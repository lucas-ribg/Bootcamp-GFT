package ribeiro.lucas.models;

/**
 * Representa o cliente
 */
public class Cliente {

    private final String nome;
    private final int idade;
    private final String cpf;
    private final String rg;

    /**
     * Cadastra um novo cliente
     * @param nome      nome do cliente
     * @param idade     idade do cliente
     * @param cpf       cpf do cliente
     * @param rg        rg dp cliente
     */
    public Cliente(String nome, int idade, String cpf, String rg) {
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
    public String getCpf() {
        return cpf;
    }

    /**
     * @return rg do cliente
     */
    public String getRg() {
        return rg;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf=" + cpf +
                ", rg=" + rg +
                '}';
    }
}