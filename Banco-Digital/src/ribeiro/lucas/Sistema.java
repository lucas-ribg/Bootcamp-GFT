package ribeiro.lucas;

import ribeiro.lucas.models.Cliente;
import ribeiro.lucas.models.Conta;
import ribeiro.lucas.models.ContaCorrente;
import ribeiro.lucas.models.ContaPoupanca;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private Scanner scanner;
    private boolean executarSistema;
    private boolean executarBanco;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<ContaCorrente> contasCorrente = new ArrayList<>();
    private ArrayList<ContaPoupanca> contasPoupanca = new ArrayList<>();

    /**
     * Inicializa o sistema
     */
    public Sistema() {
        this.scanner = new Scanner(System.in);
        this.executarSistema = true;
        this.executarBanco = false;
    }

    /**
     * Executa o sistema
     */
    public void executar(){
        int opcaoConfig;
        while(executarSistema){
            imprimirConfiguracoes();
            opcaoConfig = Integer.parseInt(scanner.nextLine());
            configurar(opcaoConfig);
        }
    }

    /**
     * Imprimi as configurações do sistema
     */
    public void imprimirConfiguracoes(){
        System.out.println("+---------------------------------------------------+\n");
        System.out.println("|                   Configuraçoes                   |\n");
        System.out.println("+---------------------------------------------------+\n");
        System.out.println("Pressione 1 para cadastrar um cliente");
        System.out.println("Pressione 10 para visualizar os clientes");
        System.out.println("Pressione 2 para criar uma conta");
        System.out.println("Pressione 20 para visualizar as contas");
        System.out.println("Pressione 3 para prosseguir");
        System.out.println("Press 0 to exit settings");
    }

    /**
     * Realiza uma ação para a função escolhida na tela de configurações
     * @param opcaoConfig valor da opção escolhida
     */
    private void configurar(int opcaoConfig) {
        switch (opcaoConfig) {
            case 1:
                System.out.println("Informe o nome do cliente: ");
                String nome = scanner.nextLine();
                System.out.println("Informe a idade do cliente: ");
                int idade = Integer.parseInt(scanner.nextLine());
                System.out.println("Informe o CPF do cliente (apenas numeros): ");
                int cpf = Integer.parseInt(scanner.nextLine());
                System.out.println("Informe o RG do cliente (apenas numeros): ");
                int rg = Integer.parseInt(scanner.nextLine());
                clientes.add(new Cliente(nome, idade, cpf, rg));
                break;

            case 10:
                for (Cliente cliente : clientes) {
                    System.out.println(cliente.toString());
                }
                break;

            case 2:
                System.out.println("Informe o tipo de conta (1 - CC | 2 - CP): ");
                int tipoDeConta = Integer.parseInt((scanner.nextLine()));
                System.out.println("Informe o CPF do cliente (apenas numeros): ");
                int cpfConta = Integer.parseInt(scanner.nextLine());
                System.out.println("Informe o saldo inicial: ");
                double saldoInicial = Integer.parseInt(scanner.nextLine());
                for (Cliente cliente : clientes) {
                    if (cliente.getCpf() == cpfConta) {
                        if (tipoDeConta == 1) {
                            contasCorrente.add(new ContaCorrente(cliente, saldoInicial));
                        }
                        if (tipoDeConta == 2) {
                            contasPoupanca.add(new ContaPoupanca(cliente, saldoInicial));
                        }
                    }
                    break;
                }
                System.out.println("Cliente nao encontrado");
                break;

            case 20:
                System.out.println("\nContas Correntes:\n");
                for (ContaCorrente conta : contasCorrente) {
                    System.out.println(conta.toString());
                }
                System.out.println("\nContas Poupancas:\n");
                for (ContaPoupanca conta : contasPoupanca) {
                    System.out.println(conta.toString());
                }
                break;

            case 3:
                this.executarSistema = false;
                this.executarBanco = true;
                operar();
                break;

            case 0:
                this.executarSistema = false;
                System.out.println("Obrigado pela preferencia! ^_^");
                break;

            default:
                System.out.println("Comando nao reconhecido");
        }
    }

    /**
     * Executa o serviços banco
     */
    public void operar() {
        int opcaoBanco;
        while(executarBanco) {
            imprimirMenu();
            opcaoBanco = Integer.parseInt(scanner.nextLine());
            realizarTransacoes(opcaoBanco);
        }
    }

    /**
     * Imprimi o menu
     */
    public static void imprimirMenu(){
        System.out.println("+---------------------------------------------------+\n");
        System.out.println("|               Bem vindo ao GFT Bank!              |\n");
        System.out.println("+---------------------------------------------------+\n");
        System.out.println("Pressione 1 para sacar");
        System.out.println("Pressione 2 para depositar");
        System.out.println("Pressione 3 para transferir");
        System.out.println("Pressione 4 para consultar saldo");
        System.out.println("Pressione 5 para imprimir extrato");
        System.out.println("Pressione 6 para ir para configurações");
        System.out.println("Pressione 7 para sair");
    }


    /**
     * Executa as transacoes do banco
     */
    public void realizarTransacoes(int opcaoBanco){
        switch (opcaoBanco) {
            case 1:
                System.out.println("Informe o CPF do cliente (apenas numeros): ");
                int cpfSaque = Integer.parseInt(scanner.nextLine());
                System.out.println("Informe o tipo de conta (1 - CC | 2 - CP): ");
                int tipoDeContaSaque = Integer.parseInt(scanner.nextLine());
                System.out.println("Informe o do saque: ");
                double valorSaque = Integer.parseInt(scanner.nextLine());
                Conta contaSaque = acharConta(cpfSaque, tipoDeContaSaque).get(0);
                contaSaque.sacar(valorSaque);
                break;

            case 2:
                System.out.println("Informe o CPF do cliente (apenas numeros): ");
                int cpfDeposito = Integer.parseInt(scanner.nextLine());
                System.out.println("Informe o tipo de conta (1 - CC | 2 - CP): ");
                int tipoDeContaDeposito = Integer.parseInt(scanner.nextLine());
                System.out.println("Informe o valor do deposito: ");
                double valorDeposito = Integer.parseInt(scanner.nextLine());
                Conta contaDeposito = acharConta(cpfDeposito, tipoDeContaDeposito).get(0);
                contaDeposito.depositar(valorDeposito);
                break;

            case 3:
                System.out.println("Informe o CPF do cliente (apenas numeros): ");
                int cpfPagador = Integer.parseInt(scanner.nextLine());
                System.out.println("Informe o tipo de conta (1 - CC | 2 - CP): ");
                int tipoDeContaPagador = Integer.parseInt(scanner.nextLine());
                System.out.println("Informe o CPF do destinatario (apenas numeros): ");
                int cpfDestinatario = Integer.parseInt(scanner.nextLine());
                System.out.println("Informe o tipo de conta do destinatario (1 - CC | 2 - CP): ");
                int tipoDeContaDestinatario = Integer.parseInt(scanner.nextLine());
                System.out.println("Informe o valor da transcao: ");
                double valorTransacao = Integer.parseInt(scanner.nextLine());
                Conta contaPagador = acharConta(cpfPagador, tipoDeContaPagador).get(0);
                Conta contaDestinatario = acharConta(cpfDestinatario, tipoDeContaDestinatario).get(0);
                contaPagador.transferir(contaDestinatario, valorTransacao);

            case 4:
                System.out.println("Informe o CPF do cliente (apenas numeros): ");
                int cpfSaldo = Integer.parseInt(scanner.nextLine());
                System.out.println("Informe o tipo de conta (1 - CC | 2 - CP): ");
                int tipoDeContaSaldo = Integer.parseInt(scanner.nextLine());
                Conta contaSaldo = acharConta(cpfSaldo, tipoDeContaSaldo).get(0);
                System.out.printf("\nSeu saldo é de: %d", contaSaldo.getSaldo());
                break;

            case 5:
                System.out.println("Informe o CPF do cliente (apenas numeros): ");
                int cpfExtrato = Integer.parseInt(scanner.nextLine());
                System.out.println("Informe o tipo de conta (1 - CC | 2 - CP): ");
                int tipoDeContaExtrato = Integer.parseInt(scanner.nextLine());
                Conta contaExtrato = acharConta(cpfExtrato, tipoDeContaExtrato).get(0);
                for (int i=0; i<contaExtrato.getOperacoes().size(); i++){
                    System.out.println(contaExtrato.getOperacoes().get(i));
                }
                break;

            case 6:
                this.executarBanco = false;
                this.executarSistema = true;
                executar();

            case 7:
                this.executarBanco = false;
                System.out.println("Obrigado pela preferencia! ^_^");
                break;

            default:
                System.out.println("Comando nao reconhecido");
        }
    }

    /**
     * Acha a conta do cliente d partir do cpf e do tipo de conta
     * @param cpf           cpf do titular da conta
     * @param tipoDeConta   tipo da conta
     * @return um array com uma conta ou vazio caso não ache a conta
     */
    private ArrayList<Conta> acharConta (int cpf, int tipoDeConta) {
        ArrayList<Conta> aux = new ArrayList<>();
        if (tipoDeConta == 1) {
            for (ContaCorrente conta : contasCorrente) {
                if (conta.getTitular().getCpf() == cpf) {
                    aux.add(conta);
                }
            }
        }
        if (tipoDeConta == 2) {
            for (ContaPoupanca conta : contasPoupanca) {
                if (conta.getTitular().getCpf() == cpf) {
                    aux.add(conta);
                }
            }
        }
        return aux;
    }
}
